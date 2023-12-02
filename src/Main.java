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
		char[] charArray = s.toCharArray();
		char[] resAry = new char[s.length()];
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (Character.isLowerCase(c)) {
				resAry[i] = Character.toUpperCase(c);
			} else if(Character.isUpperCase(c)) {
				resAry[i] = Character.toLowerCase(c);
			}
		}
		System.out.println(resAry);
	}
}
