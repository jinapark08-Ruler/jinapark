package switch01;


public class switch01 {

	public static void main(String[] args) {
		
		//점수에 따라 등급 표시하기 
		
		int jumsu = 85; 
		switch (jumsu/10) {
		case 10: 
		case 9: 
			System.out.println("학점은 A입니다.");
			break;
		case 8:
			System.out.println("학점은 B입니다.");
			break;
		case 7:
			System.out.println("학점은 C입니다.");
			break;
			default:
				System.out.println("재수강하세요.");
		}
	
}
}
