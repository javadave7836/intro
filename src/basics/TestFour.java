package basics;

import java.util.Scanner;

public class TestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a number for multiplication table: ");
		 int number = input.nextInt();
		 multTable(number);

	}
	public static void multTable(int numb) {
		for(int i = 0; i < 11; i++) {
			int total = i * numb;
			System.out.println(numb + " * " + i + " = " + total);
			
		}
	}

}
