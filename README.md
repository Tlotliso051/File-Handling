File handling is a fundamental aspect of programming, essential for tasks such as data storage, configuration management, and logging. In Java, the java.io package provides classes for working with files and streams. This project aims to illustrate the basic concepts of file handling using simple examples.

File Handling Operations
1. Creating a File
The createFile method creates a new file if it does not already exist at the specified path. If the file already exists, it prints a message indicating its availability.

2. Writing to a File
The writeToFile method writes a predefined text to the file created earlier. It uses a FileWriter to write the content to the file.

3. Reading from a File
The readFromFile method reads the content of the file and prints it to the console. It uses a Scanner to read the file line by line and simulates a delay in reading with a sleep function, demonstrating a simple example of file reading with a time delay.

Usage
This project serves as an educational resource for beginners learning Java file handling concepts. By examining the provided code and running the program, users can grasp the following:

How to create a new file in Java.
How to write content to a file using FileWriter.
How to read content from a file using Scanner.
Basic exception handling practices for file operations.
Prerequisites
To run this project, ensure you have the following installed on your system:

Java Development Kit (JDK) version 8 or higher.
A Java Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or any text editor of your choice.
Running the Program
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/Tlotliso051/java-file-handling.git
Open the project in your preferred IDE or text editor.

Run the Main.java file located in the src directory.

Check the console output for messages regarding file creation, writing, and reading operations.

