import java.util.Scanner;
import java.util.stream.Collectors;

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
        String jaehwan = scanner.next();
        String doctor = scanner.next();
        long jaehwanCount = jaehwan.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList())
                .stream()
                .filter(character -> character == 'a')
                .count();
        long doctorCount = doctor.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList())
                .stream()
                .filter(character -> character == 'a')
                .count();
        if (jaehwanCount >= doctorCount) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
