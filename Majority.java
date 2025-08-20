package javatask;
import java.util.*;
public class Majority {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
	        sc.close();

	        int count = 0, candidate = 0;
	        for (int num : arr) {
	            if (count == 0) candidate = num;
	            count += (num == candidate) ? 1 : -1;
	        }
	        System.out.println("Majority element = " + candidate);
	    }
	}

