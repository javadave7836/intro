package basics;

public class BreakAtJoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] joearray = {"steve", "mary", "bob", "joe", "lou"};
		printArray(joearray);
	}
	public static void printArray(String[] namearray) {
		for(String name: namearray) {
			if(name.equals("joe")) {
				break;
			}
			System.out.println(name);
		}
	}
	
}
