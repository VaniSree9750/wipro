package javatask;

import java.util.*;

public class Greatelement {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        Stack<Integer> st = new Stack<>();
	        int[] res = new int[n];
	        Arrays.fill(res, -1);

	        for (int i = 0; i < n; i++) {
	            while (!st.isEmpty() && arr[i] > arr[st.peek()])
	                res[st.pop()] = arr[i];
	            st.push(i);
	        }

	        System.out.println("Next Greater Elements: " + Arrays.toString(res));
	        sc.close();
	    }
	}
