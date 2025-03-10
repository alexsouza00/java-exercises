import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//(Ex: 5 anos, 2 meses e 15 dias de vida)

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento: ");
        String date = scan.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bornDate = LocalDate.parse(date, fmt);
        LocalDate currentDate = LocalDate.now();

        int yearsLived = currentDate.getYear() - bornDate.getYear();
        int days = yearsLived * 365;

        int monthsLived = (days / 30) % 12; ;
        int daysLived = days % 30 ;

        System.out.printf("%d anos, %d meses e %d dias de vida", yearsLived, monthsLived, daysLived);

        scan.close();
    }
}
