//  Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();
        int percentage = (num * 5) / 100;

        System.out.println("O valor com reajuste é: " + (num + percentage));

        in.close();

    }
}
