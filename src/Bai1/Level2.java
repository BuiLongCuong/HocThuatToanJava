package Bai1;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
       double number1 = input.nextDouble();
        System.out.println("Nhập số b:");
        double number2 = input.nextDouble();
        System.out.println("Nhập số c:");
        double number3 = input.nextDouble();
        max(number1,number2,number3);
    }
    public static void max(double a, double b, double c){
        if(a>b && a>c){
            System.out.println("Số "+ a +" là số lớn nhất");
        }else if(b>c){
            System.out.println("Số "+ b +" là số lớn nhất");
        }else {
            System.out.println("Số "+ c +" là số lớn nhất");
        }
    }
}
