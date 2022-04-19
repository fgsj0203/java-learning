package StructureRepetition;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        //Section of variables
        String name;
        int age;
        double salary;
        String gender;
        String stateCivil;

        //Receiving data of user
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome por favor: ");
        name = input.next();
        while (name.length() < 3){
            System.out.println("Seu nome deve ter mais de 3 caracteres");
            System.out.println("Informe novamente seu nome: ");
            name = input.next();
        }
        System.out.println("Informe sua idade por favor: ");
        age = input.nextInt();
        while (age < 0 || age > 150){
            System.out.println("idade inválida, digite novamente");
            System.out.println("informe sua idade novamente: ");
            age = input.nextInt();
        }
        System.out.println("informe seu salário: ");
        salary = input.nextDouble();
        while (salary < 0){
            System.out.println("Salário inválido, tente novamente");
            System.out.println("Digite novamente seu salário: ");
            salary = input.nextDouble();
        }
        System.out.println("informe seu gênero: ");
        gender = input.next();
        while (!gender.equals("f") && !gender.equals("m")){
            System.out.println("Gênero inválido, tente novamente");
            System.out.println("Digite novamente seu gênero: ");
            gender = input.next();
        }
        System.out.println("informe seu estado civil: ");
        stateCivil = input.next();
        while (!stateCivil.equals("s") && !stateCivil.equals("c") && !stateCivil.equals("v") && !stateCivil.equals("d") ){
            System.out.println("Estado civil inválido, tente novamente");
            System.out.println("Informe novamente seu estado civil: ");
            stateCivil = input.next();
        }
    }
}
