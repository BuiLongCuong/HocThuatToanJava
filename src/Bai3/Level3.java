package Bai3;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        int a = input.nextInt();
        System.out.println("Nhập số b:");
        int b = input.nextInt();
        squareNumber(a,b);
    }
    public static void squareNumber(int a, int b){
        for (int i = a; i <= b; i++) {
            if (isChinhPhuong(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    public static boolean isChinhPhuong(int x) {
        double sqrt = Math.sqrt(x);
        return sqrt == (int) sqrt;
    }
}
