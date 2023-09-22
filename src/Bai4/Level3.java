package Bai4;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số x:");
        double a = input.nextDouble();
        System.out.println("Nhập số y:");
        double b = input.nextDouble();
        System.out.println("Tổng bình phương các số từ x đến y:" + sumOfSquares(a,b));
    }
    public static double sumOfSquares(double a, double b){
        double sum =0;
        for (double i = a; i <=b; i++) {
            sum+=i*i;
        }
        return sum;
    }
}
