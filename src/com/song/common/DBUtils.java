package com.song.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	// mysql �����ַ���
	private static String DRIVER = "com.mysql.jdbc.Driver";
	// mysql ����URL
	private static String URL = "jdbc:mysql://127.0.0.1:3306/blog";
	// mysql���ݿ��û���
	private static String USERNAME = "root";
	// mysql���ݿ�����
	private static String PASSWORD = "root";
	private static Connection con = null;
	
	/**
	 * ����mysql���ݿ�
	 */
	public static void ConnDB()
	{
		try{
			// �������Ϊ�գ��򴴽�mysql����
			if(con==null){
				// �������ݿ�����
				Class.forName(DRIVER);
				// ��ȡ���ݿ�����
				con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}
		}catch(Exception ex){
			System.out.println(ex.toString());
		}		
	}
	
	public static 
}
