import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			// 처음 양의 번호 N 입력
			int N = sc.nextInt();

			// 지금까지 등장한 숫자(0~9)를 중복 없이 저장
			Set<Integer> tempSet = new HashSet<>();

			// 현재 세고 있는 양의 번호
			int currentN = 0;

			// 0~9를 모두 발견할 때까지 N, 2N, 3N ... 을 확인
			for (int i = 1; tempSet.size() < 10; i++) {

				// 현재 확인할 양의 번호
				currentN = N * i;

				// currentN을 보존하기 위해 자릿수 확인용 복사본 생성
				int fakeN = currentN;

				// 현재 숫자의 각 자릿수를 하나씩 확인
				while (fakeN > 0) {

					// % 10을 이용해 가장 오른쪽 숫자를 추출
					int num = fakeN % 10;

					// 발견한 숫자를 Set에 저장
					// HashSet은 중복된 숫자를 자동으로 무시
					tempSet.add(num);

					// / 10을 이용해 확인한 마지막 자릿수를 제거
					fakeN = fakeN / 10;
				}
			}

			// 0~9를 모두 발견했을 때 마지막으로 센 양의 번호 출력
			System.out.println("#" + test_case + " " + currentN);
		}
	}
}