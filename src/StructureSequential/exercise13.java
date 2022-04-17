package StructureSequential;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        //Section of variables
        double weightFish;
        int excessWeight = 0;
        double taxPayment;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        //Logical operations
        System.out.println("informe o peso do peixe: ");
        weightFish = input.nextDouble();

        if (weightFish > 50) {
            excessWeight = (int) (weightFish - 50);
            taxPayment = excessWeight * 4.00;
            System.out.println("A multa paga pelo peso em excesso do peixe é: R$ " + taxPayment);
        } else {
            System.out.println("Você está isento de pagamento da multa");
        }
    }
}
