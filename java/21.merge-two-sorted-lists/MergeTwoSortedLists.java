/**
 * LeetCode Problem 21: Merge Two Sorted Lists
 * 
 * PROBLEM DESCRIPTION:
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * 
 * EXAMPLES:
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * 
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * 
 * CONSTRAINTS:
 * - The number of nodes in both lists is in the range [0, 50].
 * - -100 <= Node.val <= 100
 * - Both list1 and list2 are sorted in non-decreasing order.
 * 
 * ALGORITHM APPROACH:
 * 1. Use two pointers technique to traverse both lists simultaneously
 * 2. Create a dummy head node to simplify edge cases
 * 3. Compare values at current positions of both lists
 * 4. Add the smaller value to result and advance that pointer
 * 5. When one list is exhausted, append the remaining part of the other list
 * 6. Return the next node of dummy head (actual start of merged list)
 * 
 * TIME COMPLEXITY: O(m + n) where m and n are lengths of the two lists
 * SPACE COMPLEXITY: O(1) if we don't count the output list, O(m + n) if we do
 */
class MergeTwoSortedLists {
    /**
     * Merges two sorted linked lists into one sorted list
     * @param list1 Head of first sorted linked list
     * @param list2 Head of second sorted linked list
     * @return Head of the merged sorted linked list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the merging process
        final ListNode result = new ListNode();
        ListNode head = result;
        
        // Main merging logic: compare values and build result list
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                // Current value in list1 is smaller, add it to result
                head.next = new ListNode(list1.val);
                head = head.next;
                list1 = list1.next;  // Move to next node in list1
            } else {
                // Current value in list2 is smaller or equal, add it to result
                head.next = new ListNode(list2.val);
                head = head.next;
                list2 = list2.next;  // Move to next node in list2
            }
        }

        // Handle remaining nodes: one list might be longer than the other
        if (list1 == null) {
            // list1 is exhausted, append remaining nodes from list2
            head.next = list2;
        } else {
            // list2 is exhausted, append remaining nodes from list1
            head.next = list1;
        }

        // Return the actual head (skip the dummy node)
        return result.next;
    }
}