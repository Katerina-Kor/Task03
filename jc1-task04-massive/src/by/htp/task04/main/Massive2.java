// Дана матрица. Вывести k-ю строку и p-столбец матрицы.

package by.htp.task04.main;

public class Massive2 {

	public static void main(String[] args) {
		int[][] A = { { 0, 2, 3, 4, 5, 8, 9, 2 }, { 1, 5, 3, 4, 5, 5, 6 }, { 1, 55, 3, 4, 5, 4, 8 },
				{ 1, 2, 3, 4, 5, 5 }, { 1, 2, 3, 4, 10, 11, 5, 99 } };
		int k = 3;
		int p = 2;

		System.out.println(A[k - 1][p - 1]);

	}

}
