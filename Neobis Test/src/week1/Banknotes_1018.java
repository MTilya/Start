package week1;

import java.util.*;

public class Banknotes_1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        System.out.println(money);
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
            for (int i = 0; i < banknotes.length;i++){
                int sum = money / banknotes[i];
                money -= sum * banknotes[i];
                System.out.println(sum + " nota(s) de R$ " + banknotes[i] + ",00" );
            }
    }
}
