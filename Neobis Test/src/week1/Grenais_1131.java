package week1;

import java.util.Scanner;

public class Grenais_1131 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grenais = 0;
        int interWins = 0;
        int gremioWins = 0;
        int Empates = 0;
        while (true) {
            int inter = scan.nextInt();
            int gremio = scan.nextInt();
            grenais ++;
            if (inter > gremio) {
                interWins ++;
            } else if (gremio > inter) {
                gremioWins ++;
            } else {
                Empates ++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int novoGrenal = scan.nextInt();
            if (novoGrenal == 2) {
                break;
            }
        }
        System.out.println(grenais + "grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + Empates);
        if (interWins > gremioWins){
            System.out.println("Inter venceu mais");
        }else if (interWins < gremioWins){
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Draws");
        }


    }
}
