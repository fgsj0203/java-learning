package StructureSequential;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        //Section of variables
        int metersConverter;

        //Receiving datas input
        Scanner input = new Scanner(System.in);

        //Logical operations
        System.out.println("Digite quantos metros: ");
        metersConverter = input.nextInt();

        //Displaying datas
        System.out.println("Metros convertidos: "+metersConverter*100+"cm");
    }
}
