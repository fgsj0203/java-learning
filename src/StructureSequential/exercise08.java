package StructureSequential;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        //Section of variables
        int hoursWork;
        double moneyHour;
        double salaryBrute;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operation
        System.out.println("Informe quantas horas você trabalhou no mês: ");
        hoursWork = input.nextInt();

        System.out.println("Informe quanto você recebe por hora: ");
        moneyHour = input.nextDouble();

        //----------------------------------------------------------------------------------
        salaryBrute = (hoursWork * moneyHour);

        //Displaying values final
        System.out.println("Seu salário final: R$ "+salaryBrute);

    }
}
