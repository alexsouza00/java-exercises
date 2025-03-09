/* Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma
de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de
condições de pagamento para efetuar o cálculo adequado.

Tabela de Código de Condições de Pagamento

1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

2 - À Vista no cartão de crédito, recebe 10% de desconto

3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double productValue = sc.nextDouble();

        System.out.println("Escolha a forma de pagamento: ");

        System.out.println("1 - À Vista em Dinheiro ou Pix");
        System.out.println("2 - À Vista no cartão de crédito");
        System.out.println("3 - Parcelado no cartão em duas vezes");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais");

        int option = sc.nextInt();
        Double finalValue = 0.0;

        switch (option) {
            case 1:
                finalValue = productValue - ((productValue * 15) / 100);
                System.out.println("O valor final do produto é de $" + finalValue);
                break;
            case 2:
                finalValue = productValue - ((productValue * 10) / 100);
                System.out.println("O valor final do produto é de $" + finalValue);
                break;
            case 3:
                finalValue = productValue;
                System.out.println("O valor final do produto é de $" + finalValue);
                break;
            case 4:
                finalValue = productValue + ((productValue * 10) / 100);
                System.out.println("O valor final do produto é de $" + finalValue);
                break;
            default:
                System.out.println("Valor invalido!");
        }


        sc.close();
    }
}
