package Bai4;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        System.out.println("Nhập số b:");
        double b = input.nextDouble();
        System.out.println("Tổng các số từ a đến b là: "+sum(a,b));
    }
    public static double sum(double a,double b){
        double sum =0;
        for (double i = a; i <=b; i++) {
            sum+=i;
        }
        return sum;
    }
}
