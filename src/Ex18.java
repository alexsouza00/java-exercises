//Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
public class Ex18 {
    public static void main(String[] args) {

        double franciscoHeight = 1.50;
        double saraHeight = 1.10;
        int years = 0;

        do {

            saraHeight +=0.03;
            franciscoHeight += 0.02;
            years++;

        } while (saraHeight < franciscoHeight);

        System.out.printf("Ira demorar %d anos", years);
    }
}
