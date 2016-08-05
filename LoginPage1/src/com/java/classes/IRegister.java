package com.java.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class IRegister
{
	private DataSource datasource;
	public void setDataSource(DataSource datasource)
	{
		this.datasource=datasource;
	}

			public boolean register(String username,String password) throws SQLException
			{

				try {
					Connection con=datasource.getConnection();
					PreparedStatement ps=con.prepareStatement("Insert into cred(u,p) values(?,?)");
					ps.setString(1,username);
					ps.setString(2,password);
					int rs=ps.executeUpdate();
					System.out.println(rs);
					if(rs>0)
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
