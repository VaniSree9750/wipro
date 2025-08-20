package javatask;
import java.util.*;
public class sortcheck {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        boolean sorted = true;
	        for (int i = 1; i < n; i++)
	            if (arr[i] < arr[i - 1]) { sorted = false; break; }

	        System.out.println(sorted ? "Array is sorted" : "Array is not sorted");
	        sc.close();
	    }
	}

