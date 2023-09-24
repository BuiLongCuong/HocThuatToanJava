package Bai17;

import java.util.ArrayList;
public class Level1 {



    //Chưa chạy được



    public static void main(String[] args) {
        int[] arr1 = new int[]{8, 4, 8, 5, 4, 9};
        int[] arr2 = new int[]{3, 8, 8, 8, 8, 4, 7};
        System.out.println(checkCommonElement(arr1,arr2));
    }
    public static ArrayList<Integer> checkCommonElement(int[] arr1, int[] arr2){
       ArrayList<Integer> commonElement = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    commonElement.add(arr1[i]);
                }
            }
        }
        return commonElement;
    }




}
