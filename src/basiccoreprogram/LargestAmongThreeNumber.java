package basiccoreprogram;

import java.util.Scanner;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("first number is greatest : " + num1);
			} else {
				System.out.println("third number is greatest : " + num3);
			}
		} else {
			if (num2 > num3) {
				System.out.println("second number is greatest :" + num2);
			} else {
				System.out.println("third number is greatest: " + num3);

			}
		}
	}
}
