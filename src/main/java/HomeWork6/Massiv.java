package HomeWork6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Massiv {

    public static void main(String[] args) {
        // заполнение массива произвольными числами
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемое количество чисел в массиве");
        int n = scanner.nextInt();

        double [] newMassiv  = new double[n];
        for(int i=0; i<n; i++) {
            newMassiv [i] = Math.random();
            System.out.println(newMassiv[i]);
        }
        // сортировка массива
        Arrays.sort(newMassiv);
        System.out.println("Минимальное из чисел в массиве " + newMassiv [0]);
        System.out.println("Максимальное из чисел в массиве " + newMassiv [n-1]);

        // среднее значение
        double mediane = 0; double summa = 0;
        for(int i=0; i<n; i++) {
            summa += newMassiv [i];
            }
        mediane = summa / n;
        System.out.println("Среднее арифметическое массива = " + mediane);
    }
}
