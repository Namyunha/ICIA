package day2_230202;

public class 반복문_break_continue {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			if (i < 4) {
				continue;
			} else if (i > 7) {
				break;
			}
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
//		for(int i = 1 ; i<=10 ; i++) {
//			if(i==5) {
//				continue;
//			}
////			System.out.println(i);
//			
//		}

//가로구구단 ----------------------------
//for (int i = 0; i <= 9; i++) {
//
//	for (int j = 2; j <= 9; j++) {
//		if (i == 0) {
//			System.out.print(j + "단\t\t");
//		} else {
//			System.out.print(j + " * " + i + " = " + i * j + "\t");
//		}
//	}
//	System.out.println();
//}
//------------------------------------
// 
////for(int i=1; i<=10;i++) {
////System.out.println();
////if(i==5) {
////	break;
////}
//}