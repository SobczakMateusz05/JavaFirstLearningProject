package com.matis;

public class StringMethods {
    public static void transformationMethods(){
        String text = "Test" + "!";
        String textToTrim = "   Test " + "!   ";

        System.out.println("The text is: " + text);
        System.out.println();
        System.out.println("toLowerCase: " + text.toLowerCase());
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("replace: " + text.replace("!", "s"));
        System.out.println("before trim: " + textToTrim);
        System.out.println("after trim: " + textToTrim.trim());
        System.out.println("substring: " +  text.substring(1, 4));
        System.out.println();
        System.out.println("The original text is: " + text);

    }

    public static void findingMethods(){
        String text = "Test" + "!";

        System.out.println("The text is: " + text);
        System.out.println();
        System.out.println("charAt: " + text.charAt(4));
        System.out.println("contains 't': " + text.contains("t"));
        System.out.println("contains 'S': " + text.contains("S"));
        System.out.println("startsWith 'T': " + text.startsWith("T"));
        System.out.println("startsWith 't': " + text.startsWith("t"));
        System.out.println("endsWith '!': " + text.endsWith("!"));
        System.out.println("endsWith '*': " + text.endsWith("*"));
        System.out.println("indexOf 'e': " + text.indexOf("e"));
        System.out.println("indexOf 'E': " + text.indexOf("E"));
        System.out.println();
        System.out.println("The original text is: " + text);
    }
}
