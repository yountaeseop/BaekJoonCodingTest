package codingTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] number = sc.nextLine().split(" ");
		
		int sum = 0;
		
		for(int a = 0; a < number.length; a++) {
			int num = Integer.parseInt(number[a]);
			sum += num;
		}
		
		System.out.println(sum);
		
	}
}
