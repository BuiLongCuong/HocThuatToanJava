package Bai12;

public class Level3 {
    public static void main(String[] args) {
        int[] arrNumbers = new int[]{6,4,12,47,39,86,2,9,12,7};
        System.out.println("Tổng các số chẵn trong mảng: "+sumEvenNumber(arrNumbers));
        System.out.println("Tổng các số lẻ trong mảng: "+sumOddNumber(arrNumbers));
        compare(sumEvenNumber(arrNumbers),sumOddNumber(arrNumbers));
    }
    public static int sumEvenNumber(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static int sumOddNumber(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void compare(int a, int b){
        if(a>b){
            System.out.println("Tổng các số chẵn trong mảng lớn hơn tổng các số lẻ trong mảng!");
        }else {
            System.out.println("Tổng các số lẻ trong mảng lớn hơn tổng các số chẵn trong mảng!");
        }
    }
}
