package basiccoreprogram;

import java.util.Scanner;

public class SwapingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();

		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("Enter 1st Number : " + num1);
		System.out.println("Enter 2st Number : " + num2);
	}

}
