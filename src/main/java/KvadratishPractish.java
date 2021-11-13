import java.util.Scanner;

public class KvadratishPractish {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 1-й коэффициент а");
            double a = scanner.nextInt();
            System.out.println("Введите 2-й коэффициент b");
            double b = scanner.nextInt();
            System.out.println("Введите 3-й коэффициент c");
            double c = scanner.nextInt();

            double discrim = Math.pow(b, 2) - 4 * a * c;

            if (a == 0) {
                System.out.println("Первый коэффициент не может быть 0");
            } else {
                if (discrim < 0) {
                    System.out.println("Нет действительных решений уравнения");
                } else {
                    if (discrim == 0) {
                        double x = -b / (2 * a);
                        System.out.println("X=" + x);
                    } else {
                        double x1 = (-b + Math.sqrt(discrim)) / (2 * a);
                        double x2 = (-b - Math.sqrt(discrim)) / (2 * a);
                        System.out.println("X1=" + x1 + ", X2=" + x2);
                    }

                }
            }
        }
    }

