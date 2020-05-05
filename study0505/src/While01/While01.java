package While01;

public class While01 {

	public static void main(String[] args) {
		
		// 반복문 loop, Iteration
		
				/* while (조건식) {
				 * 수행문 1:
				 * 증감식 } (==>조건식의 내용이 false가 될 때 까지 {}안의 내용을 반복)
				 * 수행문2
				 */
				
				//while 예문 01 
				//while문을 활용하여 1부터 10까지 더하기
				
				int num=0;
				int sum=0; 
				
				while(num<=10) {
					sum+=num;
					num++;
				}
				System.out.println("1부터 10까지의 합계 :"+sum );
				
				System.out.println("===========================");
				
				
				//while 예문02
				//image1,image2,image3을 순서대로 출력 
				
				//기본값 입력 
				int idx=1;
				//1~3까지 반복
				while (idx < 4) { 
					//출력
		        System.out.println("image"+(idx)+".png");
		        idx=idx+1;
				}
				
				System.out.println("===========================");
				
				//while 예문 03
				//image2,image4,image6을 순서대로 3번 출력 
				
			    
				int su = 0; 
				//0부터 9까지 번갈아 3번 반복 
				while (su<9) {
					//2부터 2씩증가
					System.out.println("image"+(su%3*2+2)+".png");
					su=su+1;
				}
				
				System.out.println("===========================");
				
				//do while 
				/* do {
				 * 반복할내용
				 * }while(조건식); {
				 * (==>조건식의 내용이 false가 될 때 까지 {}안의 내용을 반복)
				 */
				
				//do while 예문01 
				//배열의 합계를 구해서 풀력하고 평균을 소수 2째자리에서 반올림해서 소수 1째자리까지 출력 
				
				
				
				int[]ar = {37,40,22,17,9,77};
				int a =0;
				int b =0;
				
				do { 
					//반복할내용
					//합계=0+배열내의수 들  a는 0부터 시작
					b = b + ar[a];
					//반복
					a = a + 1;

		         //배열의 수는 0부터 시작해서 0~5까지 6개의 수이므로 a<6 
				}while (a<6); 
				//합계출력
				System.out.println("합계:"+b); 
				
				//평균 출력
				//반올림 하기 위해 실수로 출력 double 나누기 할때 꼭 .0 붙여야함!! 
			    double avg = b/6.0;
			    System.out.println("평균:"+avg);
			    
			    //반올림 할 자리를 소수 첫째자리로 보내고 +0.5(반올림)
			    avg= avg*10 +0.5; 
			    //정수로 변환해서 소수를 버림 
			    avg = (int)avg;
			    //반대작업 수행 
			    avg=avg/10;
			    //출력
			    System.out.println("평균:"+avg); 


	}

}
