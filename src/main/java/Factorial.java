import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Расчет факториала. Введите целое число от 1 до 25");
        long n = scanner.nextInt();

        long fact = 1; int i = 1;
        while (i <= n) {
            fact = fact * i; i++;
        }
        System.out.println("Факториал числа  " + n + " = " + fact);
    }
}
