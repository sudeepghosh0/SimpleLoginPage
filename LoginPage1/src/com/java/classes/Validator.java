package com.java.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Validator 
{
private DataSource datasource;
public void setDataSource(DataSource datasource)
{
	this.datasource=datasource;
}

		public boolean validate(String username,String password) throws SQLException
		{
		int i=0;

			try {
				Connection con=datasource.getConnection();
				PreparedStatement ps=con.prepareStatement("select u,p from cred where u=? and p=?");
				ps.setString(1,username);
				ps.setString(2,password);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					return true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return false;
		}
}
