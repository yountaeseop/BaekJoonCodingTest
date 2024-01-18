package java1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] answer = sc.nextLine().split(" ");
		
		
		for(int a = 0; a < answer.length; a++) {
			System.out.println(answer[a].trim());
		}
		
		if(answer[0].equals(" ")) {
			System.out.println(answer.length - 1);
		}
		System.out.println(answer.length);
	}

}
