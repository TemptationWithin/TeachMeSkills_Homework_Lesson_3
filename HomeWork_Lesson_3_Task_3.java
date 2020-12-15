/**
 *  Написать программу для копирования значений одного массива в другой
 */
public class HomeWork_Lesson_3_Task_3 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) {    // инициализация массива "а"
            a[i] = i*10;
        }
        for (int i = 0; i < b.length; i++) {    // инициализация массива "b" путем копирования элементов из массива "а"
            b[i] = a[i];
        }
    }
}
