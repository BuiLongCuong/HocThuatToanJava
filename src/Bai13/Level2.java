package Bai13;

public class Level2 {
    public static void main(String[] args) {
        int[] arrNumbers = new int[]{6,4,12,47,39,86,2,9,12,7};
        System.out.println(findSecondLarge(arrNumbers));
    }
  public static int findSecondLarge(int[] arr){
        int max= 0;
        int secondMax=0;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i]>max){
              secondMax = max;
              max = arr[i];
          }else if(arr[i]>secondMax && arr[i]!=max){
              secondMax =arr[i];
          }
      }
      return secondMax;
  }

}
