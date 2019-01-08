package com.poker.vpip.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poker.vpip.model.DbEntity;
import com.poker.vpip.model.DbWrapper;

public abstract class Repository<T extends DbEntity<T>> {

	private void prepareHelper(List<DbWrapper> list, 
			PreparedStatement statement) throws SQLException{
		int index = 1;
		for (DbWrapper wrapper : list) {
			if (wrapper.isString()) {
				statement.setString(index, wrapper.getString());
			} else {
				statement.setInt(index,  wrapper.getInteger());
			}
			index++;
		}
	}
	
	public void delete(T obj) {
		try(
			Connection connection = ConnectionFactory.getInstance();
			PreparedStatement statement = connection.prepareStatement(deleteQuery());
		) {
			prepareHelper(obj.deleteParameters(), statement);
			statement.executeQuery();
		} catch (SQLException e) {
			System.out.println("Unable to delete item");
		}
	}
	
	public void update(T obj) {
		try(
			Connection connection = ConnectionFactory.getInstance();
			PreparedStatement statement = connection.prepareStatement(updateQuery());
		) {
			prepareHelper(obj.updateParameters(), statement);
			statement.executeQuery();
		} catch (SQLException e) {
			System.out.println("Unable to update item");
		}
	}
	
	public void insert(T obj) {
		try(
			Connection connection = ConnectionFactory.getInstance();
			PreparedStatement statement = connection.prepareStatement(insertQuery());
		) {
			prepareHelper(obj.insertParameters(), statement);
			statement.executeQuery();
		} catch (SQLException e) {
			System.out.println("Unable to insert item");
		}
	}
	
	public List<T> selectAll() {
		List<T> answer = new ArrayList<T>();
		try(
			Connection connection = ConnectionFactory.getInstance();
			PreparedStatement statement = connection.prepareStatement(selectQuery());
		) {
			
			ResultSet set = statement.executeQuery();
			while(set.next()) {
				answer.add(create(set));
			}
		} catch (SQLException e) {
			System.out.println("Unable to insert item");
		}
		return answer;
	}
	
	public abstract T create(ResultSet set) throws SQLException;
	
	protected abstract String updateQuery();
	protected abstract String insertQuery();
	protected abstract String deleteQuery();
	protected abstract String selectQuery();
	
}
