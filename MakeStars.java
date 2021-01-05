import java.util.Scanner;

public class MakeStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			Scanner ls = new Scanner(s.nextLine());
			while (ls.hasNext()) {
				String word = ls.next();
				for (int i = 0; i < word.length(); i++) {
					System.out.print('*');
				}
				if (ls.hasNext()) {
					System.out.print(" ");
				}
			}
			System.out.println();
			ls.close();
		}
		s.close();

	}
}