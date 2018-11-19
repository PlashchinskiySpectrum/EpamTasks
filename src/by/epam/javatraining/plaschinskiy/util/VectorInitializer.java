package by.epam.javatraining.plaschinskiy.util;

import by.epam.javatraining.plaschinskiy.model.entity.DoubleVector;

import java.io.*;

public class VectorInitializer {
    public static DoubleVector randomInit(DoubleVector doubleVector, double l, double r){
        for(int i = 0; i < doubleVector.size(); i++){
            doubleVector.setElementByIndex(i, l + Math.random()*(r - l));
        }
        return doubleVector;
    }

    public static DoubleVector userInit(DoubleVector doubleVector){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < doubleVector.size(); i++) {
                doubleVector.setElementByIndex(i, Double.parseDouble(bufferedReader.readLine()));
            }
        }
        catch(IOException e){}
        return doubleVector;
    }

    public static DoubleVector fileInit(DoubleVector doubleVector, String fileName){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            for (int i = 0; i < doubleVector.size(); i++){
                doubleVector.setElementByIndex(i, Double.parseDouble(bufferedReader.readLine()));
            }
        }
        catch (FileNotFoundException e){}
        catch (IOException e){}
        return doubleVector;
    }
}
