package Bai15;

public class Level1 {
    public static void main(String[] args) {
        int[] arrNumbers1 = new int[]{26, 4, 12, 26, 86, 26, 2, 9, 26, 12, 7, 26};
        int[] arrNumbers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean isAscending = checkIncreasing(arrNumbers2);
        if(isAscending == true){
            System.out.println("Mảng này là mảng đang tăng");
        }else {
            System.out.println("Mảng này là mảng không tăng");
        }
    }

    public static boolean checkIncreasing(int[] arr) {
        if( arr.length<2){
            return true;
        }
        boolean isAscending = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[i+1]){
                isAscending = false;
                break;
            }
        }
        return isAscending;
    }
}
