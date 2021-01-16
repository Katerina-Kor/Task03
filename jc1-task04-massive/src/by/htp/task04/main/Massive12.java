// Сформировать случайную матрицу MxN, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбцу.

package by.htp.task04.main;

public class Massive12 {

	public static void main(String[] args) {
		int m = 5;
		int n = 5;

		int[][] Mas = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i)
					Mas[i][j] = 1;
				else
					Mas[i][j] = 0;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
