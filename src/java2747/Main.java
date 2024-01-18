package java2747;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		int[] fibonacci = new int[46];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int a = 0; a < N - 2; a++) {
			fibonacci[a+2] = fibonacci[a] + fibonacci[a+1];
		}
		
		//System.out.println();
		for(int a = 0; a < N - 1; a++) {
			//System.out.print(fibonacci[a] + " ");
			sum += fibonacci[a]; 
		}
		//System.out.println();
		
		System.out.print(sum+1);
	}
}
