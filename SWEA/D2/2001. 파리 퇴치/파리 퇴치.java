import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            // 배열 크기 받는다.
            int N = sc.nextInt();
            // 파리채 크기 받는다.
            int M = sc.nextInt();
            
            // 파리 배열 선언한다.
            int[][] flyArr = new int[N][N];
            
            // 각 배열 칸에 파리 수 받는다.
            for(int i = 0; i < N; i++) {
            	for (int j = 0; j < N; j++) {
                    flyArr[i][j] = sc.nextInt();
                }
            }
            
            // 최대 파리 수 값 초기화
            int maxSum = 0;
            
            // 각 칸을 파리채 왼쪽 위 시작점으로 탐색하기 위한 반복문
            for (int i = 0; i <= N-M; i++) {
            	for (int j = 0; j <= N-M; j++) {
                	
                    // 각각의 파리채 크키&위치별 파리 수 합 초기화
                    int currentSum = 0;
                    
                    // 파리 수 더하기 위한 반복문
                    for (int k = 0; k < M; k++) {
                    	for (int l = 0; l < M; l++) {
                            currentSum += flyArr[i + k][j + l];
                        }
                    }
                    // 최대인지 비교
                    maxSum = Math.max(maxSum, currentSum);
                }
            }
            
            System.out.println("#" + test_case + " " + maxSum);
		}
	}
}