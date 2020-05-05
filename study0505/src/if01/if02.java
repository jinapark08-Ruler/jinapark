package if01;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {

		// 10보다 큰 수를 입력받아 짝수와 홀수를 구분하고
		// 10보다 작은 수 를 넣으면 안내 후 다시 작성 할 수 있게 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요(10이상):");

		while (true) {
			int su = sc.nextInt();
			// int su = 5;
			int a = 10;
			// 입력받은 수가 10보다 큰 경우
			if (su >= a) {
				// 짝수 홀수 구분
				if (su % 2 == 0) {
					System.out.println("짝수입니다.");
				} else {
					System.out.println("홀수입니다.");
				}
				break;
				// 수가 10보다 작으면 다시 작성
			} else {
				System.out.println("10보다 큰 수로 입력해주세요.");
				continue;
			}

		}
		sc.close();

	}

}
