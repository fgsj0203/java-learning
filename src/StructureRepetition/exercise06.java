package StructureRepetition;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        //Section of variables
        double number;
        double sumNumbers = 0;
        double average;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operations
        for (int x=0; x <5; x++){
            System.out.println("informe um número por favor: ");
            number = input.nextDouble();
            sumNumbers = sumNumbers + number;
        }
        System.out.println("A soma dos números é: "+sumNumbers);
        average = (sumNumbers / 5); //Calculating average of numbers

        System.out.println("A média da soma dos números é: "+average);

    }
}
