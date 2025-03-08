import java.util.Scanner;
//Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String name = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double avg = (nota + nota2 + nota3 + nota4) / 4;

        if (avg >= 7) {
            System.out.println("A media das notas é de: " + avg + " e o " + name + " foi aprovado:>" );
        }
        else              System.out.println("A media das notas é de: " + avg + " e " + name + " foi reprovado :(" );

        sc.close();
    }
}
