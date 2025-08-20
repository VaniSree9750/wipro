package javatask;
import java.util.*;
public class Duplicate {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        StringBuilder sb = new StringBuilder();
	        Set<Character> seen = new HashSet<>();

	        for (char c : str.toCharArray()) {
	            if (!seen.contains(c)) {
	                seen.add(c);
	                sb.append(c);
	            }
	        }
	        System.out.println("After removing duplicates: " + sb);
	        sc.close();
	    }
}
