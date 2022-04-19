package StructureRepetition;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        //Section of variables
        String name;
        String password;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("informe seu nome: ");
        name = input.next();
        System.out.println("Informe uma senha: ");
        password = input.next();

        //Logical operations
        while (name.equals(password)){
            System.out.println("Nome e senha não podem ser iguais, tente novamente");
            System.out.println("Informe o nome novamente: ");
            name = input.next();
            System.out.println("Informe uma nova senha: ");
            password = input.next();
        }
        System.out.println("O nome informado foi: "+name);
        System.out.println("A senha informada foi: "+password);
    }
}
