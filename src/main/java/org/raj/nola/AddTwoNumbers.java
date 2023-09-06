package org.raj.nola;

public class AddTwoNumbers {

    public static void main(String[] args) {

        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;
            System.out.println("Sum of "+args[0] +" & "+ args[1]+" is : " + sum);
        }else {
            System.out.println("No arguments passed, please pass 2 integers");
        }
    }}