import java.util.HashMap;
import java.util.Map;
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
		String s = scanner.next();
		Map<String, String> map = new HashMap<>();
		map.put("A+", "4.3");
		map.put("A0", "4.0");
		map.put("A-", "3.7");
		map.put("B+", "3.3");
		map.put("B0", "3.0");
		map.put("B-", "2.7");
		map.put("C+", "2.3");
		map.put("C0", "2.0");
		map.put("C-", "1.7");
		map.put("D+", "1.3");
		map.put("D0", "1.0");
		map.put("D-", "0.7");
		map.put("F", "0.0");
		System.out.println(map.get(s));
	}
}
