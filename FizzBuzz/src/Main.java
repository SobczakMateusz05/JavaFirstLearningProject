import java.util.Scanner;

class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main() {
        stringBuilderAnswer(provideNumber());

        scanner.close();
    }

    private static int provideNumber() {
        System.out.print("Number: ");
        return scanner.nextInt();
    }

    private static void displayAnswer(int number) { // My first solution
        boolean isDivisibleByFive = (number % 5 == 0);
        boolean isDivisibleByThree = (number % 3 == 0);

        if(isDivisibleByFive)
            System.out.print("Fizz");

        if(isDivisibleByThree)
            System.out.print("Buzz");

        if(!isDivisibleByThree && !isDivisibleByFive)
            System.out.print(number);
    }

    private static void stringBuilderAnswer(int number) {
        StringBuilder sb = new StringBuilder();

        if(number % 5 == 0)
            sb.append("Fizz");

        if(number % 3 == 0)
            sb.append("Buzz");

        String answer = sb.toString();

        System.out.println(answer.isEmpty() ? number : answer);
    }
}
