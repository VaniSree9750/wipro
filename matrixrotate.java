package javatask;
import java.util.*;

public class matrixrotate {
	
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter n (square matrix): ");
	        int n = sc.nextInt();
	        int[][] mat = new int[n][n];
	        System.out.println("Enter matrix:");
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                mat[i][j] = sc.nextInt();

	        for (int i = 0; i < n; i++)
	            for (int j = i; j < n; j++) {
	                int tmp = mat[i][j];
	                mat[i][j] = mat[j][i];
	                mat[j][i] = tmp;
	            }
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n / 2; j++) {
	                int tmp = mat[i][j];
	                mat[i][j] = mat[i][n - 1 - j];
	                mat[i][n - 1 - j] = tmp;
	            }

	        System.out.println("Rotated Matrix:");
	        for (int[] row : mat)
	            System.out.println(Arrays.toString(row));
	        sc.close();
	    }
	}


