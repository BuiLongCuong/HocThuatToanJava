
package Bai15;
import java.util.Arrays;

public class Level3 {
//    public static void main(String[] args) {
//        int[] arr1 = new int[]{8, 4, 8, 5, 4, 9};
//        int[] arr2 = new int[]{3, 8, 8, 8, 8, 4, 7};
//        System.out.println("Có "+checkCouple(arr1,arr2)+" cặp được chọn.");
//    }
//    public static int checkCouple(int[] arr1,int[] arr2){
//        int count=0;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//               while (arr2[j]==arr1[i]){
//                   count++;
//               }
//               continue;
//            }
//        }
//        return count;
//    }

        public static void main(String[] args) {
            int[] companyA = {8, 4, 8, 5, 4, 9};
            int[] companyB = {3, 8, 8, 8, 8, 4, 7};

            int maxPairs = findMaxPairs(companyA, companyB);
            System.out.println("Số cặp ống có độ cao bằng nhau nhiều nhất là: " + maxPairs);
        }

        public static int findMaxPairs(int[] companyA, int[] companyB) {
            // Sắp xếp độ dài của ống của hai công ty theo thứ tự tăng dần
            Arrays.sort(companyA);
            Arrays.sort(companyB);

            int maxPairs = 0; // Số cặp ống có độ cao bằng nhau
            int i = 0, j = 0;

            // Sử dụng hai biến i và j để duyệt qua từng ống của hai công ty
            while (i < companyA.length && j < companyB.length) {
                int heightA = companyA[i];
                int heightB = companyB[j];

                if (heightA == heightB) {
                    // Nếu độ cao của hai ống bằng nhau, tăng số cặp lên và tăng cả i và j
                    maxPairs++;
                    i++;
                    j++;
                } else if (heightA < heightB) {
                    // Nếu ống của công ty A ngắn hơn, tăng chỉ số i
                    i++;
                } else {
                    // Nếu ống của công ty B ngắn hơn, tăng chỉ số j
                    j++;
                }
            }

            return maxPairs;
        }

}
