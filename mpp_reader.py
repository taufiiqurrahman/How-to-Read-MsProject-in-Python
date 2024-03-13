import jpype
import mpxj
import pandas as pd;

def read_mpp(file: str) ->list :
    """
    Reads Microsoft Project file (.mpp) and returns a list of task attributes.
    
    Parameters:
    - file (str): Path to the .mpp file to be read.
    
    Returns:
    - list: A list of dictionaries, each containing task attributes.
    """
    try:
        # Initialize the JVM
        if not jpype.isJVMStarted():
            jvmPath = jpype.getDefaultJVMPath()
            jpype.startJVM("-Dlog4j2.loggerContextFactory=org.apache.logging.log4j.simple.SimpleLoggerContextFactory")

        if not  jpype.java.lang.Thread.isAttached():
            jpype.attachThreadToJVM()
            jpype.java.lang.Thread.currentThread().\
         setContextClassLoader(jpype.java.lang.ClassLoader.getSystemClassLoader())
            
    except Exception as e:
        print(e)
    
    # Import MPXJ classes   
    from net.sf.mpxj.reader import UniversalProjectReader

    # Read the project file
    project = UniversalProjectReader().read(file)

    result =[]
    tasks = project.getTasks()
    
    for task in tasks:
        name = task.getName()
        uniqueId = task.getUniqueID()
        # Extract task attributes
        tempData = {
            'id': task.getID().toString(),
            'name': task.getName(),
            'duration': task.getDuration().toString(),
            'cost': task.getCost().toString(),
            'start': task.getStart().toString(),
            'finish': task.getFinish().toString(),
            'percentageComplete': task.getPercentageComplete().toString(),
            'actualDuration': task.getActualDuration().toString(),
            'remainingDuration': task.getRemainingDuration().toString(),
            'work': task.getWork().toString(),
            'actualWork': task.getActualWork().toString(),
            'remainingWork': task.getRemainingWork().toString(),
            'actualCost': task.getActualCost().toString(),
            'remainingCost': task.getRemainingCost().toString(),
            'fixedCost': task.getFixedCost().toString(),
            'fixedCostAccrual': task.getFixedCostAccrual().toString(),
            'constraintType': task.getConstraintType().toString(),
            'notes': task.getNotes(),
            'outlineLevel': task.getOutlineLevel().toString(),
            'outlineNumber': task.getOutlineNumber(),
            'wbs': task.getWBS(),
            "predecessors": task.getPredecessors().toString(),
            "uniqueID": task.getUniqueID().toString(),
            "priority": task.getPriority().toString(),
            "successors": task.getSuccessors().toString()
        }
        current_index = len(result)
        print(f"{current_index + 1} . {name}")
        result.append(tempData)
    return result;
    jpype.shutdownJVM()

def read_list_mpp(list):
    """
    Reads multiple Microsoft Project files (.mpp) and returns their tasks.
    
    Parameters:
    - list (list): A list of paths to .mpp files to be read.
    
    Returns:
    - list: A list of lists, each containing the tasks of one project.
    """
    data =[]
    for l in list:
        print('--------------')
        print(f'hasil {l}')
        print('--------------')
        print('Path File:', l)
        tempData = read_mpp(l);
        data.append(tempData)
        file = 'Relocation VLP Compressor Nilam Satelite 6 to Mutiara 6 Station_Updated 18042023.mpp'
        print('File name:', file)
    return data;   

# Example Usage
data = read_list_mpp([
    'Project1.mpp', 
    'Relocation VLP Compressor Nilam Satelite 6 to Mutiara 6 Station_Updated 18042023.mpp'
])
result = read_mpp('Project1.mpp')
print()

# Convert result to DataFrame and print
df = pd.DataFrame(result).astype(str)
print(df)
print()

# Convert each project's tasks to DataFrame and print
for dt in data:
    dfd = pd.DataFrame(dt)
    print(dfd)
