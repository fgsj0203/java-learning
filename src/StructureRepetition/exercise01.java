package StructureRepetition;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        //Section of variables
        double note;

        //Receiving data of user
        Scanner input = new Scanner(System.in);
        System.out.println("informe por favor sua nota: ");
        note = input.nextDouble();

        //Logical operations
        while (note < 0 || note > 10){
            System.out.println("Nota inválida, digite novamente");
            System.out.println("Informe o número novamente: ");
            note = input.nextDouble();
        }
        System.out.println("A nota informada foi: "+note);
    }
}
