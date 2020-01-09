package Par0109;

import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		UserAction u1=new  UserAction();
		String txtUsername=input.next();
		String pwdPassword=input.next();
		try {
			u1.login(txtUsername,pwdPassword);
		}catch(NullPointerException e) {
			System.out.println("账号或密码错误！");
		}
		
	}

}
