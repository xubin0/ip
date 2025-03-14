# User Guide for Xb

## Introduction

 Welcome to Xb, your task management application! This program helps you to manage your tasks efficiently. Xb supports various commands such as adding tasks, deleting tasks, marking tasks as done, and more. You can interact with Xb through a simple command-line interface (CLI).

## Setting Up the Application

### Prerequisites
    •    JDK 17 (required for compiling and running the project)
    •    IntelliJ IDEA (or another Java IDE of your choice)

### Steps to Set Up the Project in IntelliJ IDEA:
    1.    Install JDK 17: Ensure that you have JDK 17 installed. If not, you can download it from here.
    2.    Open the Project in IntelliJ IDEA:
    •    Open IntelliJ IDEA and click File > Close Project if you have an existing project open.
    •    Select Open, navigate to your project directory, and select it.
    •    Accept the default settings when prompted.
    3.    Set JDK to 17:
    •    Go to File > Project Structure.
    •    Under Project Settings > Project, set the Project SDK to JDK 17.
    •    Set the Project language level to SDK default.
    4.    Run the Application:
    •    Open the src/main/java/Xb.java file.
    •    Right-click and select Run Xb.main().
    •    If everything is set up correctly, you should see the following output:
    
Created directory: ./data
Created file: ./data/Xb.txt
Hello, I am xb!
What is your name?



## Features

### 1. Adding Tasks

Xb allows you to add three types of tasks: Todo, Deadline, and Event.
    •    Todo Task:
Command format: TODO <task_description>
Example: TODO Read a book
This adds a new task of type Todo with the description Read a book.
    •    Deadline Task:
Command format: DEADLINE <task_description> /by <deadline_date>
Example: DEADLINE Submit report /by 2022-12-31
This adds a new task of type Deadline with the description Submit report and a deadline on 2022-12-31.
    •    Event Task:
Command format: EVENT <task_description> /from <start_time> /to <end_time>
Example: EVENT Team meeting /from 2022-11-01 10:00 /to 2022-11-01 12:00
This adds a new task of type Event with the description Team meeting and a duration from 10:00 to 12:00 on 2022-11-01.

### 2. Listing Tasks

Command format: LIST
This command will display all tasks currently in the list.

### 3. Marking a Task as Done

Command format: MARK <task_number>
This command marks the task with the specified task number as done.

### 4. Unmarking a Task

Command format: UNMARK <task_number>
This command marks the task with the specified task number as undone.

### 5. Deleting a Task

Command format: DELETE <task_number>
This command deletes the task with the specified task number from the list.

### 6. Renaming a Task

Command format: RENAME <task_number> <new_task_name>
This command renames the task with the specified task number to the new name.

### 7. Finding Tasks by Keyword

Command format: FIND <keyword>
This command will search for tasks containing the word report in their description and display them.

### 8. Exiting the Application

Command format: BYE
This command will exit the application with a farewell message.

⸻

## Application Structure

Here’s a brief overview of the main classes and their responsibilities in the project:

### 1. Xb.java
    •    The main entry point of the program.
    •    Initializes the application, handles user inputs, and runs the application loop.

### 2. Command Classes

The commands (MarkCommand, UnmarkCommand, TodoCommand, etc.) are responsible for processing specific user commands like marking tasks as done, renaming tasks, or adding tasks to the task list. Each command implements the Command interface, which has an execute method.

### 3. Task Classes
    •    Task: Abstract class representing a task.
    •    Todo, Deadline, Event: Classes representing specific types of tasks.

### 4. TaskList

Handles all tasks. It allows adding, removing, marking tasks, and searching tasks based on keywords.

### 5. XbException

Custom exception class used to handle invalid commands and provide appropriate error messages.

### 6. FileHandler

Handles file operations like loading tasks from a file and saving them back. This ensures tasks are persistent even after the program is closed.

⸻

## Troubleshooting

### Common Issues
    1.    JDK Not Found: Make sure JDK 17 is installed correctly and set as the project SDK.
    2.    File Not Found: If the program can’t find the data file (Xb.txt), make sure the directory is created (./data) and the file is initialized correctly.
    3.    Invalid Command Format: Ensure that the correct command format is used, e.g., TODO <task_description> or DEADLINE <task_description> /by <deadline_date>.

⸻

## Conclusion

This user guide should help you get started with Xb and use its features for managing tasks. If you encounter any issues or need further help, feel free to check the source code or refer to the documentation for additional information.
