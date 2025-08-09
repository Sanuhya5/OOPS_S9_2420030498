package control.statements;

import java.util.Scanner;

public class Print1ToN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n = scanner.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
		

	}

}
