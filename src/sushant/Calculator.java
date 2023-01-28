package sushant;

import java.util.Scanner;

class Calc{
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x-y;
    }
    public int mul(int x, int y){
        return x*y;
    }
    public int div(int x, int y){
        return x/y;
    }
    public int square(int x, int y){
        return (int) Math.pow(x, y);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();
        System.out.println("Enter the first integer: ");
        int no1 = sc.nextInt();

        System.out.println("Enter the second integer: ");
        int no2 = sc.nextInt();

        System.out.println("Enter the operator (+, -, /, *, ^): ");
        String op = sc.next();

        switch (op){
            case "+" :
                System.out.println("Your sum is " + c.add(no1, no2));
                break;
            case "-" :
                System.out.println("Your difference is " + c.sub(no1, no2));
                break;
            case "*" :
                System.out.println("Your multiplication is " + c.mul(no1, no2));
                break;
            case "/" :
                System.out.println("Your division is " + c.div(no1, no2));
                break;
            case "^" :
                System.out.println("Your square of the integer is " + c.square(no1, no2));
                break;
            default:
                System.out.println("Wrong Choice");

        }
    }
}
