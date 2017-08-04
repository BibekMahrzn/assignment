package que44;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddingAndSearchingInFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner s = new Scanner(System.in);
		
		System.out.println(
				"Options: "
						+ "\n1. Enter student name and address"
						+ "\n2. Get student address" + "\n3. Exit");

		boolean b = true;
		while (b) {
			System.out.print("\nChoose => ");
			switch (s.nextInt()) {
			case 1:
				try {
					pw = new PrintWriter(new FileWriter("a.txt",true)); // append
					s.nextLine();
					pw.println(s.nextLine());
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally {
					pw.close();
				}
				break;
			case 2:
				s.nextLine();
				try {
					br = new BufferedReader(new FileReader("a.txt"));
					String ss;
					String check = s.nextLine();
					while ((ss = br.readLine()) != null) {
						 String [] a = ss.split(" ");
						 if(check.equals(a[0]))
							 System.out.println("Address => "+a[1]);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				break;
			default:
				s.close();
				b = false;
			}
		}
	}
}

