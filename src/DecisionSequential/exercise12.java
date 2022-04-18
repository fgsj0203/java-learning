package DecisionSequential;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        //Section of variables
        int hoursWork;
        double moneyHour;
        double salaryBrute;
        double salaryLiquid;
        double ir;
        double inss;
        double fgts;

        //Receiving data of user
        Scanner input = new Scanner(System.in);

        System.out.println("informe quantas horas trabalhou no mês: ");
        hoursWork = input.nextInt();

        System.out.println("Informe quanto você ganha por hora: ");
        moneyHour = input.nextDouble();

        //Logical operations
        salaryBrute = (hoursWork * moneyHour);

        if (salaryBrute <= 900){
            System.out.println("Você está isento de imposto de renda");
        } else if (salaryBrute > 900 && salaryBrute <= 1500){
            System.out.println("Salário bruto: "+salaryBrute);
            ir = (salaryBrute * 0.05);
            inss = (salaryBrute * 0.10);
            fgts = (salaryBrute * 0.11);
            salaryLiquid = (salaryBrute - (ir+inss));
            System.out.println("Desconto do IR: R$"+ir);
            System.out.println("Desconto do INSS: R$"+inss);
            System.out.println("Total de descontos: R$"+(ir+inss));
            System.out.println("Salário líquido: R$"+salaryLiquid);
            System.out.println("Seu depósito de FGTS: R$"+fgts);
        } else if (salaryBrute > 1500 && salaryBrute <= 2500){
            System.out.println("Salário bruto: "+salaryBrute);
            ir = (salaryBrute * 0.10);
            inss = (salaryBrute * 0.10);
            fgts = (salaryBrute * 0.11);
            salaryLiquid = (salaryBrute - (ir+inss));
            System.out.println("Desconto do IR: R$"+ir);
            System.out.println("Desconto do INSS: R$"+inss);
            System.out.println("Total de descontos: R$"+(ir+inss));
            System.out.println("Salário líquido: R$"+salaryLiquid);
            System.out.println("Seu depósito de FGTS: R$"+fgts);
        } else if (salaryBrute > 2500){
            System.out.println("Salário bruto: "+salaryBrute);
            ir = (salaryBrute * 0.20);
            inss = (salaryBrute * 0.10);
            fgts = (salaryBrute * 0.11);
            salaryLiquid = (salaryBrute - (ir+inss));
            System.out.println("Desconto do IR: R$"+ir);
            System.out.println("Desconto do INSS: R$"+inss);
            System.out.println("Total de descontos: R$"+(ir+inss));
            System.out.println("Salário líquido: R$"+salaryLiquid);
            System.out.println("Seu depósito de FGTS: R$"+fgts);
        }
    }
}
