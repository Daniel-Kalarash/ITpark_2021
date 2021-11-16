import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
    // поиск целочисленного корня из натуральных чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число для извлечения корня");
        long n = scanner.nextInt();

        int result = 1;
           for (int key = 1; result < n; key++) {
               result = key * key;
               if (result == (int) n) {
                   System.out.println("Корень числа  " + n + " = " + key);

               } else { if (result > (int) n) {
                   System.out.println("Целочисленного корня числа " + n + "  не найдено");
               }
               }
           }

    }
}
