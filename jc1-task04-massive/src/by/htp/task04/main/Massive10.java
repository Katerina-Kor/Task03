//Найти положительные элементы главной диагонали квадратной матрицы.

package by.htp.task04.main;

public class Massive10 {

	public static void main(String[] args) {
		int[][] A = { 
				{ 1, 2, 3, 4, 5 }, 
				{ -1, -2, -3, -4, -5 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ -1, -2, -3, -4, -5 },
				{ 1, 2, 3, 4, 5 } 
				};

		for (int i = 0; i < A.length; i++) {
			if (A[i][i] > 0) {
				System.out.print(A[i][i] + " ");
			}
		}

	}

}
