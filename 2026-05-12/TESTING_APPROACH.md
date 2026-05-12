# Testing Approach for Java Training Course

## Recommendation: Start with Simple Main Method Tests

Given the constraints of a 5-hour intro course in a locked-down banking environment, I recommend:

### Phase 1: Manual Testing with Main Methods (Recommended)

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Test right in the same file or separate test class
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Test add method
        System.out.println("Testing add(2, 3):");
        System.out.println("Expected: 5");
        System.out.println("Actual: " + calc.add(2, 3));
        System.out.println("Pass: " + (calc.add(2, 3) == 5));
        System.out.println();
        
        // Test multiply method
        System.out.println("Testing multiply(4, 5):");
        System.out.println("Expected: 20");
        System.out.println("Actual: " + calc.multiply(4, 5));
        System.out.println("Pass: " + (calc.multiply(4, 5) == 20));
    }
}
```

### Simple Test Helper Class

```java
public class SimpleTest {
    private static int testCount = 0;
    private static int passCount = 0;
    
    public static void assertEquals(int expected, int actual, String testName) {
        testCount++;
        if (expected == actual) {
            passCount++;
            System.out.println("✓ PASS: " + testName);
        } else {
            System.out.println("✗ FAIL: " + testName);
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
    
    public static void printSummary() {
        System.out.println("\nTest Summary: " + passCount + "/" + testCount + " passed");
    }
}

// Usage
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        SimpleTest.assertEquals(5, calc.add(2, 3), "add(2, 3)");
        SimpleTest.assertEquals(20, calc.multiply(4, 5), "multiply(4, 5)");
        SimpleTest.assertEquals(0, calc.add(0, 0), "add(0, 0)");
        
        SimpleTest.printSummary();
    }
}
```

## Phase 2: Adding JUnit (Only If Time Permits)

### Option A: IntelliJ's Bundled JUnit (Easiest)

1. Create a test class
2. Type `@Test` and let IntelliJ prompt you
3. Alt+Enter → "Add JUnit 4 to classpath"
4. IntelliJ uses its bundled JUnit (no download needed)

### Option B: Manual JUnit Setup

1. **Create lib folder** in project root
2. **Add JUnit JAR** (would need to be pre-downloaded)
   ```
   lib/
   ├── junit-4.13.2.jar
   └── hamcrest-core-1.3.jar
   ```

3. **Add to Project**
   - File → Project Structure → Modules → Dependencies
   - Click + → JARs → Select lib folder

4. **Create Test**
   ```java
   import org.junit.Test;
   import org.junit.Before;
   import static org.junit.Assert.*;

   public class CalculatorTest {
       private Calculator calc;
       
       @Before
       public void setUp() {
           calc = new Calculator();
       }
       
       @Test
       public void testAdd() {
           assertEquals(5, calc.add(2, 3));
       }
       
       @Test
       public void testMultiply() {
           assertEquals(20, calc.multiply(4, 5));
       }
   }
   ```

## Why I Recommend Against JUnit for This Course

1. **Time Constraint**: 5 hours is already tight for Java basics
2. **Added Complexity**: Annotations, assertions, test runners
3. **Environment Issues**: May need approval for external JARs
4. **Learning Focus**: Better to focus on core Java concepts
5. **Practical Alternative**: Main method tests work fine for learning

## What to Tell Students

"In real projects, we use testing frameworks like JUnit. For today's exercises, we'll use simple main method tests to verify our code works correctly. This lets us focus on learning Java without additional complexity."

## If Client Insists on "Real" Testing

Prepare a single ZIP file with:
```
testing-libs/
├── junit-4.13.2.jar
├── hamcrest-core-1.3.jar
└── SETUP_INSTRUCTIONS.txt
```

Have IT pre-approve and distribute this.

## Best Practice for Exercises

Structure each exercise with built-in verification:

```java
public class Exercise1 {
    // Student implements this
    public static int sumArray(int[] numbers) {
        // TODO: Calculate sum of array
        return 0;
    }
    
    // Provided test harness
    public static void main(String[] args) {
        // Test 1
        int[] test1 = {1, 2, 3, 4, 5};
        int result1 = sumArray(test1);
        System.out.println("Test 1: " + (result1 == 15 ? "PASS" : "FAIL"));
        
        // Test 2
        int[] test2 = {};
        int result2 = sumArray(test2);
        System.out.println("Test 2: " + (result2 == 0 ? "PASS" : "FAIL"));
        
        // Test 3
        int[] test3 = {-1, -2, -3};
        int result3 = sumArray(test3);
        System.out.println("Test 3: " + (result3 == -6 ? "PASS" : "FAIL"));
    }
}
```

This approach:
- ✅ No external dependencies
- ✅ Students see immediate feedback
- ✅ Teaches testing mindset
- ✅ Works in any environment
- ✅ Easy to understand