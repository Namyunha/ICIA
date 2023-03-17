package day5;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동";
		String name2 = "이순신";
		String name3 = "심청이";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
//		배열은 하나의 변수에 여러값을 들어가게 함 / 변수에는 하나의 값
		String[] name = new String[3]; // 문자열이 들어갈 수 있는 배열3칸 만들기
		int[] i = new int[10]; // 정수가 들어갈 수 있는 배열10칸 만들기
		// int i [] = new int[10];
		// 배열의 방을 index 항상 0부터 시작
		// int [] i = {34, 98, 94, 5, 3, 124, 1, 34, 25, 74} 생성과 할당을 동시에
		i[0] = 123;
		i[1] = 223;
		i[2] = 423;
		i[3] = 423;
		i[4] = 423;
		i[5] = 423;
		i[6] = 423;
		i[7] = 423;
		i[8] = 423;
		i[9] = 423;
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		name[0] = "배열홍길동";
		name[1] = "배열이순신";
		name[1] = "배열남윤하"; // 배열덮어쓰기가능
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
	}

}
