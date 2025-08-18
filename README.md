# Leet_code

leet code problem solving with multiple languages

## How to Run Solutions

### Java Solutions

#### Compilation and Execution

Java solutions need to be compiled before running. Since many solutions depend on helper classes (like `TreeNode`, `ListNode`), you need to compile all related files together.

##### Method 1: From Project Root (Recommended)

```bash
# 1. Compile all Java files in a specific problem directory
javac java/[problem-directory]/*.java

# 2. Run the solution with correct classpath
java -cp java/[problem-directory] Solution
```

**Example:**

```bash
# For the "same-tree" problem
javac java/100.same-tree/*.java
java -cp java/100.same-tree Solution
```

##### Method 2: From Problem Directory

```bash
# 1. Navigate to the specific problem directory
cd java/[problem-directory]

# 2. Compile all Java files
javac *.java

# 3. Run the solution
java Solution
```

**Example:**

```bash
cd java/100.same-tree
javac *.java
java Solution
```

#### Important Notes

- Always compile before running: Java files must be compiled to `.class` files
- Compile dependencies together: If your solution uses helper classes, compile all files at once
- Use class name when running: Use `java Solution`, not `java Solution.java`
- No import needed for same package: Classes in the same directory don't need explicit imports

### JavaScript Solutions

JavaScript solutions can be run directly with Node.js:

```bash
node javascript/[problem-directory]/[filename].js
```
