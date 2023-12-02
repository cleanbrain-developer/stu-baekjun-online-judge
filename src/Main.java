import java.math.BigInteger;
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
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		BigInteger c = scanner.nextBigInteger();
		BigInteger d = scanner.nextBigInteger();
		BigInteger e = scanner.nextBigInteger();
		System.out.println((a.pow(2).add(b.pow(2)).add(c.pow(2)).add(d.pow(2)).add(e.pow(2))).mod(new BigInteger("10")));
	}
}
