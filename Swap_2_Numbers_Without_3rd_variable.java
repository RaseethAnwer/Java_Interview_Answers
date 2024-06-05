package raseeth_java;

import java.util.Scanner;

public class Swap_2_Numbers_Without_3rd_variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Number");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("Number 1 = "+number1);
		System.out.println("Number 2 = "+number2);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After Swap");
		System.out.println("Number 1 = "+number1);
		System.out.println("Number 2 = "+number2);
	}

}
