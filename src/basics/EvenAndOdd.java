package basics;

import java.util.Scanner;

public class EvenAndOdd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int num = input.nextInt();
		System.out.println("The number " + num + " is " + findEvenOdd(num)); 

	}
	
	public static String findEvenOdd(int num) {
		if(num % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	
}

}




