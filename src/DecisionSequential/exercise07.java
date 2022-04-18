package DecisionSequential;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        //Section of variables
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
        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree){
            System.out.println("O número um é o maior: "+numberOne);
            System.out.println("O número três é o menor: "+numberThree);
        } else if (numberOne > numberTwo && numberOne > numberThree && numberThree > numberTwo){
            System.out.println("O número um é o maior: "+numberOne);
            System.out.println("O número dois é o menor: "+numberTwo);
        } else if (numberTwo > numberThree && numberTwo > numberOne && numberThree > numberOne){
            System.out.println("O número dois é o maior: "+numberTwo);
            System.out.println("O número um é o menor: "+numberOne);
        } else if (numberTwo > numberThree && numberTwo > numberOne && numberOne > numberThree){
            System.out.println("O número dois é o maior: "+numberTwo);
            System.out.println("O número três é o menor: "+numberThree);
        } else if (numberThree > numberOne && numberThree > numberTwo && numberOne > numberTwo){
            System.out.println("O número três é o maior: "+numberThree);
            System.out.println("O número dois é o menor: "+numberTwo);
        } else if (numberThree > numberOne && numberThree > numberTwo && numberTwo > numberOne){
            System.out.println("o número três é o maior: "+numberThree);
            System.out.println("o número um é o menor: "+numberOne);
        }
    }
}
