//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("digite um valor booleano: ");
        boolean bool = in.nextBoolean();

        System.out.println("digite outro valor booleano: ");
        boolean bool2 = in.nextBoolean();

        if (bool && bool2){
            System.out.println("ambos são verdadeiros");
        }
        else if(!bool && !bool2){
            System.out.println("ambos são falsos");
        }
        else {
            System.out.println("ambos são diferentes");
        }

        in.close();

    }
}
