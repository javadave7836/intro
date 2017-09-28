package basics;

public class PrintIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intarray = {1, 3, 9, 21};
		printArray(intarray);

	}
	public static void printArray(int [] arr) {
		int loc = 0;
		for(int num: arr) {
			System.out.println(num + " is at locaton " + loc);
			loc ++;
		}
	}

}
