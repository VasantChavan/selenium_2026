package patterns;

public class Pattern01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("* ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// System.out.println("************************");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				// System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("*******************");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("* ");
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("*******************");

		for (int i = 65; i <= 70; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char)i + " ");
			}
			System.out.println();
		}
		
		System.out.println("*******************");

		for (int i = 65; i <= 70; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("*******************");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}

}
