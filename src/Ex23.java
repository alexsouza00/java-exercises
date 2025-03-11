import java.util.Scanner;

//Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
// valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final
public class Ex23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor hora da sua aula: ");
        double lessonsPrice = scan.nextDouble();

        System.out.println("Digite o numero de aulas lecionadas no mês: ");
        int lessonsQuantity = scan.nextInt();

        System.out.println("Digite o percentual do INSS: ");
        int percentage = scan.nextInt();

        double salary = (lessonsPrice * lessonsQuantity) - ((lessonsPrice * lessonsQuantity) * percentage) / 100 ;

        System.out.printf("O salario liquido é de R$" + salary);

        scan.close();
    }
}
