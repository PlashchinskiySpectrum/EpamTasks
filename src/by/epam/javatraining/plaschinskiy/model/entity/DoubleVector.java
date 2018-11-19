package by.epam.javatraining.plaschinskiy.model.entity;

import java.util.Arrays;

public class DoubleVector {
    public static final int DEFAULT_SIZE = 10;
    private double[] array;
    private int count = 0;

    public DoubleVector(){
        array = new double[DEFAULT_SIZE];
    }

    public DoubleVector(int size) {
        array = new double[size];
    }

    public DoubleVector(double[] arr){
        this.array = arr;
        count = array.length;
    }

    public double[] getArray(){
        return array;
    }

    public void setArray(double[] array){
        this.array = array;
        count = array.length;
    }

    public double getElementByIndex(int index){
        if(index >= 0 && index < array.length){
            return array[index];
        }
        return -1;
    }

    public double getIndexOfFirstFoundElement(double element){
        for (int i = 0; i < array.length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void setElementByIndex(int index, double value){
        if(index >= 0 && index < array.length) {
            array[index] = value;
            count++;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    //size - реальная вместительность массива
    public int size(){
        return array.length;
    }

    //length - количество заполненных элементов
    public int length(){
        return count;
    }

    public void add(double value){
        if(count < array.length){
            array[count++] = value;
        }
    }

    public void swap(int index1, int index2){
        double tmp = array[index2];
        array[index2] = array[index1];
        array[index1] = tmp;
    }
}
