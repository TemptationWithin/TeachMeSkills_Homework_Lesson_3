/**
 *  Создать и заполнить одномерный массив интов. Написать программу для вычисления среднего значения массива
 */

public class HomeWork_Lesson_3_Task_2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int sum = 0;
        for (int i = 0; i < a.length; i++) { // заполнение массива и вычисление суммы элементов
            a[i] = i*10;
            sum = sum + a[i];
        }
        int average = sum/a.length;              // вычисление среднего значения массива
        System.out.println(average);             // вывод результата
    }
}
