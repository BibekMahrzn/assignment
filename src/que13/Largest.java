package que13;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 3 numbers => ");
		int a,b,c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		greatest(a, b, c);
		s.close();
	}
	
	public static void greatest(int a, int b, int c){
		if (a>b){
			if(a>c)
				System.out.println(a+" is the greatest one");
			else
				System.out.println(c+" is the greatest one");
		}else
			System.out.println(b>c? b+" is greatest":c+" is greatest");
	}

}
