package week1;

import java.util.Scanner;

public class BanknotesAndCoins_1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        System.out.println(money);
        int[] banknotes = {100, 50, 20, 10, 5, 2};
        float[] banknotesCoin = {1f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f};
        System.out.println("NOTAS:");
        for (int i = 0; i < banknotes.length; i++) {
            int sum = (int) money / banknotes[i];
            money -= sum * banknotes[i];
            System.out.println(sum + " nota(s) de R$ " + banknotes[i] + ",00");
        }
        System.out.println("MOEDAS:");
        for (int j = 0; j < banknotesCoin.length;j++){
            double sum = money % banknotesCoin[j];
            money -= sum * banknotesCoin[j];
            System.out.println(sum + " nota(s) de R$ " + banknotesCoin[j]  );
        }
    }
}
