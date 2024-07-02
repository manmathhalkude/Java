package corejava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("is even");
		} else {
			System.out.println("is odd");
		}

	}

}
