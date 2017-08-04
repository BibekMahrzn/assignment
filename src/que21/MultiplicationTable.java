package que21;

public class MultiplicationTable {

	public static void main(String[] args) {
		mulTable(3);
		System.out.println(fact(5));
	}

	public static void mulTable(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "*" + i + " => " + a * i);
		}
	}

	public static long fact(int a) {
		if (a == 1)
			return 1;
		else
			return fact(a - 1) * a;
	}
}
