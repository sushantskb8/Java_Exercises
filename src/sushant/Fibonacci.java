package sushant;

import java.util.Scanner;

public class Fibonacci {
//    public static void fib(int n){
//        int n1 = 0;
//        int n2 = 1;
//        int n3 = 0;
//        for (int i = 2; i <= n; i++){
//            System.out.print(n3 + " ");
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//        }
//    }

    //Using Recurssion
    public static int fib_rec(int n){
        if( n <= 0){
            return 0;
        }
        if (n <= 1){
            return 1;
        }
        else {
            return (fib_rec(n - 1) + fib_rec(n - 2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
//        fib(n);
        for(int i = 0; i < n; i++){
            System.out.print(fib_rec(i) + " ");
        }
    }
}
