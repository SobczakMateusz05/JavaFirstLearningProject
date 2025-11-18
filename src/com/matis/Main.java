package com.matis;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        variableTypesDisplay();
        variablesTypesDifferencesDisplay();
    }

    private static void displayBreak(String title){
        System.out.println("----------------");
        System.out.println(title + ":");
        System.out.println();
    }

    private static void variableTypesDisplay(){
        PrimitivesTypes primitiveVariables = new PrimitivesTypes();
        ReferencesTypes referencesVariables = new ReferencesTypes();

        displayBreak("Variable Types");
        System.out.println("Decimal Number: " + primitiveVariables.decimalNumber);
        System.out.println("Date: " + referencesVariables.date);
    }

    private static void variablesTypesDifferencesDisplay(){
        displayBreak("Primitive Variables");

        VariableTypesDifferences.primitiveVariables();

        displayBreak("Reference Variables");

        VariableTypesDifferences.referenceVariables();

        displayBreak("String Variable");

        VariableTypesDifferences.stringVariable();
    }
}
