# Grading System

A simple Java-based console application for managing student grades and subjects. This program allows you to add students, assign subjects and grades, view student lists, and manage academic records.

## Features

- **Add Students & Grades**: Insert new students with their subjects and grades
- **View Student List**: Display all registered students and their grades
- **Delete Students**: Remove students from the system
- **User-Friendly Menu**: Simple console-based interface for easy navigation

## System Requirements

- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (optional, but recommended for development)
- Apache Ant (for building from the command line)

## Installation & Setup

### Using NetBeans:
1. Open NetBeans IDE
2. Go to **File > Open Project**
3. Navigate to the `gradingsystem` folder
4. Click **Open Project**

### Using Command Line:
1. Navigate to the project directory:
   ```bash
   cd gradingsystem
   ```
2. Build the project using Ant:
   ```bash
   ant build
   ```

## Running the Application

### Using NetBeans:
- Right-click on the project and select **Run**

### Using Command Line:
```bash
ant run
```

Or run the compiled class directly:
```bash
java -cp build/classes gradingsystem.Gradingsystem
```

## Usage

Once the application is running, you'll see a menu with the following options:

```
--------Welcome to Grading System--------
1, Insert Student & Subject
2, View Student [List]
3, Delete Student
4, Exit
------------------------------------------
```

### Menu Options:

1. **Insert Student & Subject**: Add a new student and assign subjects with grades
2. **View Student [List]**: Display all students and their academic records
3. **Delete Student**: Remove a student from the system
4. **Exit**: Close the application

## Project Structure

```
gradingsystem/
├── src/
│   └── gradingsystem/
│       └── Gradingsystem.java    # Main application file
├── build/                        # Compiled classes directory
├── nbproject/                    # NetBeans configuration
├── build.xml                    # Ant build configuration
├── manifest.mf                  # Manifest file
├── test/                        # Test files
└── README.md                    # This file
```

## Technical Details

- **Language**: Java
- **Build Tool**: Apache Ant
- **IDE**: NetBeans
- **Data Structure**: ArrayList (for storing students and subjects)

## Classes

### Student
Represents a student in the system with:
- `studentname`: Name of the student
- `sub`: ArrayList of subjects

### Subject
Represents a subject with:
- `namesub`: Name of the subject
- `grade`: Grade received in the subject

## Future Enhancements

- Add database integration for persistent storage
- Implement GUI using Swing or JavaFX
- Add grade calculation features (average, GPA)
- Export student records to PDF/Excel
- User authentication system
- Advanced filtering and search capabilities

## Contributing

This is a personal project. Feel free to fork, modify, and enhance it as needed.

## License

This project is provided as-is for educational purposes.

## Contact

For questions or suggestions, feel free to reach out.

---

**Version**: 1.0  
**Last Updated**: February 2026
