/* Дана матрица размера MxN. Вывести ее элементы в следующем порядке: 
 * первая строка справа налево, вторая строка слева направо, 3я строка справа налево и тд.
 */

package by.htp.task04.main;

public class Massive3 {

	public static void main(String[] args) {
		int[][] A = { { 0, 2, 3, 4, 5, 8, 9, 2 }, { 1, 5, 3, 4, 5, 5, 6 }, { 2, 55, 3, 4, 5, 4, 8 },
				{ 8, 2, 3, 4, 5, 5 }, { 1, 9, 3, 4, 10, 11, 5, 99 }, { 99, 88, 77, 66, 55, 44 } };
		for (int i = 0; i < A.length; i++) {
			if (i == 0 || i % 2 == 0) {
				for (int j = 0; j < A[i].length; j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.print("\n");
			} else {
				for (int j = A[i].length - 1; j >= 0; j--) {
					System.out.print(A[i][j] + " ");
				}
				System.out.print("\n");
			}
		}

	}

}
