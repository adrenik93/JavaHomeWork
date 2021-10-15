import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите operand1 :");
                     int operand1 = scanner.nextInt();

                            System.out.println("Введите operand2 :");
                                    int operand2 = scanner.nextInt();

                                            System.out.println(" Внесите знак (+, -, *, /):");
                                                    String sign = scanner.next();

        switch (sign.charAt(0)) {
            case '+':
                System.out.println("Результат: " + (operand1 + operand2));
                break;
                        case '-':
                             System.out.println("Результат: " + (operand1 - operand2));
                                 break;
                                        case '*':
                                            System.out.println("Результат: " + (operand1 * operand2));
                                                 break;
                                            case '/':
                                        if (operand2 == 0) {
                                 System.out.println(" Ошибка!: Не делите на ноль");
                             } else {
                     if (operand1 % operand2 > 0) {
                        System.out.println("Резуультат: " + ((double) operand1 / operand2));
                    } else {
                        System.out.println("Результат: " + (operand1 / operand2));
                    }
                }
                             break;
                                    default:
                                            System.out.println("Ошибка: Некоректный знак");
                                                                                            }
                                                                                                 }

                                                                                                    }