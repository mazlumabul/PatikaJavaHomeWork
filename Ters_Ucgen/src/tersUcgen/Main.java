package tersUcgen;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("N : ");
		
		n = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * n - 1; k >= (2 * i + 1); k--) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
