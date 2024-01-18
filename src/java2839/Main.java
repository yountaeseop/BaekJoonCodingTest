package java2839;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a = 3;
		int b = 5;
		int result = 0; // 봉지의 최소 개수

		while (true) {
			if (N == 3) {
				result = 1;
				break;
			}else if(N == 4) {
				result = -1;
				break;
			}
			else if (N >= 5) {
//				for (int t = 0; t < N / 5; t++) {
//					result += 1;
//				}
				result = N/5;

				int divide = N % 5;

				if (divide % 3 != 0) {
					result = -1;
					break;
				} else if (divide % 3 > 3) {
					result += 1;
					break;
				} else {
					result += 1;
					break;
				}
			}
		}

		System.out.println(result);
	}
}
