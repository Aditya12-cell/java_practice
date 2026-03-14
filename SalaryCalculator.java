//slary calculator

import java.util.Scanner;

public class SalaryCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your basic salary:");
        double basicSalary = sc.nextDouble();

        System.out.println("Enter your allowances:");
        double allowances = sc.nextDouble();

        System.out.println("Enter your deductions:");
        double deductions = sc.nextDouble();    

        double netSalary = basicSalary + allowances - deductions;
        System.out.println("Your net salary is: " + netSalary);

        sc.close();
    }
}