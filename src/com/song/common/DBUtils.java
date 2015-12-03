package com.song.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtils {
	// mysql �����ַ���
	private static String DRIVER = "com.mysql.jdbc.Driver";
	// mysql ����URL
	private static String URL = "jdbc:mysql://127.0.0.1:3306/blog";
	// mysql���ݿ��û���
	private static String USERNAME = "root";
	// mysql���ݿ�����
	private static String PASSWORD = "root";
	// ���ݿ�����
	private static Connection con = null;

	
	/**
	 * ����mysql���ݿ�
	 * @throws Exception 
	 */
	public static void ConnDB() throws Exception
	{
		// �������Ϊ�գ��򴴽�mysql����
		if (con == null) {
			// �������ݿ�����
			Class.forName(DRIVER);
			// ��ȡ���ݿ�����
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}
	}
	
	/**
	 * ��ѯ���
	 * @param sql ��ѯ��SQL���
	 * @return ���ز�ѯ���ResultSet
	 * @throws SQLException 
	 */
	public static ResultSet Query(String sql) throws SQLException
	{
		Statement stmt = con.createStatement();
		return stmt.executeQuery(sql);		
	}
	
	/**
	 * ���¡����롢ɾ��
	 * @param sql ִ�е�SQL���
	 * @return Ӱ�������
	 * @throws SQLException 
	 */
	public static int ExecuteUpdateOrDelete(String sql) throws SQLException
	{
		int row = 0;
		Statement stmt = con.createStatement();
		row = stmt.executeUpdate(sql);
		return row;
	}
	
	/**
	 * �ر����ݿ�
	 * @throws SQLException
	 */
	public static void CloseCon()
	{
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
