import java.util.*;
class Solution{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			if(isBalancedParentheses(input)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		
	}

	private static boolean isBalancedParentheses(String input) {
		Stack<Character> st1 = new Stack<Character>();
		Stack<Character> st2 = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			st1.push(input.charAt(i));
		}
	
		while (st1.size() > 0) {
			if (st2.isEmpty()) {
				st2.push(st1.pop());
				continue;
			}
			
			if (isOpposite(st1.lastElement(), st2.lastElement())) {
				st1.pop();
				st2.pop();
			} else {
				st2.push(st1.pop());
			}
		}
		
		// check size if someone is zero
		if (st1.size() != 0 || st2.size() != 0){
			return false;
		}
		
		return true;
	}

	private static boolean isOpposite(char ch1, char ch2) {
		if (ch1 != ch2) {
			if (ch1 == '{' && ch2 == '}') return true;
			if (ch1 == '}' && ch2 == '{') return true;
			if (ch1 == '[' && ch2 == ']') return true;
			if (ch1 == ']' && ch2 == '[') return true;
			if (ch1 == '(' && ch2 == ')') return true;
			if (ch1 == ')' && ch2 == '(') return true;
		} else {
			return false;
		}
		return false;
	}
}