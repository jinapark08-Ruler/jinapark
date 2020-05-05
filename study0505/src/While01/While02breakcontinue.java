package While01;

public class While02breakcontinue {

	public static void main(String[] args) {

		// 1~5까지의 합을 더하디 2의 배수는 배제

		int a = 0;
		int hap = 0;
		// 무한반복문
		while (true) {
			// a의 값을 1씩 증가 (a=a+1)
			a++;
			// a가 5보다 작을때 반복중단
			if (a > 5)
				break;
			// a가 2의 배수일때는 실행하지 않고 넘김
			if (a % 2 == 0)
				continue;
			// 합은 0~5까지의 수에서 2의 배수를 뺀 값
			hap = hap + a;

		}
		// 결과를 출력
		System.out.println("result:" + hap);

	}

}
