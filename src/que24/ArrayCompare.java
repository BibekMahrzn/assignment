package que24;

import java.util.Scanner;

public class ArrayCompare {

	public static void main(String... args) {
		String[] name = new String[50];
		int[] score = new int[50];
		int n, max = 0, tempi = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of Student => ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of student " + (i + 1) + " and score => ");
			name[i] = s.next();
			// System.out.println("and score => ");
			score[i] = s.nextInt();
		}
		s.close();

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				tempi = i;
			}
		}
		System.out.println("Student " + name[tempi] + " has highest score of " + max);
	}

}
