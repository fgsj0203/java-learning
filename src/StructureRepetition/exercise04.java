package StructureRepetition;

public class exercise04 {
    public static void main(String[] args) {
        //Section of variables
        double countryA = 80000;
        double countryB = 200000;
        double taxCountryA = 1.03;
        double taxCountryB = 1.015;
        int years = 0;

        //Logical operations
        while (countryA <= countryB){
            countryA = countryA * taxCountryA;
            countryB = countryB * taxCountryB;
            years = years + 1;
        }
        System.out.println("Em "+years+" Anos A ultrapassou B");

    }

}
