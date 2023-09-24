package Bai18;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{8, 4, 8, 5, 4, 9};
//        ArrayList<> arr = new ArrayList<Integer>();
        System.out.println(Arrays.toString(maxNumericalAnalysis(arr1)));
    }

    public static int[] maxNumericalAnalysis(int[] arr) {
        int[] maxCouple = new int[2];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int numericalAnalysis = arr[i] * arr[j];
                if (numericalAnalysis > max) {
                    max = numericalAnalysis;
                    maxCouple[0] = arr[i];
                    maxCouple[1] = arr[j];
                }
            }
        }
        return maxCouple;
    }
}
