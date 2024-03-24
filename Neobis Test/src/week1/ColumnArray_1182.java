package week1;

import java.util.Scanner;

public class ColumnArray_1182 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int columnNumber = scan.nextInt();
        char operation = scan.next().charAt(0);
        double[][] twoArray = new double[12] [12];

        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12;j++){
                twoArray[i][j] = scan.nextDouble();
            }
        }

        double result = 0;
        for (int i = 0; i < 12; i++) {
            result += twoArray[i][columnNumber];
        }

        if (operation == 'M') {
            result /= 12;
        }
        System.out.printf("%.1f\n", result);

    }

}
