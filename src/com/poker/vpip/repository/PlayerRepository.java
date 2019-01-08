package com.poker.vpip.repository;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poker.vpip.model.Player;

public class PlayerRepository extends Repository<Player>{

	@Override
	public Player create(ResultSet set) throws SQLException {
		int playerID = set.getInt("playerID");
		String name = set.getString("name");
		return new Player(playerID, name);
	}

	@Override
	protected String updateQuery() {
		return "UPDATE VPIP.Player SET name='?' WHERE playerID=?";
	}

	@Override
	protected String insertQuery() {
		return "INSERT INTO VPIP.Player (name) VALUES (?)";
	}

	@Override
	protected String deleteQuery() {
		return "DELETE FROM VPIP.Player WHERE playerID=?";
	}

	@Override
	protected String selectQuery() {
		return "SELECT * FROM VPIP.Player";
	}

}
