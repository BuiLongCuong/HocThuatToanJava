package Bai1;

import javax.swing.plaf.SplitPaneUI;
import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số:");
        int number =  input.nextInt();
        check(number);
    }
    public static void check(int number){
        if(number%2==0){
            System.out.println("Số bạn vừa nhập là số chẵn!");
        }else {
            System.out.println("Số bạn vừa nhập là số lẻ!");
        }
    }
}
