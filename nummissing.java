package javatask;
import java.util.*;
public class nummissing {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n (range 1 to n): ");
	        int n = sc.nextInt();

	        int[] arr = new int[n - 1];
	        System.out.println("Enter " + (n - 1) + " numbers:");
	        int sum = n * (n + 1) / 2, actual = 0;

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	            actual += arr[i];
	        }
	        System.out.println("Missing number = " + (sum - actual));
	        sc.close();
	    }
	}