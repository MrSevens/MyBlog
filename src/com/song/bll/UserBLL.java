package com.song.bll;

import com.song.dao.UserDAO;
import com.song.entity.User;

public class UserBLL {
	private UserDAO userDAO;

	/**
	 * ���췽��
	 */
	public UserBLL()
	{
		userDAO = new UserDAO();
	}
	
	/**
	 * ע���û�
	 * @param user ע���û�����ʵ��
	 * @return trueע��ɹ���falseע��ʧ��
	 */
	public boolean Register(User user)
	{
		return userDAO.AddUser(user);		
	}
	
	/**
	 * �û���¼
	 * @param user ��װ�ĵ�¼�û���Ϣ
	 * @return true��֤ͨ�����Ե�¼��false��֤ʧ�ܲ��ܵ�¼
	 */
	public boolean Login(User user)
	{
		User u = userDAO.GetUser(user);
		if(u != null)
		{
			return true;
		}
		return false;
	}
}
