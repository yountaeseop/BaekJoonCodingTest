package java2748;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		long [] fibonacci = new long[91];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int a = 2; a <= N; a++) {
			fibonacci[a] = fibonacci[a-1] + fibonacci[a-2];
		}
		
		//System.out.println();
//		for(int a = 0; a < N - 1; a++) {
//			sum += fibonacci[a]; 
//			System.out.print(fibonacci[a] + " ");
//		}
		//System.out.println();
		
		System.out.print(fibonacci[N]);

	}
}
