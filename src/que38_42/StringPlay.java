package que38_42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringPlay {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Select the operation:\n" + "-------------------\n" + "1. Check palindrom\n"
				+ "2. Display the name in short form\n" + "3. Reverse\n" + "4. Duplicate letter\n"
				+ "5. Duplicate words\n" + "6. Exit");

		boolean b = true;
		while (b) {
			System.out.print("\nChoose the operation => ");
			switch (s.nextInt()) { // this was causing problem
			case 1:
				System.out.print("Enter a string => ");
				if (checkPalindrom(s.next()))
					System.out.println("Is palindrom");
				else
					System.out.println("Not a palindrom");
				break;
			case 2:
				System.out.print("Enter a full name => ");
				s.nextLine(); // this is fix it ,scans enter
				String sf = shortFormat(s.nextLine());
				System.out.println("Short Formatted name => " + sf);
				break;
			case 3:
				System.out.print("Enter a String => ");
				String strRev = new StringBuilder(s.next()).reverse().toString();
				System.out.println("Reverse string = > " + strRev);
				break;
			case 4:
				System.out.println("Enter a String => ");
				s.nextLine(); // fix
				findDupicateChar(s.nextLine());
				break;
			case 5:
//				this is is just a normal sentence. this is be easy to find duplicate. hope it will find duplicate word in sentence.
				System.out.println("Enter a Sentence = >");
				s.nextLine(); // same here fix
				findDuplicateWord(s.nextLine());
				break;
			default:
				b = false;
				break;
			}
		}
		s.close();
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

	private static void findDupicateChar(String nextLine) {
		// hm.put() hm.get() hm.containKey() <= hashmap
		// set
		char[] c = nextLine.toCharArray();
		// use of generic
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char d : c) {
			if (d != ' ') { // just not to scan space
				if (m.containsKey(d))
					m.put(d, m.get(d) + 1);
				else
					m.put(d, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> s = m.entrySet();
		System.out.println("Repeted character :");
		for (Map.Entry<Character, Integer> d : s) {
			// if(d.getValue()>1 && d.getKey() != ' ')
			if (d.getValue() > 1)
				System.out.printf("%c:%d\n", d.getKey(), d.getValue());
		}
	}

	private static String shortFormat(String nextLine) {
		// char[] c = nextLine.toCharArray();
		// String ss = null;
		// if(c[0]!=' ')
		// ss = String.valueOf(c[0]);
		// for (int i = 2; i < c.length; i++) {
		// if(c[i-1] == ' ')
		// ss += "." + String.valueOf(c[i]);
		// }
		// easy way
		String[] a = nextLine.split(" ");
		String ss = "";
		for (int i = 0; i < a.length - 1; i++) {
			ss += a[i].charAt(0) + ". ";
		}
		ss += a[a.length - 1];
		return ss;
	}

	private static boolean checkPalindrom(String next) {
		char[] c = next.toCharArray();
		if (c.length % 2 == 0) {
			for (int i = 0; i < c.length / 2; i++) {
				if (c[i] != c[c.length - i - 1])
					return false;
			}
		} else {
			for (int i = 0; i < c.length / 2; i++) {
				if (c[i] != c[c.length - i - 1])
					return false;
			}
		}
		return true;
	}

}
