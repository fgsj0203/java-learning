package DecisionSequential;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        //Section of variables
        String turno;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o turno que você estuda: M - Matutino ou V - Vespertino ou N - Noturno");
        turno = input.next();
        turno = turno.substring(0,1).toLowerCase();

        //Logical operations
        if (turno.equals("m")){
            System.out.println("Matutino");
        } else if (turno.equals("v")){
            System.out.println("Vespertino");
        } else if (turno. equals("n")){
            System.out.println("Noturno");
        } else {
            System.out.println("Turno inválido");
        }
    }
}
