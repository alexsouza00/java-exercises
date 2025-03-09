// Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scan.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("A = " + a + " B = " + b);
        scan.close();
    }
}
