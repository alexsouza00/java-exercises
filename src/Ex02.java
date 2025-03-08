import java.util.Scanner;

// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = in.nextInt();

        if( num %  2 == 0){
            System.out.println("o numero é par");
        }
        else{
            System.out.println("o numero é impar");
        }

        if(num >= 0){
            System.out.println("o numero é positivo");
        }
        else{
            System.out.println("o numero é negativo");
        }

        in.close();
    }
}
