package refactoring;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClientServic serv = ClientService.getInstance();
		boolean loginOk = false;

		while (true) {
			System.out.println("=============Bank=============");
			if (loginOk) {
				System.out.println("1. Inquiry on deposit and withdrawal 2. Deposit 3. Withdrawal 4. Account transfer 5. Password revision 6. Member withdrawal 7. Logout 0. End");
			} else {
				System.out.println("1. Membership registration 2. Login 3. List 4. ID search 5. PW search 6. Search 7. Undecided 0. End");
			}
			System.out.print("menu > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (loginOk) {
					serv.findById();
				} else {
					serv.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					serv.dw(2);
				} else {
					loginOk = serv.loginCheck();
				}
			} else if (menu == 3) {
				if (loginOk) {
					serv.dw(3);
				} else {
					serv.findAll();
				}
			} else if (menu == 4) {
				if (loginOk) {
					serv.transfer();
				} else {
					serv.searchId();
				}
			} else if (menu == 5) {
				if (loginOk) {
					serv.update();
				} else {
					serv.searchPw();
				}
			} else if (menu == 6) {
				if (loginOk) {
					loginOk = serv.delete();
				} else {
					serv.search();			
				}
			} else if (menu == 7) {
				if (loginOk) {
					serv.logOut();
					loginOk = false;
				} else {
					System.out.println("Service not yet supported");
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("Write Again");
			}
			System.out.println();
		}
		System.out.println("System end");
	}

}
