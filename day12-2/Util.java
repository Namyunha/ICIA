package day12;

import java.util.Scanner;

public class Util {
	Scanner sc = new Scanner(System.in);

	public int numberCheck() {
		if(sc.hasNextInt()) {
			return sc.nextInt();
		}else {
			sc.nextLine();
			return -1;
		}
	}
}
