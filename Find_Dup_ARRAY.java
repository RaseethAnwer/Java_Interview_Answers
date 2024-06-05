package raseeth_java;

import java.util.Scanner;

public class Find_Dup_ARRAY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");
        for (int i = 0; i < n; i++) {
            boolean isDub = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDub = true;
                    break;
                }
            }
            if (isDub) {
                boolean alreadyPrint = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrint = true;
                        break;
                    }
                }
                if (!alreadyPrint) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
