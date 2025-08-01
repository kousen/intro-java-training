# Claude Code Project Context

## Project Overview
This is a **5-hour Introduction to Java training course** designed for enterprise environments with restricted internet access. The course uses plain Java (no external dependencies) and focuses on fundamentals through hands-on exercises.

## Key Project Characteristics

### Target Environment
- **Enterprise/Banking environments** with restricted internet access
- **No external dependencies** - pure Java 17 only
- **No build tools** - direct compilation and execution
- **IntelliJ IDEA** as the primary development environment
- **Self-contained materials** for offline use

### Course Structure (5 hours total)
1. **Java Basics** (90 min) - Variables, methods, strings, flow control
2. **Introduction to OO** (60 min) - Classes, objects, arrays, wrapper types  
3. **JVM and Tooling** (60 min) - IntelliJ basics, compilation, command-line tools
4. **Java Types and Collections** (90 min) - Inheritance, interfaces, collections framework

## Repository Structure

```
├── exercises/          # Student exercise files with TODO sections
├── solutions/          # Complete solutions (instructor reference)
├── demos/             # Live coding demonstration files
├── slides.md          # Slidev presentation (optimized for screen fit)
├── SETUP.md           # Environment setup for students
├── INTELLIJ_PLAIN_JAVA.md  # Non-Maven/Gradle project guide
├── TESTING_APPROACH.md     # Testing without external dependencies
└── CREATE_ZIP.sh      # Creates student and instructor material packages
```

## Recent Improvements Made

### Slide Optimizations
- **Fixed length issues** by converting single-column content to two-column layouts
- **Improved tables** split across columns for better screen fit
- **Added Carbon icons** for enhanced visual presentation
- **Split overly long slides** (e.g., Java Platform Architecture → 2 slides)
- **Enhanced practice resources** with detailed descriptions of HackerRank, Codewars, LeetCode

### Specific Fixes Applied
- Contact Info → Two-column layout (contact vs social media)
- Access Modifiers → Table + key points summary
- IntelliJ Productivity Tips → Categorized shortcuts in columns
- Collections Guide → Basic vs Advanced collections
- Primitive Types → Split into two columns
- Wrapper Types → Split into two columns
- Q&A slides → Fixed centered bullet points

### Content Updates
- Replaced ArrayList vs LinkedList slide with Lists vs Sets comparison
- Updated practice site descriptions with detailed explanations
- Added "Modern Java Recipes" (Kousen) to recommended books
- Updated contact information with current social media accounts

## Claude Code Integration Notes

### Development Workflow
- Use **TodoWrite tool** for tracking multi-step tasks and progress
- **Read files first** before making edits to understand context
- **Batch tool calls** when possible for better performance
- **Use specific tools** for specific tasks (Grep for search, Glob for file patterns)

### File Management
- **Preserve exact formatting** when editing code and markdown
- **Check line numbers** and indentation when making edits
- **Test content** fits properly on presentation screens
- **Maintain consistency** across similar slide layouts

### Testing Philosophy
- **Simple main method tests** instead of JUnit for beginner-friendliness
- **No external dependencies** to work in restricted environments
- **Direct execution** without build tools for simplicity

### Key Commands for This Project
```bash
# Run Slidev presentation
slidev slides.md

# Create distribution packages
./CREATE_ZIP.sh

# Install dependencies (if needed)
npm install -g @slidev/cli
npm install -g @carbon/icons
```

## Current State
- ✅ All slide length issues resolved
- ✅ Content optimized for various screen sizes  
- ✅ Carbon icons integrated for contact information
- ✅ Practice resources properly documented
- ✅ Student/instructor materials properly separated

## Future Considerations
- Consider adding more Carbon icons strategically (but keep minimal)
- Monitor slide timing during actual delivery
- Update exercises based on student feedback
- Keep materials current with Java language updates

## Contact for This Project
**Kenneth Kousen** - ken.kousen@kousenit.com  
*Kousen IT, Inc.*