package StructureSequential;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        //Section variables
        double sideSquat;
        double areaSquat;

        //Receiving data of user input
        Scanner input = new Scanner(System.in);

        //Logical operation
        System.out.println("Informe o lado do quadrado por favor: ");
        sideSquat = input.nextDouble();

        areaSquat = sideSquat * sideSquat;

        //Displaying values final
        System.out.println("Area do quadrado: "+areaSquat);

        System.out.println("Área do quadrado em dobro: "+areaSquat*2);

    }
}
