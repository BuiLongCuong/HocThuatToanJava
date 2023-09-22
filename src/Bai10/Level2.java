package Bai10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[3];
//        System.out.println("Nhập số a:");
//        int nb1 = input.nextInt();
//        arr[0] = nb1;
//        System.out.println("Nhập số b:");
//        int nb2 = input.nextInt();
//        arr[1] = nb2;
//        System.out.println("Nhập số c:");
//        int nb3 = input.nextInt();
//        arr[2] = nb3;
//        int size=arr.length;
//        int count = 0;
//        ArrayList<String> arrResult = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                for (int k = 0; k < size; k++) {
//                    if (i != j && i != k && j != k) {
////                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//                        count++;
//                        String newString =  arr[i] + " " + arr[j] + " " + arr[k];
//                        boolean flag = false;
//                        for (String string: arrResult) {
//                            if(string.equals(newString)){
//                                flag = true;
//                                break;
//                            }
//                        }
//                        if(flag){
//                            continue;
//                        }
//                        arrResult.add(newString);
//                    }
//                }
//                for (String string: arrResult) {
//                    System.out.println(string);
//                }
//            }
//        }
//        System.out.println(count);



        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị của a, b và c
        System.out.print("Nhập giá trị của a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị của b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập giá trị của c: ");
        int c = scanner.nextInt();

        System.out.println("Các số 3 chữ số có thể tạo ra từ " + a + ", " + b + ", và " + c + " là:");

        // Liệt kê các số 3 chữ số
        for (int i = 100; i <= 999; i++) {
            int digit1 = i / 100;
            int digit2 = (i / 10) % 10;
            int digit3 = i % 10;

            if ((digit1 == a || digit1 == b || digit1 == c)
                    && (digit2 == a || digit2 == b || digit2 == c)
                    && (digit3 == a || digit3 == b || digit3 == c)) {
                System.out.print(i + " ");
            }
        }
//        scanner.close();
    }
}
