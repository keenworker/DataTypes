package calculation;

import java.util.Scanner;

public class cgpa {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
				
			float subject1 = sc.nextFloat();
			float subject2 = sc.nextFloat();
			float subject3 = sc.nextFloat();
			float cgpa = (subject1 + subject2 +subject3)/30;
			    
			System.out.println("Calculate CGPA Using Marks of Three Subjects: " + cgpa);
		}
		
}
