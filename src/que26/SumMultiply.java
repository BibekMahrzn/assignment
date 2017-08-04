package que26;

import java.util.Scanner;

public class SumMultiply {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number => ");
		int a = s.nextInt();
		System.out.println("Sum of each digit for given number => "+sumMultiply(a,1));
		System.out.println("Multiplication of each digit for given number => "+sumMultiply(a,0));
		s.close();
	}

	private static int sumMultiply(int a,int b) {
		int l = String.valueOf(a).length();
		if (l == 1)
			return a;
		if(b==1)
			return (a % 10) + sumMultiply(a / 10,1);
		else
			return (a % 10) * sumMultiply(a / 10,0);
	}
}
