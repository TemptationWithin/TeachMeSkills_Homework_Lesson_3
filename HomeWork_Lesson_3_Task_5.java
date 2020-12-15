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
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Введите размерость матрицы B двумя числами:");
        int w = scanner.nextInt();
        int z = scanner.nextInt();
        if (y == w){                                                           // проверка возможности перемножения
            int a[][] = new int[x][y];                                         // создание матриц
            int b[][] = new int[w][z];
            int result[][] = new int[x][z];
            System.out.println("Введите через Enter элементы матрицы А (построчно)");      // заполнение матрицы А
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Введите через Enter элементы матрицы B (построчно)");      // заполнение матрицы В
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < z; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            scanner.close();                                                   // закрыли scanner
            System.out.print("Матрица А:");                                    // вывод матрицы А
            for (int i = 0; i < x; i++) {                                      //Конструкции ("      ") при выводе используются для эстетичного вида матриц)
                System.out.println("  ");
                for (int j = 0; j < y; j++) {
                    System.out.print(a[i][j] + "   ");
                }
            }
            System.out.println(" ");                                            // вывод матрицы В
            System.out.println(" ");
            System.out.print("Матрица B:");
            for (int i = 0; i < w; i++) {
                System.out.println("  ");
                for (int j = 0; j < z; j++) {
                    System.out.print(b[i][j] + "   ");
                }
            }
            for (int i = 0; i < x; i++) {                                       // вычисление перемножения
                for (int j = 0; j < z; j++) {
                    for (int n = 0; n < y; n++) {
                            result[i][j] = result[i][j] + a[i][n] * b[n][j];
                        }
                    }
                }
            System.out.println(" ");                                             // вывод результата
            System.out.println(" ");
            System.out.print("Результат перемножения AB(матрица С):");
            for (int i = 0; i < x; i++) {
                System.out.println("  ");
                for (int j = 0; j < z; j++) {
                    System.out.print(result[i][j] + "   ");
                }
            }
        } else {
            System.out.println("Такие матрицы перемножить нельзя. " +
                               "Число столбцов матрицы А должно быть равно числу строк матрицы В");
        }

    }
}
