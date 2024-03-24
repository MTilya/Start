package week1;

import java.util.*;

public class TriangleTypes_1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] points = new double[3];
        points[0] = scan.nextDouble();
        points[1] = scan.nextDouble();
        points[2] = scan.nextDouble();

        Arrays.sort(points);
        double pointA = points[2];
        double pointB = points[1];
        double pointC = points[0];
        if (pointA >= pointB + pointC) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (pointA * pointA == pointB * pointB + pointC * pointC) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (pointA * pointA > pointB * pointB + pointC * pointC) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (pointA * pointA < pointB * pointB + pointC * pointC) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (pointA == pointB && pointB == pointC) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((pointB == pointC && pointB != pointA) || (pointA == pointC && pointA != pointB) || (pointA == pointB && pointA != pointC)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}