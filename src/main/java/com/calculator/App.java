package com.calculator;

import java.util.Scanner;


public class App 
{

    static String oparator;
    static int num1;
    static int num2;
    static int result;


    static void  prnt() {

        while (true){

        System.out.print("CLICalculator > ");
        Scanner input = new Scanner(System.in);
        String inputArray = input.nextLine();
        String[] stringArray = inputArray.split(" ");

        oparator = stringArray[0];
        num1 = Integer.parseInt(stringArray[1]);
        num2 = Integer.parseInt(stringArray[2]);


        if (oparator.equalsIgnoreCase("ADD")) {
            result = num1 + num2;
            System.out.println(num1 + "+" + num2 + "" + "=" + result);
        }else{
            System.out.println("Invalid operation for more details enter help to get help.");
        }
        if (oparator.equalsIgnoreCase("SUB")) {
            result = num1 - num2;
            System.out.println(num1 + "-" + num2 + "" + "=" + result);
        }else{
            System.out.println("Invalid operation for more details enter help to get help.");
        }
        if (oparator.equalsIgnoreCase("multi")) {
            result = num1 * num2;
            System.out.println(num1 + "*" + num2 + "" + "=" + result);
        }else{
            System.out.println("Invalid operation for more details enter help to get help.");
        }
        if (oparator.equalsIgnoreCase("DEV")) {
            result = num1 / num2;
            System.out.println(num1 + "/" + num2 + "" + "=" + result);
        }else{
            System.out.println("Invalid operation for more details enter help to get help.");
        }
        if (oparator.equalsIgnoreCase("mod")) {
            result = num1 % num2;
            System.out.println(num1 + "%" + num2 + "" + "=" + result);
        }else{
            System.out.println("Invalid operation for more details enter help to get help.");
        }


    }
    }


    public static void main(String[] args)
    {
        prnt();
    }

}
