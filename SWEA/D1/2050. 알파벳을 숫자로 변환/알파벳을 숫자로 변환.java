import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // 문자 배열을 하나 만든다.
        char[] strArr = new char[str.length()];
        
        // 문자 - 문자 => 결과는 아스키코드
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) - 'A' + 1 + " ");
        }
	}
}