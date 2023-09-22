package Bai3;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        int a = input.nextInt();
        System.out.println("Nhập số b:");
        int b = input.nextInt();
        check(a, b);
    }

    public static void check(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
