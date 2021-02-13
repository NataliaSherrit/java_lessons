package task.natal.task9;
import java.util.Scanner;

public class Main {
    static double sum = 0;
    static double b;

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner t = new Scanner(System.in);
        int num1 = t.nextInt();
        double[] a = new double[num1];
        if (num1 == 0) {
            System.out.println("Массив пустой");
        } else {
            System.out.println("Введите элементы массива");
            for (int i = 0; i < num1; i++) {
                a[i] = t.nextDouble();// Заполняем массив элементами
            }
        for (double x : a) {
            sum += x;
        }
        b = sum/a.length; // Ищем среднее арифметическое элементов массива
        for (double n : a) {
            System.out.print(n * b + " ");
        }

        }
    }
}