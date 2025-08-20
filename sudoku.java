package javatask;


	import java.util.*;

	public class sudoku {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char[][] board = new char[9][9];
	        System.out.println("Enter Sudoku board (use . for empty):");
	        for (int i = 0; i < 9; i++)
	            for (int j = 0; j < 9; j++)
	                board[i][j] = sc.next().charAt(0);

	        Set<String> seen = new HashSet<>();
	        boolean valid = true;
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                char c = board[i][j];
	                if (c != '.') {
	                    if (!seen.add(c + " in row " + i) ||
	                        !seen.add(c + " in col " + j) ||
	                        !seen.add(c + " in block " + i/3 + "-" + j/3)) {
	                        valid = false; break;
	                    }
	                }
	            }
	        }
	        System.out.println(valid ? "Sudoku is valid" : "Sudoku is NOT valid");
	        sc.close();
	    }
	}

