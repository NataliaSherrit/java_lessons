package task.natal.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите произвольную строку из слов разделенных пробелами");
        Scanner t = new Scanner(System.in);
        String l = t.nextLine();
        String[] result;
        result = l.split(" "); // делаю из строки массив слов
        int count = 0;
        for (int i = 0; i < result.length; i++ ) {
            if (result[i].matches("^[a-zA-Z]+$")) {
                System.out.println(result[i]); // проверяю массив на наличие только латинских букв
                count++;// учитываю количество строк, попавших под условие

        }

}
        System.out.println(count);
    }}

