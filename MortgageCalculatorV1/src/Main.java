import java.text.NumberFormat;
import java.util.Scanner;

class Main {
    private static final byte PERCENT = 100;
    private static final byte MONTHS_IN_YEAR = 12;
    private static final Scanner scanner = new Scanner(System.in);

    public void main() {
        int principal = providePrincipal();
        double monthlyInterest = provideMonthlyInterest();
        int monthsPeriod = provideMonthsPeriod();

        double mortgage = calculateMonthlyPayment(principal, monthlyInterest, monthsPeriod);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        displayMortgage(formattedMortgage);
    }

    private static double calculateMonthlyPayment(int principal, double monthlyInterest, int period) {
        int monthsPeriod = period * MONTHS_IN_YEAR;

        return principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), monthsPeriod)
                / (Math.pow((monthlyInterest + 1), monthsPeriod) - 1));
    }

    private static int providePrincipal() {
        System.out.print("Principal: ");
        return scanner.nextInt();
    }

    private static double provideMonthlyInterest() {
        System.out.print("Annual Interest Rate: ");

        return scanner.nextDouble() / PERCENT / MONTHS_IN_YEAR;
    }

    private static int provideMonthsPeriod() {
        System.out.print("Period (Years): ");
        return scanner.nextInt() * MONTHS_IN_YEAR;
    }

    private static void displayMortgage(String mortgage) {
        System.out.println("Mortgage: " + mortgage);
    }

}
