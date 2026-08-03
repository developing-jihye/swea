import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            
            int[] freq = new int[101];            
            for(int i = 0; i < 1000; i++) {
            	int score = sc.nextInt();
                freq[score]++;
            }
            
            int maxCount = 0;
            int index = 0;
            for(int i = 0; i < 101; i++) {
                if(freq[i] >= maxCount) {
                	maxCount = freq[i];
                    index = i;
                }
            }
            
            System.out.println("#" + N + " " + index);
		}
	}
}