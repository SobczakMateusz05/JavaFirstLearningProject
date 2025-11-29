import java.util.Scanner;

public class IfStatement {
    final static Scanner scanner = new Scanner(System.in);

    public static void temperature() {
        float temperature = provideTemperature();

        checkTemperature(temperature);
    }

    public static void income(){
        int income = provideIncome() ;
        boolean hasHighIncome = (income > 100_000);
        String className = hasHighIncome ? "First" : "Economic" ; // Ternary operator

        System.out.println("has high income?: " + hasHighIncome);
        System.out.println("class: " + className);
    }

    private static float provideTemperature() {
        System.out.print("Please enter the temperature in Celsius: ");
        return scanner.nextFloat();
    }

    private static void checkTemperature(float temperature) {
        if (temperature > 30) { //  more than 30
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temperature >= 20) { // between 20 nad 30
            System.out.println("It's a nice day");
        } else { // less than 20
            System.out.println("It's cold");
        }
    }

    private static int provideIncome(){
        System.out.print("Please enter the annual income: ");
        return scanner.nextInt();
    }
}
