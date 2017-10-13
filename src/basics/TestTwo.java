package basics;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inArray = {1, 1, 3, 4};
		System.out.println (countEven(inArray));
		
		

	}
	public static int countEven(int [] iarr) {
		int evenCount = 0;
		for (int x : iarr) {
			if(x % 2 == 0) {
				evenCount ++;
			}
			
			
		}
		return evenCount;
	}

}
