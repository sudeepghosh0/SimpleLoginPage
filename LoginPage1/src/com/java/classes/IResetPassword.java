package com.java.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class IResetPassword
{
DataSource datasource;
public void setDataSource(DataSource datasource)
{
	this.datasource=datasource;
}
public boolean iResetPassword(String u,String p)
{
	try {
		Connection con=datasource.getConnection();
		PreparedStatement ps=con.prepareStatement("update cred set p=? where u=?");
		ps.setString(1,p);
		ps.setString(2,u);
		int rs=ps.executeUpdate();
		System.out.println(rs);
		if(rs>0)
		{
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return false;
}

}
