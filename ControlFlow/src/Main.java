class Main {
    static void main() {
        displayBreak("Comparison Operator");
        ComparisonOperator.operators();

        displayBreak("Logical Operator");
        LogicalOperator.isEligible();

        displayBreak("If Statement");
        displayBreak("Temperature");

        IfStatement.temperature();

        displayBreak("Income");

        IfStatement.income();

        displayBreak("Switch Statement");

        SwitchStatement.checkRole();
    }

    private static void displayBreak(String title){
        System.out.println("----------------");
        System.out.println(title + ":");
        System.out.println();
    }
}