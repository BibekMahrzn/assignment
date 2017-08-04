package que29;

import java.util.Scanner;

public class Fibonacy {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number => ");
		int a = s.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.print(fibo(i)+" ");
		}
		s.close();
	}

	private static int fibo(int i) {
		if(i==1 || i==2)
			return 1;
		return fibo(i-1)+fibo(i-2);
	}
}
