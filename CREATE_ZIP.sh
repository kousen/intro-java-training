#!/bin/bash

# Script to create a ZIP file for the Java training course
# Excludes solution files for student distribution

echo "Creating student materials ZIP..."

# Create a temporary directory for student files
mkdir -p temp_student/exercises
mkdir -p temp_student/demos

# Copy exercises (not solutions)
cp -r exercises/* temp_student/exercises/
cp -r demos/* temp_student/demos/

# Copy documentation
cp README.md temp_student/
cp SETUP.md temp_student/
cp INTELLIJ_PLAIN_JAVA.md temp_student/

# Create student ZIP
zip -r java-training-student-materials.zip temp_student/*

# Create instructor ZIP with everything
zip -r java-training-instructor-materials.zip \
    exercises \
    solutions \
    demos \
    slides.md \
    README.md \
    SETUP.md \
    INTELLIJ_PLAIN_JAVA.md \
    TESTING_APPROACH.md

# Clean up
rm -rf temp_student

echo "Created:"
echo "  - java-training-student-materials.zip (for students)"
echo "  - java-training-instructor-materials.zip (for you)"