//Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o primeiro valor do triangulo: ");
        int lado1 = scan.nextInt();
        System.out.println("Escreva o primeiro valor do triangulo: ");
        int lado2 = scan.nextInt();
        System.out.println("Escreva o primeiro valor do triangulo: ");
        int lado3 = scan.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triangulo é equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("O triangulo é isoceles");
            } else {
                System.out.println("O triangulo é Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }
        scan.close();
    }
}
