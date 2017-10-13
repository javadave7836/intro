package basics;

import java.util.Scanner;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int card1 = input.nextInt();
		 System.out.print("Enter a second number: ");
		 int card2 = input.nextInt();
		 System.out.println(blackJack(card1, card2));

	}
	public static int blackJack(int x, int y) {
		int max = Math.max(x, y);
		if(max <= 21) {
			return max;
		}
		else {
			if (x > 21 && y > 21) {
				return 0;
			}
			else {
				if(x >21) {
					return y;
				}
				else {
					return x;
				}
				
			}
 		 }
		}
		
	}

