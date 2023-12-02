import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-12-02
 * Comments: 
 * </pre>
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[][] a = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		int[][] b = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		int[][] c = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
