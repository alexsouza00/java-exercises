import java.util.Scanner;

// Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Ex08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] nums = new int[3];

        System.out.println("Digite um valor: ");
        nums[0] = in.nextInt();
        System.out.println("Digite outro valor: ");
        nums[1] = in.nextInt();
        System.out.println("Digite outro valor: ");
        nums[2] = in.nextInt();

        int aux = 0;

        for (int i = 0; i < 2; i++){

            if (nums[i] < nums[i + 1]){

                aux = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = aux;

            }

        }

       for (int i = 0; i < nums.length; i++){
           System.out.println(nums[i]);
       }

        in.close();
    }
}
