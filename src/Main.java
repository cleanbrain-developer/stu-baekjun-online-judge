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
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
