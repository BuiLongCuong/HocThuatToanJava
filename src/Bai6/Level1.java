package Bai6;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        divisor(a);
        multiples(a);
    }
    public static void divisor(double a){
        System.out.println("Các ước số của số bạn vừa nhập vào: ");
        for (int i = 1; i <=a; i++) {
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
    public static void multiples(double a){
        System.out.println("Các bội số của số bạn vừa nhập vào: ");
        for (double i = a; i <=100 ; i++) {
            if(i%a==0){
                System.out.println(i);
            }
        }
    }
}
