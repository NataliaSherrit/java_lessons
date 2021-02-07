import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число х");
        Scanner x = new Scanner(System.in);
        double num1 = x.nextDouble();
        System.out.println("Введите число у");
        Scanner y = new Scanner(System.in);
        double num2 = y.nextDouble();
        System.out.println("Введите число z");
        Scanner z = new Scanner(System.in);
        double num3 = z.nextDouble();
        double a = (num1+num2+num3)/3;
        System.out.println("среднее арифметическое равно " + a);
        int b = (int) (a/3);
        if (b>3){
            System.out.println("Программа выполнена корректно");
        }


    }
}
