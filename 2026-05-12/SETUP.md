# Java Training Course Setup Requirements

## Overview
This document outlines the software and environment requirements for the 5-hour Introduction to Java training course. Please ensure all items are installed and configured before the training session.

## Required Software

### Java Development Kit (JDK) 17
- **Required**: Oracle JDK 17 or OpenJDK 17
- **Version**: Any patch version of Java 17 (17.0.x)
- **Verification**: Run `java -version` and `javac -version` in command prompt/terminal
- **Note**: Java 17 includes the `jshell` interactive tool which we'll use extensively

### IntelliJ IDEA
- **Required**: IntelliJ IDEA (Community Edition is sufficient)
- **Version**: 2022.1 or later (for optimal Java 17 support)
- **Configuration**: Default installation settings are fine
- **Note**: This will be our primary development environment

## Environment Setup

### Command Line Access
- **Windows**: Command Prompt or PowerShell
- **Mac/Linux**: Terminal
- **Required**: Ability to run `java`, `javac`, and `jshell` commands
- **Test**: Ensure PATH includes Java bin directory

### Internet Access (Limited)
- **Required**: Access to Oracle Java documentation (docs.oracle.com)
- **Optional**: Access to IntelliJ documentation (jetbrains.com)
- **Note**: All course materials will be provided locally

### File System Permissions
- **Required**: Ability to create and modify files in a designated course folder
- **Required**: Ability to create new IntelliJ IDEA projects
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
- All examples designed to work with standard Java 17 and IntelliJ IDEA

## IT Department Notes
- No additional software downloads required during training
- No external library dependencies
- All development will use built-in Java tools and IntelliJ IDEA
- Course designed for restricted corporate environments

## Troubleshooting
If any of the verification commands fail, please contact your IT department to ensure:
1. Java 17 JDK is properly installed
2. JAVA_HOME environment variable is set (if required by your organization)
3. Java bin directory is in the system PATH
4. IntelliJ IDEA is installed and can create new Java projects

## Contact
If you have questions about these requirements, please contact [instructor contact information].