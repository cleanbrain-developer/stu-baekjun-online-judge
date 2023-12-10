import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

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
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(scanner.next());
        }
        String regex = "[A-Z]{1,1000}";
        Pattern pattern = Pattern.compile(regex);
        strings.forEach(s -> {
            if (pattern.matcher(s).matches()) {
                if (s.length() == 1) {
                    System.out.printf("%s%s%n", s, s);
                } else {
                    char[] charArray = s.toCharArray();
                    System.out.printf("%s%s%n", charArray[0], charArray[s.length() - 1]);
                }
            }
        });
    }
}
