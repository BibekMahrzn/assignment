package que31_35;

import java.util.Scanner;

public class ArraySumOrderReverseLargeDuplicate {
	
	public static void main(String[] args) {
		int [] a = new int[5];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 values");
		for (int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		
		System.out.println("Select the operation:\n"
				+ "-------------------\n"
				+ "1. Sum\n"
				+ "2. Duplicate\n"
				+ "3. Reverse\n"
				+ "4. Ascending order\n"
				+ "5. Second largest\n"
				+ "6. Exit");
		
		boolean b = true;
		while(b){
			System.out.print("\n----------\nChoose the option: ");
			switch(s.nextInt()){
				case 1:
					//sum
					System.out.println("\nSum of array element => " + sum+"\n");
					break;
				case 2:
					//Duplicate element in array
					int[] d = duplicate(a);
					System.out.print("Duplicate element => ");
					display(d);	
					break;
				case 3:
					//Reverse Array
					int [] r = ReverseOrder(a);
					System.out.print("Reverse order => ");
					display(r);	
					break;
				case 4:
					//Ascending Order 
					int [] ace = acendingOrder(a);
					System.out.print("Acsending order => ");
					display(ace);
					break;
				case 5:
					//Second Largest 
					int sl = secondLarge(a);
					System.out.println("Second largest => "+sl);
					break;
				default:
					b = false;
//					System.exit(0);
			}
		}
		s.close();
	}

	// **java is always passed by value
	// **array reference is passed as value in method 
	// **as a result change in original array
	private static int[] acendingOrder(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	private static int[] ReverseOrder(int[] a) {
		int [] temp = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[a.length-i-1];
		}
		return temp;
	}
	
	private static int secondLarge(int[] a) {
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i==1)
				return a[i];
		}
		return 0;
	}

	private static int[] duplicate(int[] a) {
		int []d = new int[2];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]){
					d[k] = a[i];
					k++;
					continue;
				}
			}
		}
		return d;
	}
	
	private static void display(int[] a) {
		for(int aa:a){
			System.out.print(aa+" ");
		}
		System.out.println("\n");
	}
}
