//Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();

        System.out.println("o numero antecesor de " + num + " é " + (num - 1) + " e seu sucessor " + (num + 1));

        in.close();
    }
}
