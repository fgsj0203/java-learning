package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        //Section of variables and lists
        int[] lista = new int[5];
        int number;

        //Receiving data of user input
        Scanner input = new Scanner(System.in);

        //logical operations
        for (int x=0; x<5; x++){
            System.out.println("informe um número: ");
            lista[x] = input.nextInt();
        }
        System.out.println("A lista com valores é: "+Arrays.toString(lista));

    }
}
