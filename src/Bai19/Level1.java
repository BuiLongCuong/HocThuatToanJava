package Bai19;

import java.util.Arrays;

public class Level1 {
    public static void main(String[] args) {

        //chưa hoàn chỉnh


        int[] arr1 = new int[]{8, 4, 8, 5, 4, 9,10,50};
        int[] arr2 = new int[]{3, 8, 8, 8, 8, 4, 7,10,2};
        int[] a = checkSum(arr1,arr2,100);
        if(a!=null){
            System.out.println(Arrays.toString(a));
        }else {
            System.out.println("Không có cặp số nào cả");
        }
    }
    public static int[] checkSum(int[] arr1,int[] arr2, int number){
        int[] resultArr = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(number == arr1[i] * arr2[j] ){
                    resultArr[0] =arr1[i];
                    resultArr[1] =arr2[j];
                }
            }
        }
        return resultArr;
    }
}
