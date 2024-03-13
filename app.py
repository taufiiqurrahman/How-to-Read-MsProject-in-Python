import os
from flask import Flask, request, jsonify
from flask_restful import Resource, Api
from werkzeug.utils import secure_filename
from mpp_reader import read_mpp

UPLOAD_FOLDER = 'files'
ALLOWED_EXTENSIONS = {'mpp'}

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER

api = Api(app)

def convert_to_serializable(data):
    """
    Recursively convert data types not serializable by default json encoder
    into serializable types. This is a simple approach and might need adjustments.
    """
    if isinstance(data, dict):
        return {key: convert_to_serializable(value) for key, value in data.items()}
    elif isinstance(data, list):
        return [convert_to_serializable(item) for item in data]
    elif hasattr(data, '__dict__'):  # Attempt to serialize objects with __dict__ attribute
        return convert_to_serializable(data.__dict__)
    else:
        return str(data)  # Fallback to a string representation

class FileHandler(Resource):

    def allowed_file(self, filename):
        """Check if the filename has an allowed extension."""
        return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS
    
    def post(self):
        """Handle file upload and conversion."""
        if 'file' not in request.files:
            return 'No file part'
        
        file = request.files.get("file")
        if file and self.allowed_file(file.filename):
            filename = secure_filename(file.filename)
            if not os.path.exists(app.config['UPLOAD_FOLDER']):
                os.makedirs(app.config['UPLOAD_FOLDER'])
            file_path = os.path.join(app.config['UPLOAD_FOLDER'], filename)
            file.save(file_path)
            
            result = read_mpp(file_path)
            if result is not None:
                serializable_result = convert_to_serializable(result)
                return jsonify(serializable_result)
            return 'File uploaded successfully'
        else:
            return 'File not allowed'

api.add_resource(FileHandler, "/")

if __name__ == "__main__":
    app.run(debug=True)

