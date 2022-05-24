package com.ty.key_store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.key_store.dto.Key_Store;
import com.ty.key_store.util.ConnectionObject;

public class KeyStoreDao {
	
	List<Key_Store> list = new ArrayList();
	
	public int saveKey_Store(Key_Store key_Store) {
		Connection connection = ConnectionObject.getConnection();
		String sql = "Insert into Key_Store values (?,?,?,?,?)";
		int result = 0;
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, key_Store.getUid());
			preparedstatement.setString(2,key_Store.getComment());
			preparedstatement.setString(3, key_Store.getDescription());
			preparedstatement.setString(4,key_Store.getKey());
			preparedstatement.setString(5, key_Store.getValue());
			
			result = preparedstatement.executeUpdate();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Key_Store> getKey_StoreById(Key_Store Key_Store, int id){
		Connection connection = ConnectionObject.getConnection();
		String sql = "select * from Key_Store where uid =?";
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			ResultSet resultSet = preparedstatement.executeQuery();
			
			while(resultSet.next()) {
				Key_Store Key_Store1 = new Key_Store();
				Key_Store1.setUid(resultSet.getInt(1));
				Key_Store1.setComment(resultSet.getString(2));
				Key_Store1.setDescription(resultSet.getString(3));
				Key_Store1.setKey(resultSet.getString(4));
				Key_Store1.setValue(resultSet.getString(5));
				
				list.add(Key_Store1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

