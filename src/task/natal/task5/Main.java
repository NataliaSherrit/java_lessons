package task.natal.task5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число х");
        Scanner x = new Scanner(System.in);
        double num1 = x.nextDouble();
        System.out.println("Введите число у");
        Scanner y = new Scanner(System.in);
        double num2 = y.nextDouble();
        System.out.println("Введите один символ действия '+', '-', '/', '*'");
        Scanner z = new Scanner(System.in);
        String num3 = z.nextLine();
            switch (num3) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("На ноль делить нельзя");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
            }
        }}