package com.ty.key_store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.key_store.dto.User;
import com.ty.key_store.util.ConnectionObject;


public class UserDao {
	
	User user = new User();
	
	public int saveUser(User user)
	{
		Connection connection = ConnectionObject.getConnection();
		String sql = "insert into user values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getUid());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3,user.getEmail());
			preparedStatement.setString(4,user.getPassword());
			
			return preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				connection.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return 0;
	}
}

