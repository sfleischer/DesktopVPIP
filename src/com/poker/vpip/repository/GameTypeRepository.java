package com.poker.vpip.repository;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poker.vpip.model.GameType;

public class GameTypeRepository extends Repository<GameType>{

	@Override
	public GameType create(ResultSet set) throws SQLException {
		int typeID = set.getInt("typeID");
		String name = set.getString("name");
		return new GameType(typeID, name);
	}

	@Override
	protected String updateQuery() {
		return ("UPDATE VPIP.GameType SET name='?' WHERE typeID=?");
	}

	@Override
	protected String insertQuery() {
		return "INSERT INTO VPIP.GameType (name) VALUES (?)";
	}

	@Override
	protected String deleteQuery() {
		return "DELETE FROM VPIP.GameType WHERE typeID=?";
	}

	@Override
	protected String selectQuery() {
		return "SELECT * FROM VPIP.GameType";
	}

}
