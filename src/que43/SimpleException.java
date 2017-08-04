package que43;

public class SimpleException {
	public static void main(String[] args) {
		int [] a = new int[2];
		try {
			a[2] = 9;
			a[1] = 3/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you got beyond the size of an array");
		}catch (ArithmeticException e){
			System.out.println("not divisible by 0");
		}
	}

}
