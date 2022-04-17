package DecisionSequential;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        //Section of variables
        String letter;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("informe uma letra por favor: ");
        letter = input.next();
        letter = letter.substring(0,1).toLowerCase(); //Converter first letter for minuscule

        //Operation logical
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }
        System.out.println("A letra é: "+letter);
    }
}
