package 이은수;

import java.util.List;
import java.util.Scanner;

public class Util {
	UserRepository re = new UserRepository();
	List<UserDTO> uList = re.list();
	Scanner sc = new Scanner(System.in);

}
