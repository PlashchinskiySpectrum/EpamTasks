package by.epam.javatraining.plaschinskiy.controller;

import by.epam.javatraining.plaschinskiy.model.entity.DoubleVector;
import by.epam.javatraining.plaschinskiy.model.logic.VectorLogic;
import by.epam.javatraining.plaschinskiy.util.VectorCreator;
import by.epam.javatraining.plaschinskiy.util.VectorInitializer;
import by.epam.javatraining.plaschinskiy.view.Printer;

public class DoubleVectorController {
    public static void main(String[] args) {
        DoubleVector doubleVector = VectorCreator.create(10);
        DoubleVector doubleVector1 = VectorCreator.create(10);
        DoubleVector doubleVector2 = VectorCreator.create(10);

        Printer.printString("Random initializing: ");
        VectorInitializer.randomInit(doubleVector, -10, 10);
        Printer.printString("Vector 1: " + doubleVector.toString() + "\n");

//        Printer.printString("User initializing: ");
//        Printer.printString("Input 10 double numbers: ");
//        VectorInitializer.userInit(doubleVector1);
//        Printer.printString("Vector 2: " + doubleVector1.toString() + "\n");
//
//        Printer.printString("Initializing from file: ");
//        VectorInitializer.fileInit(doubleVector2, "input.txt");
//        Printer.printString("Vector 2: " + doubleVector2.toString() + "\n");

        Printer.printString("Logic test for Vector 1: ");
        Printer.printString("Min value: " + VectorLogic.findMin(doubleVector) + "\n");
        Printer.printString("Max value: " + VectorLogic.findMax(doubleVector) + "\n");
        Printer.printString("Average arithmetic: " + VectorLogic.findAverageArithmetic(doubleVector) + "\n");
        Printer.printString("Average geometric: " + VectorLogic.findAverageGeometric(doubleVector) + "\n");
        Printer.printString("First local min: " + VectorLogic.findFirstLocalMin(doubleVector) + "\n");
        Printer.printString("First local max: " + VectorLogic.findFirstLocalMax(doubleVector) + "\n");
        Printer.printString("Is Vector 1 sorted: " + VectorLogic.isSorted(doubleVector) + "\n");
        Printer.printString("Reverse of Vector 1: " + new DoubleVector(VectorLogic.reverse(doubleVector)) + "\n");
        Printer.printString("Bubble sort of Vector 1: " + new DoubleVector(VectorLogic.bubbleSortToUpper(doubleVector)));
        Printer.printString("Insert sort of Vector 1: " + new DoubleVector(VectorLogic.insertSortToUpper(doubleVector)));
        Printer.printString("Merge sort of Vector 1: " + new DoubleVector(VectorLogic.mergeSortToUpper(doubleVector,
                0, doubleVector.size() - 1)));
        Printer.printString("Quick sort of Vector 1: " + new DoubleVector(VectorLogic.quickSortToUpper(doubleVector,
                0, doubleVector.size() - 1)));
        Printer.printString("Binary Search of [value = 0] index in Vector 1: " +
                VectorLogic.binarySearch(new DoubleVector(VectorLogic.bubbleSortToUpper(doubleVector)),
                        0, 0, doubleVector.size() - 1));

    }
}
