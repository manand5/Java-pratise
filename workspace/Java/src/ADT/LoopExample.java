package ADT;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {

				if (i > j)
					System.out.print(" 1 ");
				if (i < j)
					System.out.print(" 0 ");
				if (i == j)
					System.out.print("  ");

			}
			System.out.println();

		}

	}

}
