package task.natal.final_task1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара(в рублях)");
        Scanner t = new Scanner(System.in);
        double rate = t.nextDouble();
        System.out.println("Введите количество рублей для покупки долларов");
        Scanner f = new Scanner(System.in);
        double rub = f.nextDouble();
        if (rate == 0) {
            System.out.println("Курс не может быть равен 0");
        } else {
            double usd = rub/rate;
            DecimalFormat a = new DecimalFormat("##.00");
            System.out.println("количество купленных долларов: " + a.format(usd));
        }
    }
}
