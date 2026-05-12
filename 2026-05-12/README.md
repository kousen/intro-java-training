# Introduction to Java Training Course

This repository contains all materials for a 5-hour Introduction to Java training course designed for enterprise environments with restricted access.

## Course Structure

### Prerequisites
- Java 17 JDK installed
- IntelliJ IDEA (Community Edition is sufficient)
- Basic computer literacy

### Course Outline
1. **Java Basics** (90 minutes)
   - Values, Variables, and Simple Methods
   - String Handling and Math Functions
   - Flow Control (if, for, while)

2. **Introduction to OO** (60 minutes)
   - Classes, Objects, and References
   - Wrapper Types and Arrays

3. **JVM and Tooling** (60 minutes)
   - IntelliJ IDEA basics
   - Java compilation and JVM
   - Command-line tools

4. **Java Types and Collections** (90 minutes)
   - Inheritance and Interfaces
   - Collections Framework

## Repository Contents

### `/exercises/`
Student exercise files with TODO sections to complete:
- `basics/` - Simple functions and string operations
- `oop/` - Classes and inheritance exercises
- `collections/` - Working with Java collections

### `/solutions/`
Complete solutions for all exercises (instructor reference)

### `/demos/`
Live coding demonstration files:
- `StringDemo.java` - String operations
- `ArrayDemo.java` - Working with arrays
- `ClassesObjectsDemo.java` - OOP concepts
- `CollectionsDemo.java` - Collections framework
- `FizzBuzz.java` - Classic programming exercise
- `JShellCommands.txt` - JShell demo commands

### Documentation
- `SETUP.md` - Environment setup instructions for students
- `INTELLIJ_PLAIN_JAVA.md` - Guide for non-Maven/Gradle projects
- `TESTING_APPROACH.md` - Testing without external dependencies
- `slides.md` - Slidev presentation slides

## For Instructors

### Running the Course
1. Send `SETUP.md` to client IT department ahead of time
2. Use `slides.md` with Slidev for presentations
3. Live code using files in `/demos/`
4. Students work on `/exercises/` files
5. Reference `/solutions/` as needed

### IntelliJ Project Setup
1. Create new Java project (not Maven/Gradle)
2. Use Java 17 SDK
3. Source folder: `src/`
4. Output folder: `out/`

### Testing Approach
The course uses simple main method tests instead of JUnit to:
- Avoid external dependencies
- Reduce complexity for beginners
- Work in restricted environments
- Focus on Java fundamentals

### Tips for Banking/Enterprise Environments
- All code runs with standard Java 17, no external dependencies
- No internet access required during course
- No build tools needed (Maven/Gradle)
- All materials are self-contained

## Quick Start for Students

1. Open IntelliJ IDEA
2. Create New Project → Java → Next → Name: "JavaTraining"
3. Copy exercise files to `src/` folder
4. Start with `Exercise1_SimpleFunctions.java`
5. Run files directly with right-click → Run

## Contact

Kenneth Kousen  
Kousen IT, Inc.  
ken.kousen@kousenit.com