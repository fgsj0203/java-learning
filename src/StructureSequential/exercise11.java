package StructureSequential;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        //Section of variables
        double heightPeople;
        double weightPeople;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operation
        System.out.println("Informa sua altura por favor: ");
        heightPeople = input.nextDouble();

        weightPeople = (72.7 * heightPeople) - 58;

        //Displaying values
        System.out.printf("Seu peso ideal é: %.2f %n", weightPeople);

    }
}
