package Bai5;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        System.out.println(sum(a));
    }
    public static double sum(double a){
        double sum=0;
        for (double i = 1; i <=a; i++) {
            sum+= (2*i+1)/(2*i+2);
        }
        return sum;
    }
}
