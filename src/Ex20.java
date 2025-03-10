//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scan.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n + " . " + i + " = " + (n * i));
        }

        scan.close();
    }
}
