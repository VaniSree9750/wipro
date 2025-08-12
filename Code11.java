


package code11;
import java.util.ArrayList;


public class Code11 {
	

	
	    public static int fixTheFormula(String input1) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        ArrayList<Character> operators = new ArrayList<>();

	        
	        for (int i = 0; i < input1.length(); i++) {
	            char ch = input1.charAt(i);
	            if (Character.isDigit(ch)) {
	                numbers.add(Character.getNumericValue(ch)); // convert char digit to int
	            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                operators.add(ch);
	            }
	        }

	        
	        int result = numbers.get(0);
	        for (int i = 0; i < operators.size(); i++) {
	            char op = operators.get(i);
	            int nextNum = numbers.get(i + 1);

	            switch (op) {
	                case '+':
	                    result = result + nextNum;
	                    break;
	                case '-':
	                    result = result - nextNum;
	                    break;
	                case '*':
	                    result = result * nextNum;
	                    break;
	                case '/':
	                    if (nextNum != 0) {
	                        result = result / nextNum; // integer division
	                    } else {
	                        throw new ArithmeticException("Division by zero");
	                    }
	                    break;
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	      
	        String input1 = "Fo+23the3*like2+";
	        System.out.println("Output: " + fixTheFormula(input1)); // Expected 17

	        
	        String input2 = "we8+you2-7to/*32";
	        System.out.println("Output: " + fixTheFormula(input2)); // Expected 2

	        
	        String input3 = "i*-t5s-t8h1e4birds";
	        System.out.println("Output: " + fixTheFormula(input3)); // Expected 35
	    }
	

	
}
