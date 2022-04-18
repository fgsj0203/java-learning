package DecisionSequential;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        //Section of variables
        double salary;
        double newSalary;

        //Receiving data input of user
        Scanner input = new Scanner(System.in);

        System.out.println("informe o seu salário: ");
        salary = input.nextDouble();

        //Logical operations
        if (salary > 0 && salary <= 280){
            System.out.println("Reajuste de 20%");
            newSalary = (salary + (salary*0.20)); //Calculating new salary
            System.out.println("Valor do reajuste: R$ "+salary*0.20);
            System.out.printf("Seu novo salário é: %.2f ",newSalary);
        } else if (salary > 280 && salary <= 700){
            System.out.println("Reajuste de 15%");
            newSalary = (salary + (salary*0.15));
            System.out.println("Valor do reajuste: R$ "+salary*0.15);
            System.out.printf("Seu novo salário é: %.2f ", newSalary);
        } else if (salary > 700 && salary <= 1500){
            System.out.println("Reajuste de 10%");
            newSalary = (salary + (salary*0.10));
            System.out.println("Valor do reajuste: R$ "+salary*0.10);
            System.out.printf("Seu novo salário é: %.2f ", newSalary);
        } else if (salary > 1500){
            System.out.println("Reajuste de 5%");
            newSalary = (salary + (salary*0.05));
            System.out.println("Valor do reajuste: R$ "+salary*0.05);
            System.out.printf("Seu novo salário é: %.2f ", newSalary);
        }
    }
}
