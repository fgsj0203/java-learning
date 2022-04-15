package StructureSequential;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        //Section of variables
        float noteOne;
        float noteTwo;
        float noteThree;
        float noteFour;
        float averageNotes;

        //Receiving datas of variables
        Scanner input = new Scanner(System.in);

        //Operation logical
        System.out.println("Informe a sua primeira nota: ");
        noteOne = input.nextFloat();

        System.out.println("Informe a sua segunda nota: ");
        noteTwo = input.nextFloat();

        System.out.println("Informe a sua terceira nota: ");
        noteThree = input.nextFloat();

        System.out.println("Informe a sua quarta nota: ");
        noteFour = input.nextFloat();

        averageNotes = (noteOne+noteTwo+noteThree+noteFour)/4;

        //Printing values
        System.out.println("A média de suas notas é: "+averageNotes);

    }
}
