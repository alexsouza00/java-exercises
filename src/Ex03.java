import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.
public class Ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        int a = in.nextInt();

        System.out.println("Digite outro número:");
        int b = in.nextInt();

        int c;

        if(a == b){
            c = a + b;
        }else{
            c = a * b;
        }

        System.out.println(c);

        in.close();

    }
}
