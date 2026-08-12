import java.util.Arrays;
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
			// 활용할 배열 선언
			int[] score = new int[10];

			// 일단 문자열 배열로 받기 (공백이 없으므로)
			int N = sc.nextInt();
			String scores = sc.next();
			String[] scoresArr = scores.split("");
			
			// 정수 배열로 변환
			int[] scoresIntArr = new int[N];
			for(int i = 0; i < N; i++) {
				scoresIntArr[i] = Integer.parseInt(scoresArr[i]);
			}
			
			// score 정수 배열 활용하여 count
			for(int s: scoresIntArr) {
				score[s]++;
			}
			
			// 최대 개수 구하기
			int max = 0;
			int index = 0;
			for(int i = 0; i < score.length; i++) {
				if(score[i] >= max) {
					max = score[i];
					index = i;
				}
			}
			
			System.out.println("#" + test_case + " " + index + " " + max);
		}
	}
}