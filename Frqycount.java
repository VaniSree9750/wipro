package javatask;



	
	import java.util.*;
	public class Frqycount {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        Map<Integer, Integer> map = new HashMap<>();
	        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);

	        System.out.println("Frequencies:");
	        for (var e : map.entrySet())
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        sc.close();
	    }
	}