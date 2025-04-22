import java.util.Scanner;

public class MortgageCalculator{
    public static void main(String[] args) {
        Double principal, annualInterestRate, period, Mortgage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        annualInterestRate = input.nextDouble() / 100;
        System.out.print("Enter the number of years: ");
        period = input.nextDouble() * 12;

        Mortgage = principal * ((annualInterestRate * Math.pow(1 + annualInterestRate, period)) / (Math.pow(1 + annualInterestRate, period) - 1));
        System.out.println("Mortgage = " + Mortgage);
    }
}