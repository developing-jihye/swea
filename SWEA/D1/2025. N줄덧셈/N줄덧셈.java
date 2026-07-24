import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i < N+1; i++) {
            sum += i;
        }
        
        System.out.println(sum);
	}
}