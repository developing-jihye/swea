import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
        int result = 1;
        System.out.print(1 + " ");
        
        for (int  i = 0; i < N; i++) {
        	result *= 2;
            System.out.print(result + " ");
        }
	}
}