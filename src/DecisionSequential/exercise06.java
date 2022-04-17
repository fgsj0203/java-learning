package DecisionSequential;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        //Section variables
        int numberOne;
        int numberTwo;
        int numberThree;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        numberOne = input.nextInt();

        System.out.println("Informe o segundo número: ");
        numberTwo = input.nextInt();

        System.out.println("Informe o terceiro número: ");
        numberThree = input.nextInt();

        //Logical operations
        if (numberOne > numberTwo && numberOne > numberThree){
            System.out.println("o número um é o maior");
            System.out.println("O número: "+numberOne);
        } else if (numberTwo > numberThree){
            System.out.println("O número dois é o maior");
            System.out.println("O número: "+numberTwo);
        } else {
            System.out.println("O número três é o maior");
            System.out.println("O número: "+numberThree);
        }

    }
}
