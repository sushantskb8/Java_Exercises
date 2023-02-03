package sushant;

import java.util.Scanner;

public class Factorial {
//    public static int factorial(int n){
//        int fact = 1;
//        if (n == 0 || n == 1){
//            return fact = 1;
//        }
//        else {
//           for (int i = n; i > 0; i--){
//               fact = fact * i;
//           }
//            return fact;
//        }
//
//    }

    //Using Recursion....
    public static int fact_rec(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return n * fact_rec(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
//        System.out.println(factorial(n));
        System.out.println(fact_rec(n));
    }
}
