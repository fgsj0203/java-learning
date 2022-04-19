package DecisionSequential;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        //Section of variables
        int number;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número por favor: ");
        number = input.nextInt();

        //Logical operations
        if (number % 2 == 0){
            System.out.println("O número informado é par");
        } else {
            System.out.println("O número informado é ímpar");
        }
    }
}
