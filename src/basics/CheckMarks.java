package basics;

public class CheckMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gradeStudent(100);
		gradeStudent(89);
		gradeStudent(75);
		gradeStudent(60);
		gradeStudent(45);

	}
	static void gradeStudent(int score) {
		if(score >= 50 && score < 60) {
			System.out.println("Student has a grade of D");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("Student has a grade of C");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("Student has a grade of B");
		}
		else if(score >= 90 && score < 101) {
			System.out.println("Student has a grade of A");
		}
		else if(score < 50) {
			System.out.println("Student has a grade of F");
		}
	}
 
}

// if score >= 90
//   print grade = A
// else if score >= 80 
//   print grade = B
// else if score >= 70
//   print grade = C
// else if score >= 50
//   print grade = D
// else 
//   print  grade = F
