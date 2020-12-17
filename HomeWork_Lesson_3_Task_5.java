import java.util.Scanner;

/**
 *  Двумерные массивы. Написать программу для умножения двух матриц
 */
/*
    Каждый элемент = сумме произведений элементов строки на столбец
    Пример:
       А                  B             C
    2  0 -1     и      4  1  0        8  1  0
    0 -2  2            3  2  1       -6 -2 -2
                       0  1  0

    Произведение двух матриц АВ имеет смысл только в том случае,
    когда число столбцов матрицы А совпадает с числом строк матрицы В .

    В произведении матриц АВ число строк равно числу строк матрицы А ,
    а число столбцов равно числу столбцов матрицы В: 2х10 и 10х5 = 2х5
 */
public class HomeWork_Lesson_3_Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерость матрицы А двумя числами:");   // ввод размерностей перемножаемых матриц
        int aRows = scanner.nextInt();
        int aColumns = scanner.nextInt();
        System.out.println("Введите размерость матрицы B двумя числами:");
        int bRows = scanner.nextInt();
        int bColumns = scanner.nextInt();
        if (aColumns == bRows){                                                           // проверка возможности перемножения
            int a[][] = new int[aRows][aColumns];                                         // создание матриц
            int b[][] = new int[bRows][bColumns];
            int result[][] = new int[aRows][bColumns];
            System.out.println("Введите через Enter элементы матрицы А (построчно)");      // заполнение матрицы А
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Введите через Enter элементы матрицы B (построчно)");      // заполнение матрицы В
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            scanner.close();                                                   // закрыли scanner
            System.out.print("Матрица А:");                                    // вывод матрицы А
            for (int i = 0; i < a.length; i++) {                               //Конструкции ("      ") при выводе используются для эстетичного вида матриц)
                System.out.println("  ");
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j] + "   ");
                }
            }
            System.out.println(" ");                                            // вывод матрицы В
            System.out.println(" ");
            System.out.print("Матрица B:");
            for (int i = 0; i < b.length; i++) {
                System.out.println("  ");
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print(b[i][j] + "   ");
                }
            }
            for (int i = 0; i < a.length; i++) {                                // вычисление перемножения
                for (int j = 0; j < b[0].length; j++) {
                    for (int n = 0; n < a[0].length; n++) {
                            result[i][j] = result[i][j] + a[i][n] * b[n][j];
                        }
                    }
                }
            System.out.println(" ");                                             // вывод результата
            System.out.println(" ");
            System.out.print("Результат перемножения AB(матрица С):");
            for (int i = 0; i < a.length; i++) {
                System.out.println("  ");
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print(result[i][j] + "  ");
                }
            }
        } else {
            System.out.println("Такие матрицы перемножить нельзя. " +
                               "Число столбцов матрицы А должно быть равно числу строк матрицы В");
        }

    }
}
