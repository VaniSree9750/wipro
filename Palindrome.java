package javatask;
import java.util.*;
public class Palindrome {
         static String expand(String s, int l, int r) {
	        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
	        return s.substring(l + 1, r);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();

	        String res = "";
	        for (int i = 0; i < s.length(); i++) {
	            String p1 = expand(s, i, i);
	            String p2 = expand(s, i, i + 1);
	            if (p1.length() > res.length()) res = p1;
	            if (p2.length() > res.length()) res = p2;
	        }
	        System.out.println("Longest palindrome: " + res);
	        sc.close();
	    }
	}
