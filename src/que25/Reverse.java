package que25;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number => ");
		int a = s.nextInt();
		int b = rvsStringWay(a);
		System.out.println("The reversed integer => "+b);
		int bb = rvsIntWay(a);
		System.out.println("The reversed integer => "+bb);
		s.close();
	}

	private static int rvsIntWay(int a) {
		int l = String.valueOf(a).length();
		if(l==1)
			return a;
		return ((int)Math.pow(10, l-1)*(a%10))+rvsIntWay(a/10);
	}

	private static int rvsStringWay(int a) {
		String s = String.valueOf(a);
//		System.out.println(s.charAt(s.length()-1));
		String temp = "";
		for (int i = s.length()-1; i >=0; i--) {
			temp += s.charAt(i);
		}
		return Integer.parseInt(temp);
	}
	
	
}
