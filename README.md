# Introduction to Java Training Course

This repository contains all materials for a 5-hour Introduction to Java training course designed for enterprise environments with restricted access.

## Course Structure

### Prerequisites
- Java 17 JDK installed
- Visual Studio Code with Extension Pack for Java
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
   - VS Code for Java development
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
- `VSCODE_PLAIN_JAVA.md` - Guide for non-Maven/Gradle projects in VS Code
- `TESTING_APPROACH.md` - Testing without external dependencies
- `slides.md` - Slidev presentation slides (optimized for screen fit)
- `CLAUDE.md` - Claude Code integration and project context

## For Instructors

### Running the Course
1. Send `SETUP.md` to client IT department ahead of time
2. Use `slides.md` with Slidev for presentations
   - Slides optimized for various screen sizes with two-column layouts
   - Includes Carbon icons for better visual presentation
3. Live code using files in `/demos/`
4. Students work on `/exercises/` files
5. Reference `/solutions/` as needed

### Slide Presentation Setup
- Install Slidev globally: `npm install -g @slidev/cli`
- Install Carbon icons globally: `npm install -g @carbon/icons`
- Run presentation: `slidev slides.md`
- Recent improvements: All tables and long content use two-column layouts for better screen fit

### VS Code Project Setup
1. Create new folder for your project
2. Open folder in VS Code
3. Create `src/` folder for source files
4. VS Code will automatically compile to `bin/`
5. Ensure Extension Pack for Java is installed

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

1. Open VS Code
2. Create a new folder named "JavaTraining"
3. Open the folder in VS Code (File → Open Folder)
4. Create a `src/` subfolder and copy exercise files there
5. Start with `Exercise1_SimpleFunctions.java`
6. Run files with F5 (debug) or Ctrl+F5 (run without debug)

## Distribution

Two ZIP files are created by the `CREATE_ZIP.sh` script:
- `java-training-student-materials.zip` - Contains exercises, demos, and setup docs (no solutions)
- `java-training-instructor-materials.zip` - Contains everything including solutions and slides

## Contact

**Kenneth Kousen**  
*Kousen IT, Inc.*  
- Email: ken.kousen@kousenit.com
- Website: [kousenit.com](https://kousenit.com)
- GitHub: [github.com/kousen](https://github.com/kousen)
- Bluesky: [@kousenit.com](https://bsky.app/profile/kousenit.com)

## Recent Updates

- Optimized all slides for better screen fit with two-column layouts
- Added Carbon icons support for enhanced visual presentation
- Improved table layouts and content organization
- Enhanced practice resources with HackerRank, Codewars, and LeetCode descriptions
- Updated social media links and contact information