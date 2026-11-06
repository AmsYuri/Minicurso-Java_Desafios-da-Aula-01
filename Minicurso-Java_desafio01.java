package Main;

import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("O que você deseja calcular?");
        System.out.println("1. Hipotenusa");
        System.out.println("2. Cateto");
        int escolha = scan.nextInt();
        while (escolha != 1 && escolha != 2){
            System.out.println("Digite 1 ou 2");
            escolha = scan.nextInt();
        }

        if (escolha == 1){
            System.out.println("Digite o valor dos catetos");
            System.out.println("Cateto 1");
            int c1 = scan.nextInt();
            System.out.println("Cateto 2");
            int c2 = scan.nextInt();

            double h = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
            System.out.println("Hipotenusa: " + h);
        } else {
            System.out.println("Digite o valor do primeiro cateto");
            int c1 = scan.nextInt();
            System.out.println("Digite o valor da hipotenusa");
            int h = scan.nextInt();

            double c2 = Math.sqrt(Math.pow(h,2) - Math.pow(c1,2));
            System.out.println("Segundo cateto: " + c2);
        }
    }
}
