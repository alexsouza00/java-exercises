import java.util.Scanner;

//Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println(name + " é menor de idade!");
        }

        if (age > 18) {
            System.out.println(name + " é maior de idade!");
        }

        scan.close();
    }
}
