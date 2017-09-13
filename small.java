public class small {

	public static void main(String args[]) {

		int count = 0;

		int c;

		for (int i = 1; i < 5; i++)

			for (int j = 1; j < 5; j++)

				for (int k = 1; k < 5; k++) {

					if (i != j && i != k && j != k) {

						count++;

						c = 100 * i + 10 * j + k;

						System.out.print(c + " ");

						if (count % 10 == 0) {System.out.println();}

					}

				}

		System.out.println("\n符合要求的数个数为：" + count);

	}

}

