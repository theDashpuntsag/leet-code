import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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