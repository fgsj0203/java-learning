package StructureSequential;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        //Section of variables
        int number1;
        int number2;
        double number3;
        double operationOne;
        double operationTwo;
        double operationThree;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Operation Logical
        System.out.println("Informe o valor do primeiro número: ");
        number1 = input.nextInt();

        System.out.println("Informe o valor do segundo número: ");
        number2 = input.nextInt();

        System.out.println("Informe o valor do terceiro número: ");
        number3 = input.nextDouble();

        //Calculating values with operation
        operationOne = ((number1*2) * (number2/2));

        operationTwo = ((number1*3) + (number3));

        operationThree = Math.pow(number3,3);

        //Displaying values of operation
        System.out.printf("Operação 1: %.2f %n ", operationOne);
        System.out.printf("Operação 2: %.2f %n ", operationTwo);
        System.out.printf("Operação 3: %.2f %n ", operationThree);
    }
}
