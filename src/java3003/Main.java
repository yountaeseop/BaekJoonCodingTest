package java3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] nums = sc.nextLine().split(" ");
		int[] standard = { 1, 1, 2, 2, 2, 8 };

		for (int a = 0; a < nums.length; a++) {

			int operator = standard[a] - Integer.parseInt(nums[a]);

			nums[a] = Integer.toString(operator);
		}

		for (int a = 0; a < nums.length; a++) {
			System.out.print(nums[a] + " ");
		}
	}
}
