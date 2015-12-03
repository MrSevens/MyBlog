package com.song.dao;

import com.song.common.DBUtils;
import com.song.entity.User;

public class UserDAO {


	/**
	 * ����û�
	 * @param user �û�����
	 * @return true��ӳɹ���false���ʧ��
	 */
	@SuppressWarnings("finally")
	public boolean AddUser(User user)
	{
		boolean isSuccess = false;
		// �������û���SQL���
		String sql = "insert into t_user(username,password) values('"+user.getUsername()+"','"+user.getPassword()+"')";
		try {
			// �����ݿ�
			DBUtils.ConnDB();
			// ִ�в������ݿ����
			int row = DBUtils.ExecuteUpdateOrDelete(sql);
			// ���Ӱ����������0��ִ�гɹ�
			if(row >0)
			{
				isSuccess = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			isSuccess = false;
			e.printStackTrace();
		}finally{
			DBUtils.CloseCon();
			return isSuccess;
		}
	}
}
