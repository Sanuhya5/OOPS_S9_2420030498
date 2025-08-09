package control.statements;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter student's marks: ");
		        int marks = scanner.nextInt();

		        if (marks >= 90 && marks <= 100) {
		            System.out.println("Grade A");
		        } else if (marks >= 80 && marks < 90) {
		            System.out.println("Grade B");
		        } else if (marks >= 70 && marks < 80) {
		            System.out.println("Grade C");
		        } else if (marks >= 60 && marks < 70) {
		            System.out.println("Grade D");
		        } else if (marks >= 0 && marks < 60) {
		            System.out.println("Grade F-Fail");
		        } else {
		            System.out.println("Invalid marks entered.");
		        }

		        scanner.close();

	}

}
