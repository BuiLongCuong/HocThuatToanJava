package Bai10;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Nhập số a:");
        int nb1 = input.nextInt();
        arr[0] = nb1;
        System.out.println("Nhập số b:");
        int nb2 = input.nextInt();
        arr[1] = nb2;
        System.out.println("Nhập số c:");
        int nb3 = input.nextInt();
        arr[2] = nb3;
        int size=arr.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
