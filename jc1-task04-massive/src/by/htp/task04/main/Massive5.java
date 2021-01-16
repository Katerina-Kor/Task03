// Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)

package by.htp.task04.main;

public class Massive5 {

	public static void main(String[] args) {
		int n;
		n = 8;

		int[][] Mas = new int[n][n];

		for (int i = 0; i < Mas.length; i++) {
			for (int j = 0; j < Mas[i].length; j++) {
				Mas[i][Mas[i].length - 1 - i] = i + 1;

			}
		}
		for (int i = 0; i < Mas.length; i++) {
			for (int j = 0; j < Mas[i].length; j++) {
				System.out.print(Mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
