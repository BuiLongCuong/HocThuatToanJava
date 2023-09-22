package Bai11;

public class Level1 {
    public static void main(String[] args) {
        int[] arr = new int[]{6,4,12,47,39,86,2,9,12,7};
        System.out.println("Các phần tử chẵn trong mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
