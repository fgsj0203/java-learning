package StructureRepetition;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        //Section of variables
        int number;
        int big = 0;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operations
        for (int x=0;x <=5; x++){
            System.out.println("Informe seu número por favor: ");
            number = input.nextInt();
            if (number > big){
                big = number;
            }
        }
        System.out.println("O maior número é: "+big);
    }
}
