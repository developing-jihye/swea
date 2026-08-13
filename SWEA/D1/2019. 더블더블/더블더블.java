import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
        int num = 1;
        for (int i = 0; i <= N; i++){
            System.out.print(num + " ");
            num *= 2;
        }
	}
}