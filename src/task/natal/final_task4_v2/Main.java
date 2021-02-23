package task.natal.final_task4_v2;
import java.util.Scanner;

public class Main {
    public static String l1;
    public static boolean fin;

    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner t = new Scanner(System.in);
        fin = false;
        for (int i = 1; i <=3; i++) {
            l1 = t.nextLine();
            switch (l1) {
                case ("Заархивированный вирус"):
                    System.out.println("Правильно");
                    fin = true;
                    break;
                case ("Подсказка"):
                    if  (i == 1) {
                        System.out.println("Что-то вредное в формате типа rar или zip");
                        l1 = t.nextLine();
                        if (l1.equals("Заархивированный вирус")) {
                            System.out.println("Правильно");
                            fin = true;
                            break;
                        }else {
                            System.out.println("Обидно, приходи в другой раз");
                            fin = true;
                            break;
                        }
                    } else {
                        if (i != 3) {
                            System.out.println("Подсказка уже недоступна");
                            l1 = t.nextLine();
                            if(l1.equals("Заархивированный вирус")) {
                                System.out.println("Правильно");
                                fin = true;
                                break;
                            }
                        } else {
                            System.out.println("Подсказка уже недоступна");
                            l1 = t.nextLine();
                            if(l1.equals("Заархивированный вирус")) {
                                System.out.println("Правильно");
                                fin = true;
                                break;
                            } else {
                                System.out.println("Обидно, приходи в другой раз");
                                break;
                            }
                        }
                    }
                default: {
                    if (i != 3) {
                        System.out.println("Подумай еще!");
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                        break;
                    }
                }


            }
            if (fin == true) break;

        }

    }
}