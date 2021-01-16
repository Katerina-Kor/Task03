// Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)

package by.htp.task04.main;

public class Massive6 {

	public static void main(String[] args) {
		int n;
		n = 8;

		int one = 1;

		int[][] Mas = new int[n][n];

		for (int i = 0; i < Mas.length; i++) {
			for (int j = 0; j < Mas[i].length; j++) {
				if (i == 0 || i == Mas.length - 1) {
					Mas[i][j] = one;
				} else if (j == 0 || j == Mas[i].length - 1) {
					Mas[i][j] = one;
				}

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
