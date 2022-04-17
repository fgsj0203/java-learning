package StructureSequential;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        //Section of variables
        double farenheit;
        double converterForCelsius;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operation
        System.out.println("Informe a temperatura em Farenheit: ");
        farenheit = input.nextDouble();

        converterForCelsius = 5*((farenheit-32)/9);

        //Displaying values final
        System.out.printf("A temperatura final Fº -> Cº: %.2f %n ", converterForCelsius);

    }
}
