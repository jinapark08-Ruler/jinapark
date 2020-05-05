package Array01;

public class Array01 {

	public static void main(String[] args) {
		// Array 예문01
				// 배열안의 3의 갯수는?
				int[] numArr = { 1, 2, 3, 4, 3, 5, 3, 7 };
				int a = 0;

				for (int i = 0; i < numArr.length; i++) {
					if (numArr[i] == 3) {
						a++;
					}
				}

				System.out.println("3의 갯수는:" + a);

				// Array 예문02
				// red빼고 출력
				String[] color = { "red", "blue", "red", "pink", "red", "black" };

				for (int j = 0; j < color.length; j++) {
					if (!color[j].equals("red")) {

						System.out.println("red가 아닌색:" + color[j]);

					}

				}

				// 60이 넘는 데이터의 합계, 개수, 평균을 구하기

				int[] data = { 68, 88, 35, 28, 84, 78 };
				
				int sum=0;
				int cnt=0;
				
				for (int k=0; k<data.length;k++) {
					if (data[k] >= 60) { 
						sum = sum+data[k]; 
						cnt++;
					}
					
				}
				System.out.println("60이상의 수 합계:"+sum);
				System.out.println("60이상의 수 개수:"+cnt);
				
				
				
				
				// 20이 넘는 데이터의 합계, 개수, 평균을 구하기
				//평균은 소수 첫째자리에서 반올림 해서 정수로 저장 

				int[] dataArr = { 36, 28, 17 , 5 , 56 , 23 };
				
				int sum2 = 0;
				int cnt2 = 0; 
				
				for (int l=0; l<dataArr.length;l++) {
					//20 이상의 수 
					if (dataArr[l] > 20) {
						//합계구하기
						sum2 = sum2+dataArr[l];
						//개수구하기 
						cnt2++; 
					}
				}
				//출력
				System.out.println("20이상의 수 합계:"+sum2);
				System.out.println("20이상의 수 개수:"+cnt2);
				
				//평균 구하기 
				
				/*double avg = sum2/cnt2+0.5; 
				avg = (int)avg;*/
				
				int avg = 0;
				avg = (int)((double)sum2/cnt2 +0.5);

				System.out.println("20이상의 수 평균:"+avg);
	}

}
