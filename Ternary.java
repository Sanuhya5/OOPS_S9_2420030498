package Arithmetic.operations;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int greater = (a > b) ? a : b;

        System.out.println("Greater number is: " + greater);

        scanner.close();

	}

}
