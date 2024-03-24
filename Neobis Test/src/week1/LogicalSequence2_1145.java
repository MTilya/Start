package week1;

import java.util.Scanner;

public class LogicalSequence2_1145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int space = 0;
        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            space++;
            if (space < x) {
                System.out.print(" ");
            } else {
                System.out.println();
                space = 0;
            }
        }
    }
}

