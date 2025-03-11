import java.util.Scanner;

//Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
// sabendo que o carro faz 12km com um litro.
// Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
// distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//
//Fórmula: distância = tempo x velocidade.
//
//            litros usados = distância / 12.
public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a velocidade média: ");
        int velocityAvg = scan.nextInt();

        System.out.println("Digite o tempo de viagem em horas: ");
        int travelHours = scan.nextInt();

        int distance = travelHours * velocityAvg;
        int usedLiters = distance / 12;

        System.out.printf("O tempo de viagem sera de %d horas, a distancia a percorrer é de %d km, a quantidade de litros para fazer a viagem é de %dl", travelHours, distance, usedLiters);

        scan.close();
    }
}
