package exercice1;

public class StringExp {
	public boolean isBalanced(String exp) {
		Stack stack = new Stack();
		for (int i = 0; i < exp.length(); i++) {
            char x = exp.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = (Character) stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = (Character) stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = (Character) stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
	}

}
