package task.natal.task6;
import java.util.Scanner;

public class Main {
    static double gr;
    static double kg;
    static double lb;
    static double oz;
    static Scanner y = new Scanner(System.in);
    static Scanner z = new Scanner(System.in);
    static byte num2;
    static double num3;
    public static void main(String[] args) {
        System.out.println("Введите 1 - масса или 2 - расстояние");
        Scanner x = new Scanner(System.in);
        byte num1 = x.nextByte();
        if (num1 == 1) {
            System.out.println("Введите единицы измерения: 1 - грамм, 2 - килограмм, 3 - фунт, 4 - унция");
            num2 = y.nextByte();
            switch (num2) {
                case 1:
                    System.out.println("Введите количество грамм");
                    num3 = z.nextDouble();
                    gr = num3;
                    kg = num3 / 1000;
                    lb = num3/453.59;
                    oz = num3/28.35;
                    System.out.println("Граммы: " + gr);
                    System.out.println("Килораммы: " + kg);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + oz);
                    break;
                case 2:
                    System.out.println("Введите количество килограмм");
                    num3 = z.nextDouble();
                    gr = num3 * 1000;
                    kg = num3;
                    lb = num3 * 1000/453.59;
                    oz = num3 * 1000/28.35;
                    System.out.println("Граммы: " + gr);
                    System.out.println("Килораммы: " + kg);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + oz);
                    break;
                case 3:
                    System.out.println("Введите количество фунтов");
                    num3 = z.nextDouble();
                    gr = num3 * 453.59;
                    kg = num3 * 453.59 / 1000;
                    lb = num3;
                    oz = num3 * 453.59/28.35;
                    System.out.println("Граммы: " + gr);
                    System.out.println("Килораммы: " + kg);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + oz);
                    break;
                case 4:
                    System.out.println("Введите количество унций");
                    num3 = z.nextDouble();
                    gr = num3 * 453.59;
                    kg = num3 * 453.59 / 1000;
                    lb = num3/16;
                    oz = num3;
                    System.out.println("Граммы: " + gr);
                    System.out.println("Килораммы: " + kg);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + oz);
                    break;
                default:
                    System.out.println("Введенное значение некорректно");
                    break;
            }

        }
        else if (num1 == 2) {
            System.out.println("Введите единицы измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            num2 = y.nextByte();
            switch (num2) {
                case 1:
                    System.out.println("Введите количество метров");
                    num3 = z.nextDouble();
                    gr = num3;
                    kg = num3 / 1609.34;
                    lb = num3 / 0.9144;
                    oz = num3 / 0.3048;
                    System.out.println("Метры: " + gr);
                    System.out.println("Мили: " + kg);
                    System.out.println("Ярды: " + lb);
                    System.out.println("Футы: " + oz);
                    break;
                case 2:
                    System.out.println("Введите количество миль");
                    num3 = z.nextDouble();
                    gr = num3 * 1609.34;
                    kg = num3;
                    lb = num3 * 1760;
                    oz = num3 * 5280;
                    System.out.println("Метры: " + gr);
                    System.out.println("Мили: " + kg);
                    System.out.println("Ярды: " + lb);
                    System.out.println("Футы: " + oz);
                    break;
                case 3:
                    System.out.println("Введите количество ярдов");
                    num3 = z.nextDouble();
                    gr = num3 * 1.094;
                    kg = num3 / 1760;
                    lb = num3;
                    oz = num3 * 3;
                    System.out.println("Метры: " + gr);
                    System.out.println("Мили: " + kg);
                    System.out.println("Ярды: " + lb);
                    System.out.println("Футы: " + oz);
                    break;
                case 4:
                    System.out.println("Введите количество футов");
                    num3 = z.nextDouble();
                    gr = num3 * 453.59;
                    kg = num3 * 453.59 / 1000;
                    lb = num3 / 3;
                    oz = num3;
                    System.out.println("Метры: " + gr);
                    System.out.println("Мили: " + kg);
                    System.out.println("Ярды: " + lb);
                    System.out.println("Футы: " + oz);
                    break;
                default:
                    System.out.println("Введенное значение некорректно");
                    break;

            }
        }
        else {
            System.out.println("Введенное значение некорректно");
        }

    }
}