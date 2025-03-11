import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int b = sc.nextInt();

        System.out.printf("O valor do quociente é = %d e do resto da divisão %d", a / b, a % b);

        sc.close();
    }
}
