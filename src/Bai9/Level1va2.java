package Bai9;

public class Level1va2 {
    public static void main(String[] args) {
        int bankNote1 = 1000;
        int bankNote2 = 2000;
        int bankNote5 = 5000;
        int sum = 20000;
        int count=0;
        for (int i = 1; i <= sum/bankNote1; i++) {
            for (int j = 1; j <= sum/bankNote2; j++) {
                for (int k = 1; k <= sum/bankNote5; k++) {
                    if(bankNote1*i + bankNote2*j + bankNote5*k == sum){
                        System.out.println(i + " " + j + " " + k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
