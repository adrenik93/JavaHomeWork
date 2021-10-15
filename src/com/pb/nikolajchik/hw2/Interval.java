
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер:");
        int x = scanner.nextInt();

        if (x >= 0 && x <= 14) {
            System.out.println("Ваш номер в промежутке [0-14]");
        } else if (x >= 15 && x <= 35) {
            System.out.println("Ваш номер в промежутке [15-35]");
        } else if (x >= 36 && x <= 50) {
            System.out.println("Ваш номер в промежутке [36-50]");
        } else if (x >= 51 && x <= 100) {
            System.out.println("Ваш номер в промежутке [51-100]");
        } else {
            System.out.println("Ваш номер не в списке допустимого интервала. Введите номер от 0 до 100");
        }
    }
}