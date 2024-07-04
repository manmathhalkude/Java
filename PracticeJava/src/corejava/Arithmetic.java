package corejava;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int n1 = sc.nextInt();
		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("add:"+ (n1+n2));
		System.out.println("sub:"+ (n1-n2));
		System.out.println("div:"+ (n1/n2));
		System.out.println("mul:"+ (n1*n2));
		System.out.println("remainder:"+ (n1%n2));

	}

}
