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
        	int N = sc.nextInt();
        	
        	int[] patients = new int[N];
        	for(int i = 0; i < N; i++) {
        		patients[i] = sc.nextInt();
        	}
        	
        	Arrays.sort(patients);
        	
        	int wait = 0;
        	int totalSum = 0;
        	for(int i = 0; i < N; i++) {
        		totalSum += wait;
        		wait += patients[i];
        	}
        	System.out.println("#" + test_case + " " + totalSum);
		}
	}
}