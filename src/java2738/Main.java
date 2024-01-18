package java2738;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 세로
		int M = sc.nextInt(); // 가로
		
		int[][] inputTestA = new int[N][M];
		int[][] inputTestB = new int[N][M];
		// N*M의 행렬 2개를 만들고
		// 각각의 행렬을 더해준 행렬을 출력하는 문제
		
		for(int t = 0; t < N; t++) {
			for(int k = 0; k < M; k++) {
				inputTestA[t][k] = sc.nextInt(); 
			}
		}
		
		for(int t = 0; t < N; t++) {
			for(int k = 0; k < M; k++) {
				inputTestB[t][k] = sc.nextInt(); 
			}
		}
		
		for(int t = 0; t < N; t++) {
			for(int k = 0; k < M; k++) {
				inputTestA[t][k] = inputTestA[t][k] + inputTestB[t][k]; 
			}
		}
		
		for(int t = 0; t < N; t++) {
			for(int k = 0; k < M; k++) {
				System.out.print(inputTestA[t][k]+" ");
			}
			System.out.println();
		}
	}
}
