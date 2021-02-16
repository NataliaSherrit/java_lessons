package task.natal.task10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество строк матрицы");
        Scanner t = new Scanner(System.in);
        int num1 = t.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        Scanner f = new Scanner(System.in);
        int num2 = f.nextInt();
        double[][] a = new double[num1][num2];
        if (num1 == 0 || num2 == 0) {
            System.out.println("Массив пустой");
        } else {
            System.out.println("Введите элементы массива построчно");
            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num2; j++) {
                    a[i][j] = t.nextDouble();// Заполняем массив элементами
                }
                }
            }
        for (int i = 0; i < 1;i++){  // идём по строкам
            for (int j = 0; j < num2;  j++){  // идём по столбцам
                System.out.print(" " + a[ i][j] * 3 + " ");  // вывод элемента
            }

    }
}}
