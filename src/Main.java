import java.util.Scanner;

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
		int n = scanner.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(String.format("%d * %d = %d", n, i, n * i));
		}
	}
}
