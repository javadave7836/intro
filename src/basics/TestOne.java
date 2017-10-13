package basics;

import java.util.Scanner;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a string: ");
		 String testString = input.nextLine();
		 System.out.println(extraFont(testString));
		

	}
	public static String extraFont(String tword) {
		if(tword.length() < 2) {
			return tword.concat(tword).concat(tword);
		}
		else {
			String element = tword.substring(0, 2);
			return element.concat(element).concat(element);
		}
	}

}
