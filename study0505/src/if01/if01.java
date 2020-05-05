package if01;

public class if01 {

	public static void main(String[] args) {
		//점수에 따라 등급표시 
		int jum = 85; 
		
		if (jum>=90) {
			System.out.println("학점은 A입니다.");
		}else if (jum>=75) { 
			System.out.println("학점은 B입니다.");
		}else if (jum>=60) { 
			System.out.println("학점은 C입니다.");
		}else {
			System.out.println("재 수강하세요.");
		}

	}

}
