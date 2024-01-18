package java11718;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder br = new StringBuilder();
//		hasNext(), hasNextInt() 등 이런 메소드들로 처리해도 백준에서는 
//		문제가 해결되는 이유가 더이상 데이터를 읽을 것이 없는경우 당연히 nextInt() 
//		에서 받는 입력이 존재하지 않아 예외를 던져준다.
//		그러나 IDE나 터미널에서 우리가 입력을 할 경우 공백이나 엔터를 치더라도 
//		이 또한 입력 이벤트로 데이터가 스트림에 넣어지는 것이기 때문에 예외가 던져지는 
//		것이 아니다. 결국 반복문을 종료시키려면 
//		hasNextInt()에서 EOF를 입력(윈도우의 경우는 ctrl + Z, 
//		리눅스계열의 경우 ctrl + D)해주거나 정수가 아닌 문자열을 입력한다던가 등 
//		다른 타입의 입력을 주어 InputMismatchException 을 던져주어야 한다.
		int maxInput = 100;
		
		while(sc.hasNext() || maxInput < 101) {
			String input = sc.nextLine();
			br.append(input+"\n");
			maxInput++;
		}
		
		System.out.println(br);
	}
}
