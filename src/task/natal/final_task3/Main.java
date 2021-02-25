package task.natal.final_task3;
import java.util.Scanner;

public class Main {
    public static int count;
    public static int max;
    public static String l;
    public static String maxL;

    public static void main(String[] args) {
        System.out.println("Введите количество строк");
        Scanner f = new Scanner(System.in);
        int num = f.nextInt(); // вводим количество строк
        for (int i = 1; i <= num; i++) {
            System.out.println("Введите " + i + " строку");
            Scanner t = new Scanner(System.in);
            l = t.nextLine(); //вводим строку
            char[] arr = l.toCharArray();//делаем из строки массив символов
            for (int n = 0; n < arr.length; ++n) { // перебираем массив на предмет одинаковых символов
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        char tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                    count = 1;
                    for (int e = 0; e < arr.length - 1; e++) {
                        if (arr[e] != arr[e + 1])
                            count++; //считаем количество разных символов
                    }
                }
            }
            if (max < count) {
                max = count;
                maxL = l; //находим самую длинную строку
            }
        }
        System.out.println ("Самая длинная строка " + maxL);
    }
}
