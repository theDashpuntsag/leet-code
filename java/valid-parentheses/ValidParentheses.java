import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/*
 * @Problem:  
 *  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. 
 *  An input string is valid if:    
 *      Open brackets must be closed by the same type of brackets.
 *      Open brackets must be closed in the correct order.
 *      Every close bracket has a corresponding open bracket of the same type.
 * 
 *  @Solution 
 *  In the following problem followng task must be dozne:
 *      + Check each characters from begining to end of String input.
 *    
 *  What if parentheses are nested ?
 *      + IF parentheses are nested use Stack.
 *      + Stack is linear data structure that follows a LIFO(Last in first out) or FILO(First in last out) order operations
 *      + Check if charAt(index) in input is the opening parenthesis, and if it is the opening parenthesis
 *        check charAt(index + 1) is the correct closing parenthes. If it is process next character in String input.
 *        If not put the opening parenthes in Stack and process the next opening parenthes
 * 
 *  Why you should use stack in this problem ?
 * 
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        // Create a new stack to store the characters.
        Stack<Character> stack = new Stack<>();

        // convert string into char array and access the characters using for each loop.
        for(char ch: s.toCharArray()) {
            // check ch
            switch (ch) {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
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


        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.
        return stack.isEmpty();
    }

    public static boolean isAnswerValid(boolean result, boolean expectedResult) {
        if (result == expectedResult)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Map<String, Boolean> results = new HashMap<String, Boolean>();
        results.put("()", true);
        results.put("(){}[]", true);
        results.put("((", false);

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