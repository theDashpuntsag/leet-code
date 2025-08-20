/**
 * Definition for singly-linked list node used in LeetCode linked list problems.
 * 
 * STRUCTURE:
 * Each node contains:
 * - val: The integer value stored in the node
 * - next: Reference to the next node in the list (null for the last node)
 * 
 * LINKED LIST PROPERTIES:
 * - Linear data structure where elements are stored in nodes
 * - Each node points to the next node, forming a chain
 * - The first node is called the head
 * - The last node's next pointer is null
 * - Dynamic size - can grow or shrink during runtime
 * 
 * ADVANTAGES:
 * - Dynamic memory allocation
 * - Efficient insertion/deletion at any position
 * - No memory waste (allocates exactly what's needed)
 * 
 * DISADVANTAGES:
 * - No random access (must traverse from head)
 * - Extra memory overhead for storing pointers
 * - Not cache-friendly due to non-contiguous memory
 * 
 * COMMON OPERATIONS:
 * - Traversal: O(n)
 * - Search: O(n)
 * - Insertion at head: O(1)
 * - Deletion at head: O(1)
 * - Insertion/deletion at arbitrary position: O(n)
 */
public class ListNode {
    int val;         // Value stored in this node
    ListNode next;   // Reference to the next node
    
    // Default constructor creates node with value 0 and null next
    ListNode() {}
    
    // Constructor with value only
    ListNode(int val) { 
        this.val = val; 
    }
    
    // Constructor with value and next node reference
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}
