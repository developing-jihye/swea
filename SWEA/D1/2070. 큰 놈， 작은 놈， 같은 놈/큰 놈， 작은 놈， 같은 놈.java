import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) // 각 줄 순회한다.
		{
            int a = sc.nextInt(); // 앞 숫자 받는다.
            int b = sc.nextInt(); // 뒷 숫자 받는다.
            
            if (a > b) {
            	System.out.println("#" + test_case + " >");
            } else if (a == b) {
            	System.out.println("#" + test_case + " =");
            } else {
            	System.out.println("#" + test_case + " <");
            }
		}
	}
}