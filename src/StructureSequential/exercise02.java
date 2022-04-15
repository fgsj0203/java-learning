package StructureSequential;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        //Section of variables
        int number;

        //Object of input data
        Scanner input = new Scanner(System.in);

        //Operations Logical
        System.out.println("Por favor informe um número: ");
        number = input.nextInt();

        //Printing values
        System.out.println("Número informado foi: "+number);
    }
}
