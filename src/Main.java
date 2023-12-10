import java.util.ArrayList;
import java.util.List;
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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i + 1);
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            list.remove((Object) num);
        }
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
