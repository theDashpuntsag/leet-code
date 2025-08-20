import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * LeetCode Problem 20: Valid Parentheses
 * 
 * PROBLEM DESCRIPTION:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 * 
 * EXAMPLES:
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * 
 * CONSTRAINTS:
 * - 1 <= s.length <= 10^4
 * - s consists of parentheses only '()[]{}'.
 * 
 * ALGORITHM APPROACH:
 * 1. Use a Stack data structure (LIFO - Last In First Out)
 * 2. For each character in the string:
 *    - If it's an opening bracket: push it onto the stack
 *    - If it's a closing bracket: 
 *      a) Check if stack is empty (no matching opening bracket) -> invalid
 *      b) Pop from stack and check if it matches the closing bracket -> if not, invalid
 * 3. After processing all characters, stack should be empty (all brackets matched)
 * 
 * WHY STACK?
 * - Parentheses have a nested structure - the most recently opened bracket 
 *   should be the first to be closed
 * - Stack's LIFO property perfectly matches this requirement
 * - Example: "((()))" - the innermost '(' should match with the first ')'
 * 
 * TIME COMPLEXITY: O(n) where n is the length of the string
 * SPACE COMPLEXITY: O(n) in worst case when all characters are opening brackets
 */
public class ValidParentheses {
    /**
     * Determines if a string of parentheses is valid
     * @param s String containing only parentheses characters
     * @return true if the parentheses are properly balanced and nested, false otherwise
     */
    public static boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Process each character in the input string
        for(char ch: s.toCharArray()) {
            switch (ch) {
                // Opening brackets: push onto stack
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                    
                // Closing brackets: check for matching opening bracket
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            }
        }

        // Valid parentheses string should have empty stack at the end
        // If stack is not empty, there are unmatched opening brackets
        return stack.isEmpty();
    }

    /**
     * Helper method to validate test results
     * @param result Actual result from isValid method
     * @param expectedResult Expected result for the test case
     * @return true if results match, false otherwise
     */
    public static boolean isAnswerValid(boolean result, boolean expectedResult) {
        return result == expectedResult;
    }

    /**
     * Main method to test the solution with various test cases
     */
    public static void main(String[] args) {
        // Test cases with expected results
        Map<String, Boolean> results = new HashMap<String, Boolean>();
        results.put("()", true);        // Simple valid case
        results.put("(){}[]", true);    // Multiple valid brackets
        results.put("((", false);       // Unmatched opening brackets

        // Run tests and display results
        for(Map.Entry<String, Boolean> item : results.entrySet()) {
            System.out.println("----------------------------------");
            System.out.println("Your code is: " + isAnswerValid(isValid(item.getKey()), item.getValue()));
            System.out.println("Input is: " + item.getKey());
            System.out.println("isValid result: " + isValid(item.getKey()));
            System.out.println("Expected value: " + item.getValue());
            System.out.println("----------------------------------");
        }
    }
}