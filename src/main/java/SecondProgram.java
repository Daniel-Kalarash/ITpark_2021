public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        long summa = calculate(4,12);
        System.out.println(summa);
        }

    public static long calculate(int arg1, int arg2) {
        return (long) arg1*arg2+arg2/arg1;
    }
}

