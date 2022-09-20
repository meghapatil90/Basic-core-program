package basiccoreprogram;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		System.out.println("Enter The Diviser");
		int dv = sc.nextInt();

		int rem = num % dv;
		int quotient = num / dv;

		System.out.println("reminder : " + rem);
		System.out.println("quotient : " + quotient);
	}

}
