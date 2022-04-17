package DecisionSequential;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        //Section of variables
        int number;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número qualquer por favor: ");
        number = input.nextInt();

        //Logical operations
        if(number >= 0){
            System.out.println("Número é posítivo");
        } else {
            System.out.println("Número é negativo");
        }
    }
}
