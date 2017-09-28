package basics;

public class BreakAndContinue {  //class

	public static void main(String[] args) { // main
		// TODO Auto-generated method stub
		continueMeth();
		breakMeth();
		

	} // main
	
	public static void continueMeth () {
		for ( int i =10; i > 0; i--) {
			if( i == 6 || i == 4  || i == 3) { //if
				continue;
			} //if
			System.out.println(i);
		}
	}


public static void breakMeth () {
	String names[]=new String[5];//declaration and instantiation  
	names[0]="bob";//initialization  
	names[1]="bill";  
	names[2]="joe";  
	names[3]="steve";  
	names[4]="kyle";  

	for(int i=0;i<names.length;i++) { 
		if(names[i] == "joe") {
			break;
		}
		System.out.println(names[i]); 
	}
 }
}

