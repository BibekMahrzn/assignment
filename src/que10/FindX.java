package que10;

import java.util.Scanner;

public class FindX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter A, B and C for the equation Ax^2+Bx+C :"); // 1 -5 6 || 4 3 2 
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if(b*b > 4*a*c) // Math.sqrt(-1) = NaN (complex number)
			System.out.println("Value of X => "+(-b+Math.sqrt(b*b-4*a*c))/2*a);
		else
			System.out.println("X is immaginary");
		s.close();
	}

}
