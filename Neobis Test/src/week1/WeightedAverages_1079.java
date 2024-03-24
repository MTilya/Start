package week1;

import java.util.*;

public class WeightedAverages_1079 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double result = 0;
        for (int i = 0; i < N; i++) {
            double a1 = scan.nextDouble();
            double a2 = scan.nextDouble();
            double a3 = scan.nextDouble();
            result = (a1 * 2 + a2 * 3 + a3 * 5) / 10;
            System.out.printf("%.1f\n", result);
        }
    }
}
