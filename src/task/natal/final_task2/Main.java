package task.natal.final_task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите уравнение вида х+-n=a, где x - неизвестное, n и a - цифры от 0 до 9");
        Scanner t = new Scanner(System.in);
        String l = t.nextLine();
        char one = l.charAt(0);
        char two = l.charAt(1);
        char three = l.charAt(2);
        char four = l.charAt(3);
        char five = l.charAt(4);
        if (l.length() > 5) {
            System.out.println("Введено неверное значение, ожидается строка длиной 5 символов");
        } else {
            if (two != '-' && two != '+' || four != '=') {
                System.out.println("Уравнение неверно");
            } else {
                if (one == 'x' || one == 'х') {
                    int a = Character.getNumericValue(three);
                    int b = Character.getNumericValue(five);
                    int res;
                    if (two == '+') {
                        res = b - a;
                    } else {
                        res = a + b;
                    }
                    System.out.println("x=" + res);
                } else {
                    if (three == 'x' || three == 'х') {
                        int a = Character.getNumericValue(one);
                        int b = Character.getNumericValue(five);
                        int res;
                        if (two == '+') {
                            res = b - a;
                        } else {
                            res = a - b;
                        }
                        System.out.println("x=" + res);
                    } else {
                        if (five == 'x' || five == 'х') {
                            int a = Character.getNumericValue(one);
                            int b = Character.getNumericValue(three);
                            int res;
                            if (two == '+')
                                res = a + b;
                            else
                                res = a - b;
                            System.out.println("x=" + res);
                        } else {
                            System.out.println("Введенное значение не соответствует условию");
                        }
                    }
                }
            }
        }
    }}