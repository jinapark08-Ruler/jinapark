package switch01;

import java.util.Scanner;

public class switch02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
		try {
			System.out.println("분류 - 숫자로 작성해주세요 : " + "\n" + "(1.Wood  2.Tile   3.WallPaper   4.Stone   5.HardWare"
					+ "\n" + "6.Glass  7.Fabric   8.Metal   9.Film   10.Etc )");
			int category = sc.nextInt();

			int Wood = 1;
			int Tile = 2;
			int WallPaper = 3;
			int Stone = 4;
			int Hardware = 5;
			int Glass = 6;
			int Fabric = 7;
			int Metal = 8;
			int Film = 9;
			int Etc = 10;

			switch (category) {
			case 1:
				System.out.println("자연목, 마루, 데크제, 계단제, 무늬목 등");
				break;
			case 2:
				System.out.println("박판타일, 폴리싱타일, 세라믹타일, 도기타일, 자기타일 등");
				break;
			case 3:
				System.out.println("종이벽지, 실크벽지, 친환경벽지, 패브릭벽지 등");
				break;
			case 4:
				System.out.println("대리석 등");
				break;
			case 5:
				System.out.println("경첩, 손잡이 등");
				break;
			case 6:
				System.out.println("유리, 강화유리, 칼라유리, 세틴유리, 패턴유리 등");
				break;
			case 7:
				System.out.println("면, 실크, 메탈 등");
				break;
			case 8:
				System.out.println("스테인레스, 칼라스테인레스 등");
				break;
			case 9:
				System.out.println("디자인필름,반투명필름,페브릭필름,패턴필름 등");
				break;
			case 10:
				System.out.println("신소재, 기타 등 ");
				break;

			}
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요!");

		}continue;}
	}

}
