package basics;

public class LoopOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();

	}
	public static void printMyName() {
		int number = 1;
		while(number <= 10) {
			System.out.println("Dave");
			number ++;
			
		}
		
		int number2 = 10;
		System.out.println("Decrement");
		while(number2 > 0) {
			System.out.println(number2);
			number2 --;
			
		}
	}
}
