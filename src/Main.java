import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-12-02
 * Comments: 
 * </pre>
 */
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		BigInteger money = scanner.nextBigInteger();
		BigInteger count = scanner.nextBigInteger();
		BigInteger a = money.divide(count);
		BigInteger b = money.mod(count);
		System.out.println(a);
		System.out.println(b);
	}
}
