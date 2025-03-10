import java.util.Random;

// Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
public class Ex21 {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(100);
        System.out.println(value);
    }
}
