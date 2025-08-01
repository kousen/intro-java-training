# Regular Java Projects in IntelliJ IDEA (No Build Tools)

## Project Structure

A regular Java project in IntelliJ has this structure:

```
MyProject/
├── .idea/              # IntelliJ settings (git-ignored)
├── out/                # Compiled .class files (git-ignored)
├── src/                # Your Java source files
└── MyProject.iml       # IntelliJ module file
```

## Creating a New Project

1. **File → New → Project**
2. Select **Java** (not Maven or Gradle)
3. Choose your Project SDK (Java 17)
4. Next → Next → Enter project name and location
5. Finish

## How It Works

### Source Files
- All `.java` files go in the `src` folder
- IntelliJ automatically recognizes the package structure
- Example:
  ```
  src/
  ├── Main.java                    # Default package
  ├── com/
  │   └── example/
  │       ├── model/
  │       │   └── Person.java      # package com.example.model;
  │       └── util/
  │           └── Helper.java      # package com.example.util;
  ```

### Compilation
- IntelliJ compiles automatically on save (by default)
- Compiled `.class` files go to `out/production/ProjectName/`
- Uses `javac` behind the scenes

### Running Code
- Right-click any class with `main` method → Run
- Or click green arrow in the editor gutter
- IntelliJ creates run configurations automatically

### Classpath Management
- **Project Structure** (Ctrl+Alt+Shift+S or Cmd+;)
  - Add JARs: Modules → Dependencies → + → JARs or directories
  - Add other source folders: Modules → Sources → Mark as Sources
  - Configure output paths: Modules → Paths

### Adding External Libraries (JARs)
1. Create a `lib` folder in your project
2. Copy JAR files there
3. Project Structure → Modules → Dependencies
4. Click + → JARs or Directories → Select your lib folder
5. Apply

## Key Differences from Maven/Gradle Projects

| Feature | Maven/Gradle | Plain Java |
|---------|--------------|------------|
| Dependencies | Downloaded automatically | Manual JAR management |
| Project file | pom.xml / build.gradle | .iml file |
| Standard layout | Enforced (src/main/java) | Flexible (just src) |
| Test integration | Built-in test folders | Manual setup |
| Build lifecycle | Defined phases | Just compile & run |
| IDE independence | Portable | IntelliJ-specific |

## Example: Setting Up a Project with Tests

```
MyProject/
├── src/
│   └── com/example/
│       └── Calculator.java
├── test/
│   └── com/example/
│       └── CalculatorTest.java
└── lib/
    └── junit-4.13.2.jar
```

1. Mark `test` as Test Sources (green folder)
2. Add JUnit JAR as dependency
3. Run tests with right-click → Run

## Pros and Cons

### Pros
- ✅ Simple and fast to set up
- ✅ No internet needed
- ✅ No build tool complexity
- ✅ Good for learning/teaching
- ✅ Works in restricted environments

### Cons
- ❌ Manual dependency management
- ❌ Not portable between IDEs
- ❌ No standard project structure
- ❌ Harder to share projects
- ❌ No automated dependency updates

## Tips for Your Banking Client

1. **Create a Template Project**
   - Set up a basic project with common structure
   - Save as template: File → Save as Template

2. **Version Control**
   - Add to `.gitignore`:
     ```
     .idea/
     out/
     *.iml
     ```

3. **Sharing Projects**
   - Include `src/` and `lib/` folders
   - Document required JDK version
   - Recipients recreate IntelliJ project

4. **Running Outside IntelliJ**
   ```bash
   # Compile
   javac -d out src/com/example/*.java
   
   # Run
   java -cp out com.example.Main
   ```

This approach is perfect for teaching environments where build tools might be blocked or add unnecessary complexity!