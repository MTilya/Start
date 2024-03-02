package week1;

import java.util.Scanner;

public class BanknotesAndCoins_1021 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double dinheiroTotal = leitor.nextDouble();
        int notas = (int) dinheiroTotal;
        int moedas = (int) ((dinheiroTotal - notas) * 100);
        int notas100 = notas / 100;
        notas -= notas100 * 100;
        int notas50 = notas / 50;
        notas -= notas50 * 50;
        int notas20 = notas / 20;
        notas -= notas20 * 20;
        int notas10 = notas / 10;
        notas -= notas10 * 10;
        int notas5 = notas / 5;
        notas -= notas5 * 5;
        int notas2 = notas / 2;
        notas -= notas2 * 2;
        int moedas1 = notas;
        notas -= moedas1 * 1;
        int moedas50 = moedas / 50;
        moedas -= moedas50 * 50;
        int moedas25 = moedas / 25;
        moedas -= moedas25 * 25;
        int moedas10 = moedas / 10;
        moedas -= moedas10 * 10;
        int moedas05 = moedas / 5;
        moedas -= moedas05 * 5;
        int moedas01 = moedas;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

//        Scanner scan = new Scanner(System.in);
//        double input = scan.nextDouble();
//        double oneHundred = input/100;
//        double fifty = (input%100)/50;
//        double twenty = ((input%100)%50)/20;
//        double ten = (((input%100)%50)%20)/10;
//        double five = ((((input%100)%50)%20)%10)/5;
//        double two = (((((input%100)%50)%20)%10)%5)/2;
//
//        double one = ((((((input%100)%50)%20)%10)%5)%2)/1;
//        double zpfz = (((((((input%100)%50)%20)%10)%5)%2)%1)/0.50;
//        double zptf = ((((((((input%100)%50)%20)%10)%5)%2)%1)%0.50)/0.25;
//        double zpoz = (((((((((input%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10;
//        double zpzf = ((((((((((input%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)/0.05;
//        double zpzo = zpzf;
//
//        int intOneHundred = (int) oneHundred;
//        int intFifty = (int) fifty;
//        int intTwenty = (int) twenty;
//        int intTen = (int) ten;
//        int intFive = (int) five;
//        int intTwo = (int) two;
//        int intone = (int) one;
//        int intZpfz = (int) zpfz;
//        int intZptf = (int) zptf;
//        int intZpoz = (int) zpoz;
//        int intZpzf = (int) zpzf;
//        int intZpzo = (int) zpzo;
//
//
//        System.out.println("NOTAS:");
//        System.out.println(intOneHundred + " nota(s) de R$ 100.00");
//        System.out.println(intFifty + " nota(s) de R$ 50.00");
//        System.out.println(intTwenty + " nota(s) de R$ 20.00");
//        System.out.println(intTen + " nota(s) de R$ 10.00");
//        System.out.println(intFive + " nota(s) de R$ 5.00");
//        System.out.println(intTwo + " nota(s) de R$ 2.00");
//        System.out.println("MOEDAS:");
//        System.out.println(intone + " moeda(s) de R$ 1.00");
//        System.out.println(intZpfz + " moeda(s) de R$ 0.50");
//        System.out.println(intZptf + " moeda(s) de R$ 0.25");
//        System.out.println(intZpoz + " moeda(s) de R$ 0.10");
//        System.out.println(intZpzf + " moeda(s) de R$ 0.05");
//        System.out.println(intZpzo + " moeda(s) de R$ 0.01");
    }
}
