package javaIO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc. nextInt();
		
		
		System.out.println(a + b);
		
		String c = sc.nextLine();
		
		System.out.println(c);
		
		// 좀 더 직관적으로 설명하자면 위 처럼 5를 입력하고 Enter를 쳤다면
		// 버퍼에 5\n이 존재한다. 이 때 nextInt()가 버퍼의 내용을 가져올 때 
		// 분리자를 제외하고 가져오기 때문에 5만 가져오게 된다.
		// 그러면 버퍼에 \t가 남아있는데 nextLine()은 공백문자,
		// 개행문자인 분리자를 포함시키기 때문에 \t만 가져오고 프로그램이 종료되는 것이다.
		
		// https://devlog-wjdrbs96.tistory.com/80 
		//-> nextInt()뒤에 nextLine()이 오면 안되는 이유
		
	}

}
