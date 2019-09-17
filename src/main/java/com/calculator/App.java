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


            if (stringArray[0].equalsIgnoreCase("Help")) {
                    System.out.println(" ");
                    System.out.println("Operations are");
                    System.out.println("1. Addition = Add");
                    System.out.println("2. Subscription = Sub");
                    System.out.println("3. Multiplication = Mul");
                    System.out.println("4. Division = Div");
                    System.out.println("5. Remainder = Mod");
                    System.out.println(" ");
                    System.out.println("Input example : Add 10 10");
                    System.out.println("Result will be: 10 + 10 = 20");
                    System.out.println(" ");
                    System.out.println("Operations are not case sensitive, if you input 'ADD' as 'add' or 'Add' operation will continue.");
                    System.out.println(" ");
            } else if (stringArray[0].isEmpty()){
                System.out.println("Invalid operation. For more details enter help.");
            }
            else {

                    oparator = stringArray[0];
                    num1 = Integer.parseInt(stringArray[1]);
                    num2 = Integer.parseInt(stringArray[2]);

                    if (oparator.equalsIgnoreCase("ADD")) {
                        result = num1 + num2;
                        System.out.println(num1 + "+" + num2 + "" + "=" + result);
                    }
                    if (oparator.equalsIgnoreCase("SUB")) {
                        result = num1 - num2;
                        System.out.println(num1 + "-" + num2 + "" + "=" + result);
                    }
                    if (oparator.equalsIgnoreCase("mul")) {
                        result = num1 * num2;
                        System.out.println(num1 + "*" + num2 + "" + "=" + result);
                    }
                    if (oparator.equalsIgnoreCase("DIV")) {
                        result = num1 / num2;
                        System.out.println(num1 + "/" + num2 + "" + "=" + result);
                    }
                    if (oparator.equalsIgnoreCase("MOD")) {
                        result = num1 % num2;
                        System.out.println(num1 + "%" + num2 + "" + "=" + result);
                    }

                }

            }
    }



    public static void main(String[] args)
    {
        prnt();
    }

}
