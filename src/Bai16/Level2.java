package Bai16;

public class Level2 {
    public static void main(String[] args) {
        int[] arrNumbers = new int[]{26,4,12,26,86,26,2,9,26,12,7,26};
        appearsOnlyOnce(arrNumbers);
    }
    public static void appearsOnlyOnce(int[] arr){
        int count;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
