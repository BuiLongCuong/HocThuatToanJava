package Bai3;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        int a = input.nextInt();
        System.out.println("Nhập số b:");
        int b = input.nextInt();
        check3(a, b);
        System.out.println("--------------------------------------------");
        check5(a, b);
        System.out.println("--------------------------------------------");
        check3And5(a, b);
    }
    public static void check3(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void check5(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void check3And5(int a, int b){
        for (int i = a; i <=b ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
