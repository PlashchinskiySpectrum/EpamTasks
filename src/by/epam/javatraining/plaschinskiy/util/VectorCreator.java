package by.epam.javatraining.plaschinskiy.util;

import by.epam.javatraining.plaschinskiy.model.entity.DoubleVector;

public class VectorCreator {
    public static DoubleVector create(int size){
        DoubleVector doubleVector = new DoubleVector(size);
        return doubleVector;
    }
}
