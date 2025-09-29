# Java Training Course Setup Requirements

## Overview
This document outlines the software and environment requirements for the 5-hour Introduction to Java training course. Please ensure all items are installed and configured before the training session.

## Required Software

### Java Development Kit (JDK) 17
- **Required**: Oracle JDK 17 or OpenJDK 17
- **Version**: Any patch version of Java 17 (17.0.x)
- **Verification**: Run `java -version` and `javac -version` in command prompt/terminal
- **Note**: Java 17 includes the `jshell` interactive tool which we'll use extensively

### Visual Studio Code
- **Required**: Visual Studio Code (latest stable version)
- **Extensions**: Extension Pack for Java (includes all necessary Java tools)
- **Installation**:
  1. Install VS Code from https://code.visualstudio.com/
  2. Open VS Code and go to Extensions (Ctrl+Shift+X)
  3. Search for "Extension Pack for Java" by Microsoft
  4. Click Install (this includes Language Support, Debugger, Test Runner, and more)
- **Note**: This will be our primary development environment

## Environment Setup

### Command Line Access
- **Windows**: Command Prompt or PowerShell
- **Mac/Linux**: Terminal
- **Required**: Ability to run `java`, `javac`, and `jshell` commands
- **Test**: Ensure PATH includes Java bin directory

### Internet Access (Limited)
- **Required**: Access to Oracle Java documentation (docs.oracle.com)
- **Optional**: Access to VS Code Java documentation (code.visualstudio.com/docs/java)
- **Note**: All course materials will be provided locally

### File System Permissions
- **Required**: Ability to create and modify files in a designated course folder
- **Required**: Ability to create new Java projects in VS Code
- **Required**: Write access for compiling and running Java programs

## Pre-Training Verification

Please verify the following commands work before the training:

```bash
# Check Java installation
java -version
javac -version

# Test JShell (should start interactive shell)
jshell

# Exit JShell
/exit
```

## Course Materials
- All starter code and exercises will be provided at the beginning of the training
- No external dependencies or build tools (Maven/Gradle) required
- All examples designed to work with standard Java 17 and VS Code

## IT Department Notes
- No additional software downloads required during training
- No external library dependencies
- All development will use built-in Java tools and VS Code
- Course designed for restricted corporate environments

## Troubleshooting
If any of the verification commands fail, please contact your IT department to ensure:
1. Java 17 JDK is properly installed
2. JAVA_HOME environment variable is set (if required by your organization)
3. Java bin directory is in the system PATH
4. VS Code is installed with the Extension Pack for Java

## Contact
If you have questions about these requirements, please contact [instructor contact information].