import java.util.Scanner;

public class FibonachiNumber {

    public static void main(String[] args) {
        // поиск n-го числа Фибоначчи
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый номер числа Фибоначчи");
        int n = scanner.nextInt();

        int a = 0; int b = 1;
        for (int i = 2; i < n; ++i) {
            int c = a + b;
            a = b;
            b = c;
        }
         System.out.println( n + "-е число Фибоначчи = " + b);
    }
}
