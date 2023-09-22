package Bai14;

public class Level3 {
    public static void main(String[] args) {
        int[] arrNumbers = new int[]{6,4,12,47,39,86,2,9,12,7};
        System.out.println("Trung bình các phần tử là: "+check(arrNumbers));
    }
    public static int check(int[] arr){
        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            count++;
        }
        int avg=sum/count;
        return avg;
    }
}
