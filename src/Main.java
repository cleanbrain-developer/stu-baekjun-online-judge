import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-12-02
 * Comments: n개 중에 r개 선택(nCr) // 조합
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<SiteInfo> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long west = scanner.nextLong();
            long east = scanner.nextLong();
            list.add(new SiteInfo(west, east));
        }
        list.forEach(siteInfo -> {
            System.out.println(getCaseCount(siteInfo));
        });
    }

    public static BigInteger getCaseCount(SiteInfo siteInfo) {
        long n = siteInfo.getEastCount();
        long r = siteInfo.getWestCount();
        BigInteger child = factorial(n);
        BigInteger parent = factorial(n - r).multiply(factorial(r));
        return child.divide(parent);
    }

    public static BigInteger factorial(long n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (long i = n; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static class SiteInfo {
        private long westCount;
        private long eastCount;

        public SiteInfo(long westCount, long eastCount) {
            this.westCount = westCount;
            this.eastCount = eastCount;
        }

        public long getWestCount() {
            return westCount;
        }

        public long getEastCount() {
            return eastCount;
        }
    }
}
