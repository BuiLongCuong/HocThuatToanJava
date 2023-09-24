package Bai15;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        int[] arrNumbers1 = new int[]{26, 4, 12, 26, 86, 26, 2, 9, 26, 12, 7, 26};
        int[] arrNumbers2 = new int[]{1, 3, 5, 6,8};

        boolean inside = checkInside(arrNumbers1,arrNumbers2);
        if(inside){
            System.out.println("Mảng 1 chứa mảng 2");
        }else {
            System.out.println("Mảng 1 không chứa mảng 2");
        }
    }
    public static boolean checkInside(int[] arr1, int[] arr2){
        boolean check = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j]==arr1[i]){
                    check =true;
                    break;
                }
            }
        }
        return check;
    }
}
