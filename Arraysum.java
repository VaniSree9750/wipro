package javatask;
import java.util.*;
public class Arraysum {
	
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
	        System.out.print("Enter target sum: ");
	        int sum = sc.nextInt();
	        sc.close();
	        int curr = 0, start = 0;
	        for (int end = 0; end < arr.length; end++) {
	            curr += arr[end];
	            while (curr > sum) curr -= arr[start++];
	            if (curr == sum) {
	                System.out.println("Subarray from " + start + " to " + end);
	                return;
	            }
	        }
	        System.out.println("No subarray found");
	    }
	

}
