import java.util.Scanner;
import java.util.Stack;

public class Braces {
	private static Scanner scanner;

	//main
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 0 ; i < number ; i++) {
			System.out.println(isBalancedBrackets(scanner.next()));
		}
	}
	
	//function
	private static String isBalancedBrackets(String value) {
        Stack<Character> stack = new Stack<>();
        char upperElement = 0;
        for (int i = 0; i < value.length(); i++) {
            if (!stack.isEmpty()) {
                upperElement = stack.peek();
            }
            stack.push(value.charAt(i));
            if (!stack.isEmpty() && stack.size() > 1) {
                if ((upperElement == '[' && stack.peek() == ']') ||
                        (upperElement == '{' && stack.peek() == '}') ||
                        (upperElement == '(' && stack.peek() == ')')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";

}
}
