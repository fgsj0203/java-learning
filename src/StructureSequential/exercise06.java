package StructureSequential;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        //Section of variables
        double raid;
        double areaCircle;
        double pi = 3.14;

        //Object receiving data input
        Scanner input = new Scanner(System.in);

        //Receiving data user input
        System.out.println("Informe por favor o raio do círculo: ");
        raid = input.nextDouble();

        //Operation Logical
        areaCircle = pi*Math.pow(raid,2);

        //Printing calculate final
        System.out.println("Area do círculo: "+areaCircle);

    }
}
