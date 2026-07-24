import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        int[] lastDay = {
        	0, 
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String date = sc.next();
            
            String year = date.substring(0, 4);
            String monthString = date.substring(4, 6);
            String dayString = date.substring(6, 8);
            
            int month = Integer.parseInt(monthString);
            int day = Integer.parseInt(dayString);
            
            if (month >= 1 && month <=12) {
            	if (day >= 1 && day <= lastDay[month]) {
                	System.out.println("#" + test_case + " " + year + "/" + monthString + "/" + dayString);
                } else {
                    System.out.println("#" + test_case + " " +-1);
                }
            } else {
            	System.out.println("#" + test_case + " " +-1);
            }
		}
	}
}