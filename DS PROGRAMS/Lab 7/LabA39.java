import java.util.Stack;

public class LabA39 {

    public static boolean isRecognized(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        
        // Push the first half characters onto the stack
        for (int i = 0; i < length / 2; i++) {
            stack.push(s.charAt(i));
        }
        
        // Determine the starting point of the second half
        int startIndex = (length % 2 == 0) ? length / 2 : length / 2 + 1;
        
        // Compare the second half characters with the ones in the stack
        for (int i = startIndex; i < length; i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testStrings = {"aca", "bcb", "abcba", "abbcbba"};

        for (String s : testStrings) {
            System.out.println("Is the string \"" + s + "\" recognized? " + isRecognized(s));
        }
    }
}
