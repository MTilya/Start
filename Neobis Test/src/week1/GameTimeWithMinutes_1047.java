package week1;

import java.util.Scanner;

public class GameTimeWithMinutes_1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int runHour = scan.nextInt();
        int endHour = scan.nextInt();
        int runMin = scan.nextInt();
        int endMin = scan.nextInt();
        int resHour = endHour - runHour;
        int resMin = endMin - runMin;
        if (resHour < 0) {
            resHour = 24 + (endHour - resHour);
        }
        if (resMin < 0) {
            resMin = 60 + (endMin - resMin);
            resHour--;
        }
        if (runHour == runMin && endHour == endMin) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else System.out.println("O JOGO DUROU " + resHour + " HORA(S) E " + resMin + " MINUTO(S)");
    }
}
