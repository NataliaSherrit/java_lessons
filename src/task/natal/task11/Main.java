package task.natal.task11;

import java.util.Scanner;

public class Main {
    static String f;
    static Integer e;

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner t = new Scanner(System.in);
        Float num1 = t.nextFloat();
        f = Float.toString(num1);
        System.out.println("Введите второе число");
        Scanner l = new Scanner(System.in);
        Float num2 = l.nextFloat();
        e = num2.intValue();
        System.out.println("Большее число равно " + Math.max(num1, num2));
        Double n = Double.valueOf(Math.min(num1, num2));
        System.out.println("Меньшее число равно " + n);

    }

}
