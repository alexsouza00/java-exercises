import java.util.Scanner;
// Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("A media das notas é de: " + (nota + nota2 + nota3 / 3));
    }
}
