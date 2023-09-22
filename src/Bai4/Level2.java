package Bai4;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        System.out.println("Nhập số b:");
        double b = input.nextDouble();
        System.out.println("Tổng các số chẵn từ a đến b là: "+sumEvenNumbers(a,b));
    }
    public static double sumEvenNumbers(double a,double b){
        double sum =0;
        for (double i = a; i <=b; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
