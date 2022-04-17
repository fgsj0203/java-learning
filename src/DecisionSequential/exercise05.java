package DecisionSequential;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        //Section of variables
        double noteOne;
        double noteTwo;
        double average;

        //Receiving data of user
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        noteOne = input.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        noteTwo = input.nextDouble();

        average = (noteOne + noteTwo) / 2;

        //Displaying values final
        System.out.println("Sua média final foi: "+average);

        //Logical operation
        if(average >= 7.0 && average <= 9.9){
            System.out.println("Aprovado");
        } else if (average == 10.0){
            System.out.println("Aprovado com distinção");
        } else if (average < 6.9 && average > 0.0){
            System.out.println("Reprovado");
        } else {
            System.out.println("Média inválida");
        }
    }
}
