package Main;

import java.util.Scanner;

public class Triangulo {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Insira o comprimento do lado a:");
            double a = scan.nextDouble();
            while (a <= 0) {
                System.out.println("Digite um valor positivo");
                a = scan.nextDouble();
            }
            System.out.print("Insira o comprimento do lado b:");
            double b = scan.nextDouble();
            while (b <= 0) {
                System.out.println("Digite um valor positivo");
                b = scan.nextDouble();
            }
            System.out.print("Insira o comprimento do lado c:");
            double c = scan.nextDouble();
            while (c <= 0) {
                System.out.println("Digite um valor positivo");
                c = scan.nextDouble();
            }

            if (a + b <= c || a + c <= b || c + b <= a) {
                System.out.print("Triângulo inválido!");
            } else {

                System.out.print("Insira o ângulo contrário ao lado a:");
                double anguloA = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
                double anguloB = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
                double anguloC = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b)));

                System.out.println("Medida do ângulo contrário ao lado a: " + Math.round(anguloA));
                System.out.println("Medida do ângulo contrário ao lado b: " + Math.round(anguloB));
                System.out.println("Medida do ângulo contrário ao lado c: " + Math.round(anguloC));

                if (a == b && a == c) {
                    System.out.println("O triângulo é equilátero");
                } else if (a == b || a == c || b == c) {
                    System.out.println("O triângulo é isóceles");
                } else {
                    System.out.println("O triângulo é escaleno");
                }
            }
        }
    }