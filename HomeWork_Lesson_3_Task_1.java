/**
 * Создать и заполнить одномерный массив интов. Написать программу для поиска максимального значения в массиве
 */

public class HomeWork_Lesson_3_Task_1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {            //заполнение массива
            a[i] = i*5;
        }
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {        // поиск максимума
           if (max < a[i+1]){
               max = a[i+1];
           }
        }
        System.out.println(max);                        //вывод максимального значения
    }
}
