package Bai5;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        System.out.println(sum(a));
    }
    public static double sum(double a){
        double sum=0;
        for (double i = 1; i <=a; i++) {
            sum+= i*(i+1);
        }
        return sum;
    }
}
