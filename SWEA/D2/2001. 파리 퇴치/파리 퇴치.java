import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            // N x N 크기의 배열 선언
            int[][] flyArr = new int[N][N];

            // 배열 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    flyArr[i][j] = sc.nextInt();
                }
            }

            int maxSum = 0;

            // 파리채의 왼쪽 위 시작점을 선택
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {

                    int currentSum = 0;

                    // 시작점부터 M x M 영역의 모든 값을 더함
                    for (int row = i; row < i + M; row++) {
                        for (int col = j; col < j + M; col++) {
                            currentSum += flyArr[row][col];
                        }
                    }

                    // 지금까지의 최댓값과 비교
                    maxSum = Math.max(maxSum, currentSum);
                }
            }

            System.out.println("#" + test_case + " " + maxSum);
        }

        sc.close();
    }
}