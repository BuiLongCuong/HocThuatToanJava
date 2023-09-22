package Bai12;

public class Level1 {
    public static void main(String[] args) {
        int[] arr = new int[]{6,4,12,47,39,86,2,9,12,7};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println("Tổng các phần tử lẻ trong mảng là :"+sum);
    }
}
