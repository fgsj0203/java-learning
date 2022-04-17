package DecisionSequential;

import java.util.Locale;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        //Section of variables
        String gender;
        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("informe o seu gênero = M ou F");
        gender = input.next();
        gender = gender.substring(0,1).toLowerCase(); //Converter first letter in minuscule

        if(gender.equals("m")){
            System.out.println("Homem");
        } else if (gender.equals("f")){
            System.out.println("Mulher");
        } else {
            System.out.println("Gênero inválido");
        }
    }
}
