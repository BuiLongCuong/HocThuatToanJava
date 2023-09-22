package Bai13;

public class Level3 {
    public static void main(String[] args) {
        int[][] arrNumbers = {
            {6,4,12,47,21},
            {5,9,15,55,26},
        };
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều là: "+ max(arrNumbers));
    }
    public static int max(int[][] arr){
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
