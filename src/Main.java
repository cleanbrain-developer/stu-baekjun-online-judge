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
		final int KING_COUNT = 1; 
		final int QUEEN_COUNT = 1; 
		final int LOOK_COUNT = 2; 
		final int BISHOP_COUNT = 2; 
		final int KNIGHT_COUNT = 2; 
		final int PONE_COUNT = 8; 
		
		Scanner scanner = new Scanner(System.in);
		int king = scanner.nextInt();
		int queen = scanner.nextInt();
		int look = scanner.nextInt();
		int bishop = scanner.nextInt();
		int knight = scanner.nextInt();
		int pone = scanner.nextInt();

		System.out.printf("%d %d %d %d %d %d%n",
			KING_COUNT - king,
			QUEEN_COUNT - queen,
			LOOK_COUNT - look,
			BISHOP_COUNT - bishop,
			KNIGHT_COUNT - knight,
			PONE_COUNT - pone);
	}
}
