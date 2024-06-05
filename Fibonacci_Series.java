package raseeth_java;

import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        
        System.out.println("The Fibonacci Series of " + number + " is:");
        Fib_Series_Iterative(number);
        //Fib_Series_Recursive(number);
        
        sc.close();
    }
    
    // Iterative Method
    public static void Fib_Series_Iterative(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int first = 0;
        int second = 1;
        
        for (int i = 0; i <=n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // for new line
    }
    
    // Recursive Method
//    public static void Fib_Series_Recursive(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.print(Fibonacci1(i) + " ");
//        }
//        System.out.println(); // for new line
//    }
    
    public static int Fibonacci1(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);
    }
}
