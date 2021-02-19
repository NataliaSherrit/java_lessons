package task.natal.task14;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сгененирован массив из 15 элементов с рандомными значениями в диапазоне от -20 до 20");
        int[] array = new int[15];
        int max;
        int min;
        min = max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
        }}
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Наибольшее по модулю число " + Math.abs(max));
        } else {
            System.out.println("Наибольшее по модулю число " + Math.abs(min));
        }

    }
}
