package day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayList연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] mList = new Member[10];
		Member m = new Member();
		mList[0] = m;
		mList[1] = m;
		for (int i = 0; i < mList.length; i++) {
			System.out.println(mList[i]);
		}

		List<Member> list = new ArrayList<>();
		list.add(m);
		list.add(m);
		list.add(m);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Member mm : list) {     
			System.out.println(mm);
		}
		//오른쪽에는 배열이나 리스트 왼쪽에는 넣을 변수 List는 Member 객체가 들어가 있기 떄문에 너ㅗㅎ을 변수으 ㅣ 타입도 Member이어야 함.
		// 향상된 for문
		// 배열은 크기가 지정 arraylist는 값을 집어넣을때마다 크기가 달라짐
	}

}
