package java10988;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int length = word.length();
		int firstLength = 0;
		int secondLength = 0;
		char first;
		char second;
		
		
		if(length % 2 == 0) { // 중심에 2개가 있는 경우
			firstLength = (length/2)-1;
			secondLength = (length/2);
		}else if(length == 1){ // 글자가 1개인 경우
			System.out.println(1);
			return;
		}	
		else { // 중심에 한개가 있는경우
			firstLength = (length/2)-1;
			secondLength = (length/2)+1;
		}
		first = word.charAt(firstLength);
		second = word.charAt(secondLength);
		
		// 팰린드롬 검증 시작
		while(firstLength >= 0) {
			first = word.charAt(firstLength);
			second = word.charAt(secondLength);
			
			boolean check = (first==second);
			if(!check) {
				System.out.println(0);
				return;
			}
			
			firstLength -= 1;
			secondLength += 1;
		}
		
		System.out.println(1);
	
	}
	
}


