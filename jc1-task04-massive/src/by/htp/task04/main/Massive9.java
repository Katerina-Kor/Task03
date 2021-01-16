/*Дан линейный массив X1 X2...Xn. 
 * Получить действительную квадратную матрицу порядка n
 */

package by.htp.task04.main;

public class Massive9 {

	public static void main(String[] args) {
		int[] Line = { 5, 9, 2, 1, 3, 4, 8, 2 };
		long[][] Mas = new long[Line.length][Line.length];

		for (int i = 0; i < Mas.length; i++) {
			for (int j = 0; j < Mas[i].length; j++) {
				Mas[i][j] = (long) Math.pow(Line[j], i + 1);
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
