package que45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordFile {
	public static void main(String[] args) {
		BufferedReader inputStream = null;
		String s = "";
		try {
			inputStream = new BufferedReader(new FileReader("x.txt"));
			String temp;
			while ((temp = inputStream.readLine()) != null) {
				s += temp + " ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		findDuplicateWord(s);
	}

	private static void findDuplicateWord(String nextLine) {
		String[] sp = nextLine.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String string : sp) {
			// (unnecessary form last)
			if (check(string.charAt(string.length() - 1)))
				string = string.substring(0, string.length() - 1);
			// (unnecessary form first)
			if (check(string.charAt(0)))
				string = string.substring(1, string.length());
			
			if (m.containsKey(string))
				m.put(string, m.get(string) + 1);
			else
				m.put(string, 1);
		}
		Set<Map.Entry<String, Integer>> s = m.entrySet();
		System.out.println("Repeated word ::");
		for (Map.Entry<String, Integer> entry : s) {
			if (entry.getValue() > 1)
				System.out.printf("%s => %d\n", entry.getKey(), entry.getValue());
		}
	}

	private static boolean check(char c) {
		return c < 65 || c > 122 || (c > 91 && c < 96);
	}
}
