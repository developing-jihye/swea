import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

			Set<Integer> tempSet = new HashSet<>();
			int currentN = 0;
            
			for(int i = 1; tempSet.size() < 10; i++) {
				currentN = N * i;
				int fakeN = currentN;
				
				while(fakeN > 0) {
					int num = fakeN % 10;
					tempSet.add(num);
					fakeN = fakeN / 10;
				}
			}
            
            
            System.out.println("#" + test_case + " " + currentN);
		}
	}
}