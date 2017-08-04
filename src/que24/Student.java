package que24;

public class Student {

	String name;
	int score;
	static int i = 0;
	static int[] scoreArray = new int[50];

	Student(String n, int s) {
		name = n;
		score = s;
		scoreArray[i] = s;
		i++;
	}

	public int[] getMax() {
		int[] a = { 0, 0 };
		for (int j = 0; j < i + 1; j++) {
			if (scoreArray[j] > a[0]) {
				a[0] = scoreArray[j];
				a[1] = j + 1;
			}
		}
		return a;
	}
}
