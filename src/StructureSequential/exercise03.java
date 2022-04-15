package StructureSequential;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        //Section of variables
        int numberOne;
        int numberTwo;
        int sumNumbers;

        //Receiving datas of variables
        Scanner input = new Scanner(System.in);

        //Operation logical
        System.out.println("Informe o primeiro número: ");
        numberOne = input.nextInt();

        System.out.println("Informe o segundo número: ");
        numberTwo = input.nextInt();

        sumNumbers = numberOne + numberTwo; //Calculating sum of numbers

        //Printing values
        System.out.println("Soma dos números = "+sumNumbers);

    }
}
