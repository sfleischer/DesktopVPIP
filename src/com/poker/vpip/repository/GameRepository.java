package com.poker.vpip.repository;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poker.vpip.model.Game;

public class GameRepository extends Repository<Game>{

	
	protected String insertQuery() {
		return "INSERT INTO VPIP.Game (type, buyin, name) VALUES (?, ?, ?)";
	}
	
	protected String updateQuery() {
		return ("UPDATE VPIP.Game SET "
				+ "type=?"
				+ "buyin=?"
				+ "name='?'"
				+ "WHERE gameID=?");
	}
	
	protected String deleteQuery() {
		return "DELETE FROM VPIP.Game WHERE gameID=?";
	}
	
	@Override
	protected String selectQuery() {
		return "SELECT * FROM VPIP.Game";
	}
	
	@Override
	public Game create(ResultSet set) throws SQLException {
		int gameID = set.getInt("gameID");
		int type = set.getInt("type");
		int buyin = set.getInt("buyin");
		String name = set.getString("name");
		return new Game(gameID, type, buyin, name);
	}

	

}
