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
			int[] nums = new int[10];
			for (int i = 0; i < 10;i++) {
				nums[i] = sc.nextInt();
			}
		
			int min = nums[0];
			int max = nums[0];
			for(int n: nums) {
				if (n > max) {
					max = n; 
				}
				
				if(n < min) {
					min = n;
				}
			}
			
			int sum = 0;
			for(int n: nums) {
				sum += n;
			}
			sum -= min;
			sum -= max;
			
			double avg = (double) sum / 8;
			
			System.out.println("#" + test_case + " " + Math.round(avg));
		}
	}
}