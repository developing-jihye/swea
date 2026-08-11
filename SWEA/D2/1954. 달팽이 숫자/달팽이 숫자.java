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
			System.out.println("#" + test_case);
			
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            
            // 시작 위치
            int row = 0;
            int col = 0;
            
            // 현재 방향
            int direction = 0;
	         // 0 = 오른쪽
	         // 1 = 아래
	         // 2 = 왼쪽
	         // 3 = 위
            
            for (int i = 1; i <= N*N; i++) {
            	arr[row][col] = i;
            	
            	if(i == N*N) {
            		break;
            	}
            	
            	if(direction == 0) { // 오른쪽
            		if(col + 1 < N && arr[row][col+1] == 0 ) {
            			col++;
            		} else {
            			direction = 1; // 아래로 변경
            			row++;
            		}
            	} else if(direction == 1) { // 아래
            		if(row + 1 < N && arr[row+1][col] == 0) {
            			row++;
            		} else {
            			direction = 2; // 왼쪽으로 변경
            			col--;
            		}
            	} else if(direction == 2) { // 왼쪽
            		if(col - 1 >= 0 && arr[row][col - 1] == 0) {
            			col--;
            		} else {
            			direction = 3; // 위로 변경
            			row--;
            		}
            	} else { // 위
            		if(row - 1 >= 0 && arr[row - 1][col] == 0) {
            			row--;
            		} else {
            			direction = 0; // 오른쪽으로 변경
            			col++;
            		}
            	}
            }
            
            for (int i = 0; i < N; i++) {
            	for (int j = 0; j < N; j++) {
            		System.out.print(arr[i][j] + " ");
            	}
            	System.out.println();
            }
		}
	}
}
