package raseeth_java;



public class First_100_prime_Number {

	public static void main(String[] args) {
		int count = 0;
		int n = 2;
		
		while(n <= 100) {
			if(isPrime(n)) {
				System.out.print(n+" ");
				count++;
			}
			n++;
		}
	}
		public static boolean isPrime(int n) {
		
			if(n<=1) {
				return false;
			}
			for(int i=2;i<=n/2;i++) {
				if(n % i == 0) {
				return false;
			}
			
			}
			return true;
		}
}
