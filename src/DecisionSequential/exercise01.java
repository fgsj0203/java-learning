package DecisionSequential;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        //Section of variables
        int numberOne;
        int numberTwo;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        numberOne = input.nextInt();

        System.out.println("Informe o segundo número: ");
        numberTwo = input.nextInt();

        //Logical operations
        if(numberOne > numberTwo){
            System.out.println("Número 1 é maior que o número 2");
        } else {
            System.out.println("Número 2 é maior que o número 1");
        }
    }
}
