package java2566;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] testArray = new int[9][9];
		
		for(int j = 0; j < 9; j++) {
			for(int k = 0; k < 9; k++) {
				testArray[j][k] = sc.nextInt();
			}
		}
		
		int maxValue = 0;
		int a = 0;
		int b = 0;
		
		for(int j = 0; j < 9; j++) {
			for(int k = 0; k < 9; k++) {
				if(maxValue < testArray[j][k]) {
					maxValue = testArray[j][k];
					a = j;
					b = k;
				}
			}
		}
		
		System.out.println(maxValue);
		System.out.println((a+1) + " " + (b+1));
		
	}
}
