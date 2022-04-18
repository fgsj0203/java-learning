package DecisionSequential;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        //Section of variables
        double priceOne;
        double priceTwo;
        double priceThree;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto: ");
        priceOne = input.nextDouble();
        System.out.println("Informe o preço do segundo produto: ");
        priceTwo = input.nextDouble();
        System.out.println("Informe o preço do terceiro produto: ");
        priceThree = input.nextDouble();

        //Logical operations
        if(priceOne < priceTwo && priceOne < priceThree){
            System.out.println("O preço do primeiro produto é o mais barato, compre esse");
        } else if (priceTwo < priceThree){
            System.out.println("O preço do segundo produto é o mais barato, compre esse");
        } else {
            System.out.println("O preço do terceiro produto é o mais barato, compre esse");
        }
    }
}
