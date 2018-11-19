package by.epam.javatraining.plaschinskiy.model.logic;

import by.epam.javatraining.plaschinskiy.model.entity.DoubleVector;

import java.util.Arrays;

public class VectorLogic {
    public static double findMin (DoubleVector doubleVector){
        if(doubleVector.size() > 0) {
            double min = doubleVector.getElementByIndex(0);
            for (double i : doubleVector.getArray()) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
        return -1;
    }

    public static double findMax (DoubleVector doubleVector){
        if(doubleVector.size() > 0) {
            double max = doubleVector.getElementByIndex(0);
            for (double i : doubleVector.getArray()) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
        return -1;
    }

    public static double findAverageArithmetic(DoubleVector doubleVector){
        if(doubleVector.size() > 0) {
            double sum = 0;
            for (double i : doubleVector.getArray()) {
                sum += i;
            }
            return sum / doubleVector.size();
        }
        return -1;
    }

    public static double findAverageGeometric(DoubleVector doubleVector) {
        if(doubleVector.size() > 0) {
            double mul = 1;
            for (double i : doubleVector.getArray()) {
                mul *= i;
            }
            return Math.pow(mul, (1.0 / doubleVector.size()));
        }
        return -1;
    }

    public static double findFirstLocalMin(DoubleVector doubleVector){
        if(doubleVector.size() > 0) {
            double firstLocalMin = -1;
            for (int i = 1; i < doubleVector.size() - 1; i++) {
                if (doubleVector.getElementByIndex(i) < doubleVector.getElementByIndex(i - 1) &&
                        doubleVector.getElementByIndex(i) < doubleVector.getElementByIndex(i + 1)) {
                    firstLocalMin = doubleVector.getElementByIndex(i);
                    break;
                }
            }
            return firstLocalMin;
        }
        return -1;
    }

    public static double findFirstLocalMax(DoubleVector doubleVector){
        if(doubleVector.size() > 0) {
            double firstLocalMax = -1;
            for (int i = 1; i < doubleVector.size() - 1; i++) {
                if (doubleVector.getElementByIndex(i) > doubleVector.getElementByIndex(i - 1) &&
                        doubleVector.getElementByIndex(i) > doubleVector.getElementByIndex(i + 1)) {
                    firstLocalMax = doubleVector.getElementByIndex(i);
                    break;
                }
            }
            return firstLocalMax;
        }
        return -1;
    }

    public static boolean isSorted(DoubleVector doubleVector){
        boolean isSorted = false;
        if(doubleVector.size() > 0) {
            int countSortedToUp = 1;
            int countSortedToDown = 1;
            for (int i = 0; i < doubleVector.size() - 1; i++) {
                if (doubleVector.getElementByIndex(i) <= doubleVector.getElementByIndex(i + 1)) {
                    countSortedToUp++;
                }
                if (doubleVector.getElementByIndex(i) >= doubleVector.getElementByIndex(i + 1)) {
                    countSortedToDown++;
                }
            }
            if (countSortedToDown == doubleVector.size() || countSortedToUp == doubleVector.size()) {
                isSorted = true;
            }
            return isSorted;
        }
        return isSorted;
    }

    public static double[] reverse(DoubleVector doubleVector){
        if(doubleVector.size() > 0) {
            for (int i = 0, j = doubleVector.size() - 1; i < doubleVector.size() / 2; i++, j--) {
                doubleVector.swap(i, j);
            }
        }
        return doubleVector.getArray();
    }

    public static double[] bubbleSortToUpper(DoubleVector doubleVector){
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < doubleVector.size()-1; i++) {
                if(doubleVector.getElementByIndex(i) > doubleVector.getElementByIndex(i+1)){
                    isSorted = false;
                    doubleVector.swap(i, i+1);
                }
            }
        }
        return doubleVector.getArray();
    }

    public static double[] insertSortToUpper(DoubleVector doubleVector) {
        double tmp;
        int j;
        for(int i = 0; i < doubleVector.size() - 1; i++){
            if (doubleVector.getElementByIndex(i) > doubleVector.getElementByIndex(i + 1)){
                tmp = doubleVector.getElementByIndex(i + 1);
                doubleVector.setElementByIndex(i+1, doubleVector.getElementByIndex(i));
                j = i;
                while (j > 0 && tmp < doubleVector.getElementByIndex(j - 1)) {
                    doubleVector.setElementByIndex(j, doubleVector.getElementByIndex(j - 1));
                    j--;
                }
                doubleVector.setElementByIndex(j, tmp);
            }
        }
        return doubleVector.getArray();
    }

    public static double[] mergeSortToUpper(DoubleVector doubleVector, int l, int r) {
        if (r <= l)
            return doubleVector.getArray();
        int mid = l + (r - l) / 2;
        mergeSortToUpper(doubleVector, l, mid);
        mergeSortToUpper(doubleVector, mid + 1, r);

        double[] buf = Arrays.copyOf(doubleVector.getArray(), doubleVector.size());

        for (int k = l; k <= r; k++) {
            buf[k] = doubleVector.getElementByIndex(k);
        }

        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                doubleVector.setElementByIndex(k, buf[j]);
                j++;
            } else if (j > r) {
                doubleVector.setElementByIndex(k, buf[i]);
                i++;
            } else if (buf[j] < buf[i]) {
                doubleVector.setElementByIndex(k, buf[j]);
                j++;
            } else {
                doubleVector.setElementByIndex(k, buf[i]);
                i++;
            }
        }
        return doubleVector.getArray();
    }

    public static double[] quickSortToUpper(DoubleVector doubleVector, int l, int r) {
        if (doubleVector.size() == 0 || l >= r)
            return doubleVector.getArray();

        int m = l + (r - l) / 2;
        double thrustElement = doubleVector.getElementByIndex(m);

        int i = l, j = r;
        while (i <= j) {
            while (doubleVector.getElementByIndex(i) < thrustElement) {
                i++;
            }
            while (doubleVector.getElementByIndex(j) > thrustElement) {
                j--;
            }

            if (i <= j) {
                doubleVector.swap(i, j);
                i++;
                j--;
            }
        }
        if (l < j)
            quickSortToUpper(doubleVector, l, j);

        if (r > i)
            quickSortToUpper(doubleVector, i, r);

        return doubleVector.getArray();
    }

    public static int binarySearch(DoubleVector doubleVector, double key, int l, int r) {
        if(!isSorted(doubleVector)){
            quickSortToUpper(doubleVector, 0, doubleVector.size() - 1);
        }
        int m = l + (r - l) / 2;

        if (doubleVector.getElementByIndex(m) == key)
            return m;

        else if (doubleVector.getElementByIndex(m) > key)
            return binarySearch(doubleVector, key, l, m);
        else
            return binarySearch(doubleVector, key, m + 1, r);
    }
}
