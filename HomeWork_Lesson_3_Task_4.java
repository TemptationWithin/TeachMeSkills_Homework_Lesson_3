/**
 *   Написать программу для перестановки элементов массива в обратном порядке
 */
public class HomeWork_Lesson_3_Task_4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) { // инициализация массива "а" и копирование его элементов в массив "b"
            a[i] = i*10;
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) { // копирование элементов из массива "b" в массив "а" в обратном порядке
            a[a.length -1 - i] = b[i];;
        }
    }
}
