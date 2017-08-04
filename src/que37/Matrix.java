package que37;

import java.util.Scanner;

public class Matrix {
	static Scanner s;
	public static void main(String[] args) {

//		int[][] a = new int[10][10];
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = new int[10][10];
//		System.out.println("Input first array");
//		scan(a);
		System.out.println("Input second Array");
		// uncomment this to scan
//		scan(b);
		int[][] sum = sum(a, b);
		System.out.println("sum of ");
		display(a);
		System.out.println("  +");
		display(b);
		System.out.println("  =");
		display(sum);
	}

	private static void display(int[][] sum) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3d",sum[i][j]);
			}
			System.out.println();
		}
	}

	private static int[][] sum(int[][] a, int[][] b) {
		int sum[][] = new int[10][10];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	@SuppressWarnings("unused")
	private static void scan(int[][] a) {
		s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter Array[" + i + "][" + j + "] => ");
				a[i][j] = s.nextInt();
			}
		}
//		s.close();
	}

}
