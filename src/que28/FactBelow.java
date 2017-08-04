package que28;

import java.util.Scanner;

public class FactBelow {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number => ");
		int a = s.nextInt();
		System.out.println("Answer => "+calculate(a));
		s.close();
	}
	
	private static double calculate(int a) {
		if(a == 2)
			return 2;
		return calculate(a-1)+(double)1/fact(a-1);
	}

	private static int fact(int i) {
		if (i==1)
			return 1;
		return fact(i-1)*i;
	}
}
