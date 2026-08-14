import java.util.Base64;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();

			byte[] decodedBytes = Base64.getDecoder().decode(str);

			String result = new String(decodedBytes);

			System.out.println("#" + test_case + " " + result);
		}
	}
}