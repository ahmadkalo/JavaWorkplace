package Stack;

public class Spiegeln {

	public static String spiegeln(String s) {
		Stack stack = new Stack(s.length());

		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}

		Stack stack2 = new Stack(s.length());
		while (!stack.isEmpty()) {
			stack2.push(stack.pop());
		}

		return stack2.toString();
	}

	public static void main(String[] args) {
		String s = "hallo";
		System.out.println(s + " gespiegelt ist " + spiegeln(s));
	}
}
