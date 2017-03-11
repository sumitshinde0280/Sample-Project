package Loop;
 public class Pyramid {
	// void main
	public static void main(String[] args) {
		int depth = 10;
		int s = depth, m;

		for (int i = 1; i <= depth; i++) {
			m = s;
			while (s > 0) {
				System.out.print(" ");
				s--;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+i);
			}
			System.out.print("\n");
			s = m - 1;
		}
	}
}