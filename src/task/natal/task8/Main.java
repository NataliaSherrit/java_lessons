package task.natal.task8;
import java.util.Scanner;

public class Main {
    static int total = 0;
    public static void main(String[] args) {
    System.out.println("Введите любое целое положительное число");
    Scanner t = new Scanner(System.in);
    int num1 = t.nextInt();
    if (num1 > 0) {
        for (int i = 1; i <= num1; i+=2) {
            total += i;
        }
        System.out.println ("Сумма нечетных чисел равна: " + total);
    }
    else
        System.out.println("Введенное значение некорректно");
}


}