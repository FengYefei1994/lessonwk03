package Par0109;
/*
 * 	关于用户的操作：比如登录、修改密码、找回密码...
 */
public class UserAction {
	private User[] users = new User[100];//系统的所有用户
	//User[] users1 = new User[1];         //创建一个空用户


	
	public UserAction() {//构造方法
		initial();//调用初始化方法
	}
	
	/**
	 * 	初始化一些用户数据
	 */
	private void initial() {
		User s0=new User();
		s0.setAdmin(true);
		s0.setUsername("张三");
		s0.setPassword("00000");
		s0.setNickname("三儿");
		users[0]=s0;
		
		User s1=new User();
		s1.setAdmin(true);
		s1.setUsername("李四");
		s1.setPassword("12345");
		s1.setNickname("四眼仔");
		users[1]=s1;
		
		User s2=new User();
		s2.setAdmin(false);
		s2.setUsername("王五");
		s2.setPassword("54321");
		s2.setNickname("伍仁月饼");
		users[2]=s2;
		
		User s3=new User();
		s3.setAdmin(false);
		s3.setUsername("王一");
		s3.setPassword("11111");
		s3.setNickname("扁担");
		users[3]=s3;
		
		/*
		 * User s4=new User(); s4.setAdmin(false); s4.setUsername(null);
		 * s4.setPassword(null); s4.setNickname(null); users1[0]=s4;
		 */
		
	
		
		//补齐此处代码
		//初始化1个或以上的管理员，1个或以上的不是管理员的用户 ，放到users数组中
	}
	
	/**
	 * 						登录方法
	 * @param username		登录的账号
	 * @param password		登录的密码
	 * @return 
	 * @return				当前登录成功的用户对象<br/>			若账号密码错误，则返回null
	 */
	public User login(String username,String password)  throws NullPointerException{
		//补齐此处代码
		//循环users数组，判断账号和密码
		int b = 0;		
		for (b = 0; b < users.length; ++b) {
			if (users[b].getUsername().equals(username) && users[b].getPassword().equals(password)) {				
				break;
			}
		}
		return users[b];
	}
}
