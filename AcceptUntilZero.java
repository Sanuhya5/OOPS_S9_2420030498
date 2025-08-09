package control.statements;

import java.util.Scanner;

public class AcceptUntilZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        } while (num != 0);

        System.out.println("You entered 0. Program stopped.");

        scanner.close();
		

	}

}
