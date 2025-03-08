import java.util.Scanner;

//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int c = sc.nextInt();
        int sum = a + b;

        if(sum > c){
            System.out.println("A soma de A + B é " + sum);
            System.out.println("A soma é maior que C");
        }else {
            System.out.println("A soma de A + B é " + sum);
            System.out.println("A soma é menor que C");
        }

        sc.close();
    }
}
