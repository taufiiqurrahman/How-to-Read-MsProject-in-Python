### README for MS Project Reader Script

This script provides a convenient way to read tasks from Microsoft Project files (.mpp) using Python, leveraging the `jpype` package for Java integration and `mpxj` for handling .mpp files. The script can read individual .mpp files or multiple files in one go, extracting various task attributes and presenting them in a structured format. This guide will walk you through setting up the environment, using the script, and understanding its output.

#### Prerequisites

- Python 3.x installed
- `jpype1`, `mpxj`, and `pandas` Python packages installed
- Java Runtime Environment (JRE) or Java Development Kit (JDK) installed

#### Installation

1. Ensure Python and Java are installed on your system.
2. Install the required Python packages using pip:

```sh
pip install jpype1 mpxj pandas
```

#### Usage

1. **Single .mpp File Reading:**

To read a single Microsoft Project file, use the `read_mpp` function. This function takes the file path of the .mpp file as an argument and returns a list of dictionaries, with each dictionary containing attributes of a task from the project file.

Example:
```python
result = read_mpp('path_to_your_project_file.mpp')
```

2. **Multiple .mpp Files Reading:**

To read multiple Microsoft Project files at once, use the `read_list_mpp` function. This function takes a list of file paths of the .mpp files to be read and returns a list of lists, with each inner list containing the tasks of one project.

Example:
```python
data = read_list_mpp([
    'path_to_project1.mpp', 
    'path_to_project2.mpp'
])
```

3. **Converting Results to DataFrame:**

The script uses `pandas` to facilitate the conversion of task lists into DataFrame objects for easier manipulation and analysis. After obtaining the results from either `read_mpp` or `read_list_mpp`, you can convert these to DataFrames.

Example:
```python
import pandas as pd

df = pd.DataFrame(result)  # For single project
print(df)
```

#### Output Explanation

The script outputs task attributes in a structured format, either printed directly to the console or as a DataFrame. Here are some key attributes included in the output:

- `id`: Task ID.
- `name`: Task name.
- `duration`: Task duration.
- `cost`: Task cost.
- `start`: Task start date.
- `finish`: Task finish date.
- `percentageComplete`: Percentage of the task completed.
- `actualDuration`: Actual duration of the task.
- `remainingDuration`: Remaining duration of the task.
- `work`: Work associated with the task.
- `actualWork`: Actual work done on the task.
- `remainingWork`: Remaining work for the task.
- `actualCost`: Actual cost incurred for the task.
- `remainingCost`: Remaining cost for the task.
- `fixedCost`: Fixed cost associated with the task.
- `fixedCostAccrual`: Fixed cost accrual method.
- `constraintType`: Type of constraint applied to the task.
- `notes`: Notes associated with the task.
- `outlineLevel`: Outline level of the task.
- `outlineNumber`: Outline number of the task.
- `wbs`: Work Breakdown Structure identifier.
- `predecessors`: Task predecessors.
- `uniqueID`: Unique identifier for the task.
- `priority`: Task priority.
- `successors`: Task successors.

#### Troubleshooting

- Ensure the Java environment is correctly set up and accessible from Python.
- Verify that all required packages (`jpype1`, `mpxj`, and `pandas`) are installed.
- Check the paths to the .mpp files to ensure they are correct and accessible.

This script offers a powerful way to programmatically access and analyze the details of projects managed in Microsoft Project, facilitating automation, reporting, and integration with Python-based data analysis tools.