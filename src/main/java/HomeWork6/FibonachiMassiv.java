package HomeWork6;

import java.util.Scanner;

public class FibonachiMassiv {

    public static void main(String[] args) {
        // поиск n-го числа Фибоначчи через массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемое количество чисел Фибоначчи");
        int n = scanner.nextInt();
        System.out.println("Введите порядковый номер числа Фибоначчи, который хотите увидеть");
        int index = scanner.nextInt();

        int[] fib = new int[0];
        if (n >= index) {
            fib = new int[n];
        }
        else {
            fib = new int[index];
        }

        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
        System.out.println("Искомый порядковый номер числа Фибоначчи = " + fib[index-1]);

    }
}
