package StructureSequential;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        //Section variables
        double heightPeople;
        double weightMan;
        double weightWomen;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operation
        System.out.println("Informe sua altura: ");
        heightPeople = input.nextDouble();

        weightMan = (72.7 * heightPeople) - 58;
        weightWomen = (62.1 * heightPeople) - 44.7;

        //Displaying values final
        System.out.printf("Peso ideal do homem: %.2f %n ", weightMan);
        System.out.printf("Peso ideal da mulher: %.2f ", weightWomen);
    }
}
