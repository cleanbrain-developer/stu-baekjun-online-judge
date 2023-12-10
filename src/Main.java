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
        Scanner scanner = new Scanner(System.in);
        List<Numbers> numberList = new ArrayList<>();
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            numberList.add(new Numbers(a, b));
        }
        numberList.forEach(numbers -> {
            if (numbers.getA() > numbers.getB()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        });
    }

    static class Numbers {
        private int a;
        private int b;

        public Numbers(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}
