//  Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20)

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salary = in.nextDouble();

        System.out.println("Digite o valor do seu salário: ");
        double userSalary = in.nextDouble();

        System.out.println("O usuario ganha " + String.format("%.0f", (userSalary / salary)) + " salário");

        in.close();
    }
}
