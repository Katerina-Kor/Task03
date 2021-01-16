// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 

package by.htp.task04.main;

public class Massive1 {

	public static void main(String[] args) {
		int[][] A = { { 0, 2, 3, 4, 5 }, { 1, 5, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 10 } };
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i][i] + " ");
		}

	}

}
