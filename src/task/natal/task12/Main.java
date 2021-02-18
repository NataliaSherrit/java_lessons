package task.natal.task12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку 'I like Java!!!'");
        Scanner t = new Scanner(System.in);
        String l = t.nextLine();
        boolean f = l.contains("Java"); // проверка наличия подстроки Java
        boolean res1 = l.startsWith("I like"); // проверка начала строки
        boolean res2 = l.endsWith("!!!"); // проверка конца строки
        if (f == true && res1 == true && res2 == true){
            String result = l.toUpperCase();
            System.out.println(result);// вывод строки в верхнем регистре
            String res3 = l.replace("a", "o"); // замена символов
            String res4 = res3.substring(7, 11);
            System.out.println(res4); // вывод подстроки
        } else {
            System.out.println("Введенное значение неверно");
        }
}}
