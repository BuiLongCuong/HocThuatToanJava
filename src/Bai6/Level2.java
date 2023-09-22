package Bai6;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {

        //Code bẩn
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = input.nextDouble();
        maxDivisor(a);
        minMultiples(a);
    }
    public static void maxDivisor(double a){
        int max=1;
        for (int i = 1; i <=a; i++) {
            if(a%i==0 && i%2!=0){
                max=i;
            }
        }
        System.out.println("Ước số lớn nhất là: "+ max);
    }
    public static void minMultiples(double a){
        int min =2;
        while (true) {
            if (min % a == 0) {
                break;
            }
           min += 1;
        }
        System.out.println("Bội số nhỏ nhất là :" + min);
    }
}
