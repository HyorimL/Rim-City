package TEST;

public class 문제4 {

	public static void main(String[] args) {

		// 구구단을 곱하는 수가 단보다 작거나 같은 경우까지만 출력하는 프로그램 작성

		int m = 1;

		for (int i = 1; i <= m; i++) {
			System.out.printf("%d X %d = %d\n", m, i, m * i);
			if (i == m) {
				break;

			}
		}
	}
}
