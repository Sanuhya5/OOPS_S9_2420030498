package Arithmetic.operations;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter theory marks (out of 100): ");
        int theory = scanner.nextInt();

        System.out.print("Enter practical marks (out of 100): ");
        int practical = scanner.nextInt();

        if (theory >= 40 && practical >= 40) {
            System.out.println("Student passed both theory and practical exams.");
        } else {
            System.out.println("Student did not pass both exams.");
        }

        scanner.close();

	}

}
