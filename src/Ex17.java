import java.util.Scanner;

// Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scan.nextInt();

        double celsius = (fahrenheit - 32)  * 5/9;

        System.out.printf("O valor em celsius é %.2f", celsius);

        scan.close();
    }
}
