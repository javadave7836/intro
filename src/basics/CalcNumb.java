package basics;

public class CalcNumb {

	public static void main(String[] args) {
		 System.out.println(calcSum(13, 13));
		 printSum(9,9);
		 printDiv(8,0);
		// TODO Auto-generated method stub

	}
static int calcSum(int a, int b) {
	return a+b;
	
};
	
static void printSum(int a, int b) {
	System.out.println(a + b);
	
};
static void printDiv(int a, int b) {
	if (b == 0) {
		System.out.println("Cannot divide by zero");
	}
	else {
		System.out.println(a / b);
	}
	
	
};
}
