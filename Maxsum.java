package javatask;
import java.util.*;
public class Maxsum {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        int maxSoFar = arr[0], curr = arr[0];
	        for (int i = 1; i < n; i++) {
	            curr = Math.max(arr[i], curr + arr[i]);
	            maxSoFar = Math.max(maxSoFar, curr);
	        }
	        System.out.println("Maximum subarray sum = " + maxSoFar);
	        sc.close();
	    }
	

}
