import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        int[] arr = {2, 3, 5, 7, 11};
		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.print("#" + test_case + " ");
            int N = sc.nextInt();
            
            for(int num : arr) {
                int count = 0;
                while(N % num == 0) {
                    count++;
                    N = N / num;
                }
                System.out.print(count + " ");
            }
            System.out.println();
		}
	}
}