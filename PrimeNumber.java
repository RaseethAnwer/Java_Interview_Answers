package raseeth_java;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println(number +" Is prime");
		}
		else {
			System.out.println(number +" Is Not prime");
		}
	}

	private static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i=2;i<=number/2;i++) {
			if(number % i == 0) {
			return false;
		}
		
		}
		return true;
	}
}