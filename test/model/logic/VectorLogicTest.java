package model.logic;

import by.epam.javatraining.plaschinskiy.model.entity.DoubleVector;
import by.epam.javatraining.plaschinskiy.model.logic.VectorLogic;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class VectorLogicTest {
    @Test
    public void testFindMin(){
        double []arr = {1,5,0,5,-1,4};
        VectorLogic vectorLogic = new VectorLogic();

        double expected = -1.0;
        double actual = vectorLogic.findMin(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testFindMax(){
        double []arr = {1,5,0,5,-1,4};
        VectorLogic vectorLogic = new VectorLogic();

        double expected = 5.0;
        double actual = vectorLogic.findMax(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testFindAverageArithmetic(){
        double []arr = {1,5,1,5,2,4};
        VectorLogic vectorLogic = new VectorLogic();

        double expected = 3.0;
        double actual = vectorLogic.findAverageArithmetic(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testFindAverageGeometric(){
        double []arr = {1,2,3,4,5,6};
        VectorLogic vectorLogic = new VectorLogic();

        double expected = 2.9937951655239089549101605678894;
        double actual = vectorLogic.findAverageGeometric(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstLocalMin(){
        double []arr = {1,5,0,5,-1,4};
        VectorLogic vectorLogic = new VectorLogic();

        double expected = 0.0;
        double actual = vectorLogic.findFirstLocalMin(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstLocalMax(){
        double []arr = {1,5,0,5,-1,4};
        VectorLogic vectorLogic = new VectorLogic();

        double expected = 5.0;
        double actual = vectorLogic.findFirstLocalMax(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted(){
        double []arr = {5,4,3,2,1};
        VectorLogic vectorLogic = new VectorLogic();

        boolean expected = true;
        boolean actual = vectorLogic.isSorted(new DoubleVector(arr));

        assertEquals(expected, actual);
    }

    @Test
    public void testReverse(){
        double []arr = {1,2,3,4,5};
        VectorLogic vectorLogic = new VectorLogic();
        DoubleVector doubleVector = new DoubleVector(arr);

        vectorLogic.reverse(doubleVector);

        String expected = "[5.0, 4.0, 3.0, 2.0, 1.0]";
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testBubbleSortToUpper(){
        double []arr = {1,0,3,4,2};
        VectorLogic vectorLogic = new VectorLogic();
        DoubleVector doubleVector = new DoubleVector(arr);

        vectorLogic.bubbleSortToUpper(doubleVector);

        String expected = "[0.0, 1.0, 2.0, 3.0, 4.0]";
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testInsertSortToUpper(){
        double []arr = {1,0,3,4,2};
        VectorLogic vectorLogic = new VectorLogic();
        DoubleVector doubleVector = new DoubleVector(arr);

        vectorLogic.insertSortToUpper(doubleVector);

        String expected = "[0.0, 1.0, 2.0, 3.0, 4.0]";
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testMergeSortToUpper(){
        double []arr = {1,0,3,4,2,-1,13,5,9,7};
        VectorLogic vectorLogic = new VectorLogic();
        DoubleVector doubleVector = new DoubleVector(arr);

        vectorLogic.mergeSortToUpper(doubleVector, 0, doubleVector.size()-1);

        String expected = "[-1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 7.0, 9.0, 13.0]";
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testQuickSortToUpper(){
        double []arr = {1,0,3,4,2,-1,13,5,9,7};
        VectorLogic vectorLogic = new VectorLogic();
        DoubleVector doubleVector = new DoubleVector(arr);

        vectorLogic.quickSortToUpper(doubleVector, 0, doubleVector.size()-1);

        String expected = "[-1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 7.0, 9.0, 13.0]";
        String actual = Arrays.toString(doubleVector.getArray());

        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearch(){
        double []arr = {1,0,3,4,2,-1,13,5,9,7};
        VectorLogic vectorLogic = new VectorLogic();
        DoubleVector doubleVector = new DoubleVector(arr);

        double key = 4;

        int expected = 5;
        int actual = vectorLogic.binarySearch(doubleVector, key, 0, doubleVector.size() - 1);

        assertEquals(expected, actual);
    }
}


