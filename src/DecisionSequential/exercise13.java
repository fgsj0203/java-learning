package DecisionSequential;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        //Section of variables
        int dia;

        //Receiving data of user input
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 7: ");
        dia = input.nextInt();

        //Logical operations
        if(dia==1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda");
        } else if (dia == 3){
            System.out.println("Terça");
        } else if (dia == 4){
            System.out.println("Quarta");
        } else if (dia == 5){
            System.out.println("Quinta");
        } else if (dia == 6){
            System.out.println("Sexta");
        } else if (dia == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido");
        }
    }
}
