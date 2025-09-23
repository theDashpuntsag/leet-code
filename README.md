# LeetCode Solutions Repository

A comprehensive collection of LeetCode problem solutions implemented in multiple programming languages (Java and JavaScript), featuring detailed documentation and explanations.

## 📚 Problems Solved

### Java Solutions

| Problem #                                        | Problem Name                    | Difficulty | Topics                 | Time Complexity | Space Complexity |
| ------------------------------------------------ | ------------------------------- | ---------- | ---------------------- | --------------- | ---------------- |
| [1](javascript/two-sum/)                         | Two Sum                         | Easy       | Array, Hash Table      | O(n²) / O(n)    | O(1) / O(n)      |
| [20](java/20.valid-parentheses/)                 | Valid Parentheses               | Easy       | String, Stack          | O(n)            | O(n)             |
| [21](java/21.merge-two-sorted-lists/)            | Merge Two Sorted Lists          | Easy       | Linked List, Recursion | O(m+n)          | O(1)             |
| [94](java/94.binary-tree-inorder-traversal/)     | Binary Tree Inorder Traversal   | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |
| [100](java/100.same-tree/)                       | Same Tree                       | Easy       | Tree, DFS, Binary Tree | O(min(m,n))     | O(min(m,n))      |
| [101](java/101.symmetric-tree/)                  | Symmetric Tree                  | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |
| [104](java/104.max-depth-of-binary-tree/)        | Maximum Depth of Binary Tree    | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |
| [110](java/110.balanced-binary-tree/)            | Balanced Binary Tree            | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |
| [111](java/111.minimum-depth-of-binary-tree/)    | Minimum Depth of Binary Tree    | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |
| [144](java/144.binary-tree-preorder-traversal/)  | Binary Tree Preorder Traversal  | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |
| [145](java/145.binary-tree-postorder-traversal/) | Binary Tree Postorder Traversal | Easy       | Tree, DFS, Binary Tree | O(n)            | O(h)             |

### JavaScript Solutions

| Problem #                | Problem Name | Implementation          | Algorithm               |
| ------------------------ | ------------ | ----------------------- | ----------------------- |
| [1](javascript/two-sum/) | Two Sum      | Brute Force + Optimized | Nested loops + Hash Map |

## 🚀 Getting Started

## How to Run Solutions

### Running Java Solutions

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

### Running JavaScript Solutions

JavaScript solutions can be run directly with Node.js:

```bash
node javascript/[problem-directory]/[filename].js
```

## 📖 Detailed Problem Explanations

### Problem 1: Two Sum

**Difficulty:** Easy  
**Topics:** Array, Hash Table

**Problem Statement:**
Given an array of integers and a target value, find two numbers that add up to the target and return their indices.

**Approaches Implemented:**

1. **Brute Force** (`brute-force.js`): O(n²) time, O(1) space

   - Uses nested loops to check all possible pairs
   - Simple but inefficient for large inputs

2. **Hash Map Optimization** (`advanced.js`): O(n) time, O(n) space
   - Uses hash map to store complements for instant lookup
   - Much more efficient, trades space for time

**Key Learning:** Understanding when to trade space for time complexity improvements.

---

### Problem 20: Valid Parentheses

**Difficulty:** Easy  
**Topics:** String, Stack

**Problem Statement:**
Determine if a string containing only parentheses characters is valid (properly balanced and nested).

**Algorithm:**

- Use a stack to track opening brackets
- For each closing bracket, check if it matches the most recent opening bracket
- Stack must be empty at the end for valid input

**Key Learning:** Stack data structure is perfect for nested/balanced problems due to LIFO property.

---

### Problem 21: Merge Two Sorted Lists

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers

**Problem Statement:**
Merge two sorted linked lists into one sorted list by splicing together nodes.

**Algorithm:**

- Use two pointers to traverse both lists simultaneously
- Always choose the smaller current value to add to result
- Append remaining nodes when one list is exhausted

**Key Learning:** Two-pointer technique for merging sorted sequences.

---

### Problem 94: Binary Tree Inorder Traversal

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Return the inorder traversal of a binary tree's node values.

**Algorithm:**

- Recursive approach: Left → Root → Right
- For BSTs, inorder traversal returns values in sorted order
- Can also be solved iteratively using a stack

**Key Learning:** Understanding tree traversal patterns and their applications.

---

### Problem 100: Same Tree

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Check if two binary trees are structurally identical with same node values.

**Algorithm:**

- Recursive comparison of corresponding nodes
- Base cases handle null nodes and value mismatches
- Both structure and values must match

**Key Learning:** Recursive tree comparison and handling edge cases.

---

### Problem 101: Symmetric Tree

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Check if a binary tree is symmetric around its center (mirror image).

**Algorithm:**

- Compare left and right subtrees as mirror images
- For symmetry: left.left ↔ right.right, left.right ↔ right.left
- Similar to Same Tree but with mirrored comparison

**Key Learning:** Adapting tree comparison algorithms for different requirements.

---

### Problem 104: Maximum Depth of Binary Tree

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Given the root of a binary tree, return its maximum depth (the number of nodes along the longest path from the root down to the farthest leaf node).

**Algorithm:**

- Use recursion to compute the depth of left and right subtrees
- The depth of the tree is 1 + max(left depth, right depth)
- Base case: if node is null, depth is 0

**Key Learning:** Recursive divide-and-conquer is a natural fit for tree depth problems.

---

### Problem 110: Balanced Binary Tree

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Given a binary tree, determine if it is height-balanced. A height-balanced binary tree is one where the depth of the two subtrees of every node never differs by more than 1.

**Algorithm:**

- For each node, check if the absolute difference between left and right subtree heights is ≤ 1
- Recursively check if both left and right subtrees are balanced
- Use optimized approach that returns both height and balance status to avoid recalculating heights

**Key Learning:** Combining multiple checks (height calculation + balance validation) in a single traversal for efficiency.

---

### Problem 111: Minimum Depth of Binary Tree

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

**Algorithm:**
- Use recursion to find the minimum depth of left and right subtrees
- Handle special cases: null nodes, leaf nodes, and nodes with only one child
- Important: Unlike maximum depth, we cannot simply take min(left, right) + 1 because if one subtree is null, that path doesn't lead to a leaf node
- Only consider paths that actually reach leaf nodes

**Key Learning:** Understanding the difference between minimum and maximum depth calculations, and why null paths should be ignored in minimum depth.

---

### Problem 144: Binary Tree Preorder Traversal

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Return the preorder traversal of a binary tree's node values.

**Algorithm:**

- Recursive approach: Root → Left → Right
- Visit the root node first, then traverse left and right subtrees
- Can also be solved iteratively using a stack

**Key Learning:** Preorder traversal is useful for copying trees and evaluating prefix expressions.

---

### Problem 145: Binary Tree Postorder Traversal

**Difficulty:** Easy  
**Topics:** Tree, DFS, Binary Tree

**Problem Statement:**
Return the postorder traversal of a binary tree's node values.

**Algorithm:**

- Recursive approach: Left → Right → Root
- Traverse left and right subtrees first, then visit the root node
- Can also be solved iteratively using a stack

**Key Learning:** Postorder traversal is useful for deleting trees and evaluating postfix expressions.

---

## 🏗️ Data Structures Used

### TreeNode

Used in binary tree problems (94, 100, 101). Represents a node in a binary tree with:

- `val`: Integer value
- `left`: Reference to left child
- `right`: Reference to right child

### ListNode

Used in linked list problems (21). Represents a node in a singly-linked list with:

- `val`: Integer value
- `next`: Reference to next node

## 🎯 Key Algorithms & Techniques

1. **Two Pointers**: Used in array and linked list problems
2. **Hash Map/Hash Table**: For O(1) lookup optimizations
3. **Stack**: Perfect for nested/balanced structure problems
4. **Recursion**: Natural fit for tree problems
5. **DFS (Depth-First Search)**: Tree traversal and comparison
6. **Pattern Matching**: Recognizing when to apply specific techniques

## 📝 Learning Notes

- **Time vs Space Trade-offs**: Many problems can be optimized by using extra space
- **Pattern Recognition**: Similar problem types often use similar approaches
- **Edge Cases**: Always consider null inputs, empty structures, and boundary conditions
- **Code Reusability**: Helper classes like TreeNode and ListNode are used across multiple problems
