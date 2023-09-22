package Bai2;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình của học sinh:");
        double scores = input.nextDouble();
        check(scores);
    }
    public static void check( double diem){
        if(diem <10 && diem >=8){
            System.out.println("Học sinh giỏi");
        }else if(diem <8 && diem >=5){
            System.out.println("Học sinh tiên tiến");
        }else if(diem <5 && diem >=3){
            System.out.println("Học sinh trung bình");
        }else {
            System.out.println("Học sinh yếu");
        }
    }
}
