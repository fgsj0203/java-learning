package DecisionSequential;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        //Section of variables
        int numberOne;
        int numberTwo;
        int numberThree;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        numberOne = input.nextInt();
        System.out.println("Segundo número: ");
        numberTwo = input.nextInt();
        System.out.println("Terceiro número: ");
        numberThree = input.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree){
            System.out.println("Número um: "+numberOne);
            System.out.println("Número dois: "+numberTwo);
            System.out.println("Número três: "+numberThree);
        } else if (numberOne > numberTwo && numberOne > numberThree && numberThree > numberTwo){
            System.out.println("Número um: "+numberOne);
            System.out.println("Número Três: "+numberThree);
            System.out.println("Número dois: "+numberTwo);
        } else if (numberTwo > numberThree && numberTwo > numberOne && numberThree > numberOne){
            System.out.println("Número dois: "+numberTwo);
            System.out.println("Número três: "+numberThree);
            System.out.println("Número um: "+numberOne);
        } else if (numberTwo > numberThree && numberTwo > numberOne && numberOne > numberThree){
            System.out.println("Número dois: "+numberTwo);
            System.out.println("Número um : "+numberOne);
            System.out.println("Número três:" +numberThree);
        } else if (numberThree > numberOne && numberThree > numberTwo && numberOne > numberTwo){
            System.out.println("Número três: "+numberThree);
            System.out.println("Número um: "+numberOne);
            System.out.println("Número dois: "+numberTwo);
        } else if (numberThree > numberOne && numberThree > numberTwo && numberTwo > numberOne){
            System.out.println("Número três: "+numberThree);
            System.out.println("Número dois: "+numberTwo);
            System.out.println("Número um: "+numberOne);
        }
    }
}
