package week1;

import java.util.Scanner;

public class GameTimeWithMinutes_1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaStart = scan.nextInt();
        int minutStart = scan.nextInt();
        int horaFinish = scan.nextInt();
        int minutFinish = scan.nextInt();

        int resultHora = 0;
        int resultMinut = 0;

        if (minutFinish<minutStart){
            minutFinish += 60;
            horaFinish -= 1;
            resultMinut = minutFinish - minutStart;
            resultHora = horaFinish - horaStart;
            if (horaFinish < horaStart){
                horaFinish +=24;
                resultHora = horaFinish - horaStart;
            }
        }else{
            resultMinut = minutFinish - minutStart;
            resultHora = horaFinish - horaStart;
        }

        if (horaFinish == horaStart && minutFinish == minutStart){
            resultHora = 24;
            resultMinut = 0;
        }
        System.out.println("O JOGO DUROU " + resultHora + " HORA(S) E " + resultMinut + " MINUTO(S)");
    }
}
