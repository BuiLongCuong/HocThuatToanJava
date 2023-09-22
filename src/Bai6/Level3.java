package Bai6;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập số a:");
//        double a = input.nextDouble();
//        System.out.println("Nhập số b:");
//        double b = input.nextDouble();


        //Code bẩn: =))
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số nguyên dương a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số nguyên dương b: ");
            int b = scanner.nextInt();

            // Tìm GCD của a và b
            int gcdResult = gcd(a, b);
            int lcmResult = lcm(a, b);
            System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcdResult);
            System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + lcmResult);
        }
        public static int gcd ( int a, int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
