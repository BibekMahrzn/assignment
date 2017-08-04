package que19_20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) throws ParseException {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Check Leap Year");
//		System.out.print("Enter the year => ");
//		int y = s.nextInt();
//		if (checkLY(y)) {
//			Date d = new SimpleDateFormat("dd/mm/yyyy").parse(String.valueOf(y) + "/2/29"); 
//			DateFormat df = new SimpleDateFormat("EEEE");
//			System.out.println(y + " is a leap year and the extra day it has is " + df.format(d));
//		} else
//			System.out.println(y + " is not a leap year");
//		s.close();
		Date d = new SimpleDateFormat("dd/mm/yyyy").parse("03/12/4021");
		System.out.println(d);
	}

	public static boolean checkLY(int a) {
		return (a % 4 == 0);
	}

}
