package Bai1;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Nhập độ dài 3 cạnh tam giác ===");
        System.out.println("Nhập cạnh a:");
        double side1 = input.nextDouble();
        System.out.println("Nhập cạnh b:");
        double side2 = input.nextDouble();
        System.out.println("Nhập cạnh c:");
        double side3 = input.nextDouble();
        checkTriangle(side1,side2,side3);
    }
    public static void checkTriangle(double a, double b,double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if ( a == b && a == c && b == c ) {
                System.out.println("Bạn có tam giác đều ");
            } else if (a == b  || a == c  || b==c) {
                System.out.println("Bạn có tam giác cân");
            } else if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(a * a + c * c) || c == Math.sqrt(a * a + b * b)) {
                System.out.println("Bạn có tam giác vuông");
            } else if (a == Math.sqrt(b * b + c * c) && b == c || b == Math.sqrt(a * a + c * c) && a == c || c == Math.sqrt(a * a + b * b) && a == b) {
                System.out.println("Bạn có tam giác vuông cân");
            }else {
                System.out.println("Bạn có một tam giác nhọn");
            }

        } else {
            System.out.println("Không đủ đủ độ dài để có một tam giác! ");

        }
    }
}
