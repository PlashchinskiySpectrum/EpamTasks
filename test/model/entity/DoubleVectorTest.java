package model.entity;

import by.epam.javatraining.plaschinskiy.model.entity.DoubleVector;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class DoubleVectorTest {
    @Test
    public void testDefaultConstructor(){
        DoubleVector doubleVector = new DoubleVector();

        int expected = doubleVector.DEFAULT_SIZE;
        int actual = doubleVector.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithParameter(){
        int size = 5;
        DoubleVector doubleVector = new DoubleVector(size);

        int expected = size;
        int actual = doubleVector.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testCopyConstructor(){
        double []arr = {1,2,3};
        DoubleVector doubleVector = new DoubleVector(arr);

        String expected = Arrays.toString(arr);
        String actual = doubleVector.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetArray(){
        double []arr = {1,2,3};
        DoubleVector doubleVector = new DoubleVector(arr);

        String expected = Arrays.toString(arr);
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testSetArray(){
        double []arr = {1,2,3};
        DoubleVector doubleVector = new DoubleVector();
        doubleVector.setArray(arr);

        String expected = Arrays.toString(arr);
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testGetElementByIndex(){
        double []arr = {1,2,3};
        DoubleVector doubleVector = new DoubleVector();
        doubleVector.setArray(arr);

        double expected = 2;
        double actual = doubleVector.getElementByIndex(1);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetIndexOfFirstFoundElement(){
        double []arr = {1,2,3};
        DoubleVector doubleVector = new DoubleVector();
        doubleVector.setArray(arr);

        double expected = 1;
        double actual = doubleVector.getIndexOfFirstFoundElement(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSetElementByIndex(){
        DoubleVector doubleVector = new DoubleVector(3);
        int index = 1;
        int value = 2;

        doubleVector.setElementByIndex(index, value);

        double expected = 2;
        double actual = doubleVector.getElementByIndex(index);

        assertEquals(expected, actual);
    }

    @Test
    public void testToString(){
        double []arr = {1,2,3};
        DoubleVector doubleVector = new DoubleVector(arr);

        String expected = "[1.0, 2.0, 3.0]";
        String actual = doubleVector.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        DoubleVector doubleVector = new DoubleVector(3);

        int expected = 3;
        int actual = doubleVector.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testLength(){
        DoubleVector doubleVector = new DoubleVector(5);
        int length = 3;
        for (int i = 0; i < length; i++){
            doubleVector.setElementByIndex(i, i+1);
        }

        int expected = length;
        int actual = doubleVector.length();

        assertEquals(expected, actual);
    }

    @Test
    public void testAdd(){
        DoubleVector doubleVector = new DoubleVector(3);
        doubleVector.add(1);

        double expected = 1;
        double actual = doubleVector.getElementByIndex(0);

        assertEquals(expected, actual);
    }

    @Test
    public void swapTest(){
        double []arr = {1,2,3,4,5};
        DoubleVector doubleVector = new DoubleVector(arr);
        doubleVector.swap(0,4);

        String expected = "[5.0, 2.0, 3.0, 4.0, 1.0]";
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }
}
