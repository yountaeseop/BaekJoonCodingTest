package java5622;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] alphabet = "ABC DEF GHI JKL MNO PQRS TUV WXYZ".split(" ");

		String[] word = sc.nextLine().split("");

		int minTime = 0;

		for (int a = 0; a < alphabet.length; a++) {
			for (int n = 0; n < word.length; n++) {
				if (alphabet[a].contains(word[n])) {
					if (a == 0) {
						minTime += 3;
					} else if (a == 1) {
						minTime += 4;
					} else if (a == 2) {
						minTime += 5;
					} else if (a == 3) {
						minTime += 6;
					} else if (a == 4) {
						minTime += 7;
					} else if (a == 5) {
						minTime += 8;
					} else if (a == 6) {
						minTime += 9;
					} else if (a == 7) {
						minTime += 10;
					}
				}
			}
		}

		System.out.println(minTime);
	}
}
