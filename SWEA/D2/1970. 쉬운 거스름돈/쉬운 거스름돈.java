import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[] arr = {50000, 10000, 5000, 1000, 500, 100 ,50 ,10};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			System.out.println("#" + test_case);
			int N = sc.nextInt();
			int money = N;
			for(int w: arr) {
				int count = money / w;
				System.out.print(count + " ");
				money -= w * count;
			}
            System.out.println();
		}
	}
}