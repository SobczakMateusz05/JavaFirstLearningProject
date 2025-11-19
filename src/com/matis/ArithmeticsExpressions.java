package com.matis;

public class ArithmeticsExpressions {
    public static void basicsOperations(){
        byte operand = 1;
        String stringOperand = "3";

        int sum = operand + 2; // It's possible cause implicit casting
        int sub = Integer.parseInt(stringOperand) - 2; // It's possible cause explicit casting
        int mul = 4 * 5;
        double div = (double)5 / 3; // It's possible cause explicit casting

        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);
    }

    public static void shorthands(){
        int x = 0;
        int y = x++;

        System.out.println("x: " + x);
        System.out.println("y = x++: " + y);

        x = 0;
        y = ++x;

        System.out.println("y = ++x: " + y);

        x += 2;
        x -= 1;
        x *= 3;
        x /= 2;
    }
}
