package week1;

import java.util.Scanner;

public class TriangleTypes_1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if (A>=(B+C)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (A*A == B*B + C*C)
            System.out.println("TRIANGULO RETANGULO");
        else if (A*A > B*B + C*C)
            System.out.println("TRIANGULO OBTUSANGULO");
        else
            System.out.println("TRIANGULO ACUTANGULO");
        if (A == B && B == C && A == C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
