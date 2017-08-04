package que30;

public class Pattern {

	public static void main(String[] args) {
		pattern1(5);
		System.out.println();
		pattern2(5);
	}

	private static void pattern1(int i) {
		for (int j = 1; j <= i; j++) {
			for (int j2 = 1; j2 <= j; j2++) {
				System.out.print(j2 + " ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int i) {
		boolean check;
		boolean check0 = false;
		for (int j = 1; j >= 1;j += check0? -1:1) {
			check = false;
			for (int k = 1; k <= i - j; k++) {
				System.out.print(" ");
			}
			
			for (int j2 = 1; j2!=0;j2 += check? -1:1) {
				System.out.print(j2);
				if(j2==j)
					check = true;		
			}
			System.out.println();
			if(j==i)
				check0 = true;
		}
	}
		
//		for (int j = i-1; j >= 1; j--) {
//			
//			for (int k = 1; k <= i-j; k++) {
//				System.out.print(" ");
//			}
//			
//			for (int j2 = 1; j2 < j; j2++) {
//				System.out.print(j2);
//			}
//			printOpposite(j);
//			System.out.println();
//		}
//	}

	private static void printOpposite(int i) {
		for (int j = i; j >= 1; j--) {
			System.out.print(j);
		}
	}

}
