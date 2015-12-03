package com.song.struts;

import com.opensymphony.xwork2.ActionSupport;
import com.song.bll.UserBLL;
import com.song.entity.User;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1344151717344033281L;
    private String username;
    private String password;
    
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	/**
	 * ��¼Action
	 * @return
	 * @throws Exception
	 */
	public String login()throws Exception{
		// ʵ�����û�����
		User user = new User();
		// ��ʵ�������������û���������
		user.setUsername(username);
		user.setPassword(password);
		UserBLL userBLL = new UserBLL();
		// ����û�����������֤ͨ��
		if(userBLL.Login(user))
		{
			return "success";
		}
		return "false";
	}

}
