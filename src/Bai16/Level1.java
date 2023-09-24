package Bai16;

public class Level1 {
    public static void main(String[] args) {
        int[] arrNumbers = new int[]{6,26,4,12,47,26,39,86,26,2,9,26,12,7,26};
        System.out.println("Số lần lặp của số 26 là: "+count(arrNumbers,26));
    }
    public static int count(int[] arr, int number){
        int count=0;
        int repeatingNumber = number;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==repeatingNumber){
                count++;
            }
        }
        return count;
    }
}
