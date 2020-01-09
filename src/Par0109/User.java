package Par0109;
/*
 * 	用户类
 */
public class User {
	private String username;//账号
	private String password;//密码
	private String nickname;//昵称
	private boolean admin;//是否是管理员
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public boolean isAdmin() {
		return admin;
	}
	/**
	 * 	设置是否是管理员
	 * @param admin				true:是<br/> 	false:不是管理员，是一个普通的学生
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
}
