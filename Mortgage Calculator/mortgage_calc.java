import java.util.Locale;
import java.util.Scanner;

public class mortgage_calc {
    public static void main(String[] args) {

        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT; // monthly interest rate

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        double numberOfPayments = period * MONTHS_IN_YEAR; // number of payments

        double common = Math.pow((1 + monthlyInterestRate), numberOfPayments);

        double amount = principal * ((monthlyInterestRate * common) / (common - 1));

        String mortgage = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(amount);

        System.out.println("Mortgage: " + mortgage);

        scanner.close();

        // avoiding magic numbers in the code by defining constants and final variables
        // variable names should be proper not magic names.
    }
}
