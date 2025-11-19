package com.matis;



public class Main {
    static void main() {
        System.out.println("Hello World!");

        variableTypesDisplay();
        variablesTypesDifferencesDisplay();

        stringMethodsDisplay();

        ArraysDisplay();
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

    private static void stringMethodsDisplay(){
        displayBreak("String Transformation Methods");
        StringMethods.transformationMethods();

        displayBreak("String Findings Methods");
        StringMethods.findingMethods();
    }

    private static void ArraysDisplay(){
        displayBreak("Basic Arrays Operations");
        ArraysFundaments.basicOperation();

        displayBreak("Multidimensional Arrays");
        ArraysFundaments.multiDimensionalArray();
    }
}
