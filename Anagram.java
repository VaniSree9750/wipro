package javatask;

import java.util.*;
public class Anagram {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String s1 = sc.nextLine();
	        System.out.print("Enter second string: ");
	        String s2 = sc.nextLine();

	        char[] a = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
	        char[] b = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);

	        if (Arrays.equals(a, b)) 
	            System.out.println("The strings are Anagrams.");
	        else 
	            System.out.println("The strings are NOT Anagrams.");
	        sc.close();
	    }
	}
