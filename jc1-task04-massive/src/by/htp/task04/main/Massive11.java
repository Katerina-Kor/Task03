/* Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

package by.htp.task04.main;

public class Massive11 {

	public static void main(String[] args) {
		
		int[][] D = new int [10][20];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				D[i][j] = (int) (Math.random()*16);
			}
		}
		
		int[] A = new int [10];
		int x = 0;
		
		for (int i = 0; i < D.length; i++) {
			int five = 0;
			for (int j = 0; j < D[i].length; j++) {
				System.out.print(D[i][j] + " ");
				if (D[i][j] == 5) {
					five++;
				}
			
			}
			System.out.println();
			if (five >= 3) {
				A[x] = i + 1;
				x++;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				System.out.print(A[i] + " ");
			}
		}

	}
	

}
