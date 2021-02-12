package task.natal.task7_v2;

import java.util.Scanner;
public class Main {
    static final int x = 5;
    static final int y = 9;
    static final int z = 32;

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner t = new Scanner(System.in);
        int num1 = t.nextInt();
        int[] a = new int[num1];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < num1; i++) {
            a[i] = t.nextInt();// Заполняем массив элементами
        }
        for ( int b : a ) {
            if (b == x || b == y || b == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }

        }}}
