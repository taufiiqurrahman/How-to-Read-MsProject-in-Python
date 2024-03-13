FROM python:3.12-slim

# Install JDK
COPY jdk-21/ /jdk-21/

# Set JAVA_HOME environment variable
ENV JAVA_HOME="/jdk-21"

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install any needed packages specified in requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Make port 3000 available to the world outside this container
EXPOSE 3000

# Run app.py when the container launches
CMD ["python", "app.py"]