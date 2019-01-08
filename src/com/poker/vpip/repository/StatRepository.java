package com.poker.vpip.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.poker.vpip.model.Stat;

public class StatRepository extends Repository<Stat> {

	@Override
	public Stat create(ResultSet set) throws SQLException {
		Stat stat = new Stat();
		stat.setPlayerID(set.getInt("playerID"));
		stat.setGameID(set.getInt("gameID"));
		stat.setNumPlayers(set.getInt("numPlayers"));
		stat.setHandsPlayed(set.getInt("handsPlayed"));
		stat.setNumWalks(set.getInt("numWalks"));
		stat.setVPIP(set.getInt("VPIP"));
		stat.setPFR(set.getInt("PFR"));
		stat.setCB(set.getInt("CB"));
		stat.setFCB(set.getInt("FCB"));
		stat.setWTSD(set.getInt("WTSD"));
		stat.setThreeBet(set.getInt("threeBets"));
		stat.setPostBets(set.getInt("postBets"));
		stat.setPostCalls(set.getInt("postCalls"));
		stat.setPostRaises(set.getInt("postRaises"));
		stat.setPostFolds(set.getInt("postFolds"));
		stat.setPostChecks(set.getInt("postChecks"));
		return stat;
	}

	@Override
	protected String updateQuery() {
		return "UPDATE VPIP.Stats SET "
				+ "handsPlayed=?, numWalks=?, VPIP=?, PFR=?, "
				+ "CB=?, FCB=?, WTSD=?, threeBets=?, postBets=?, "
				+ "postCalls=?, postRaises=?, postFolds=?, postChecks=? "
				+ "WHERE playerID=? AND gameID=? AND numPlayers=?";
	}

	@Override
	protected String insertQuery() {
		return "INSERT INTO VPIP.Stats (playerID, gameID, numPlayers, "
				+ "handsPlayed, numWalks, VPIP, PFR, "
				+ "CB, FCB, WTSD, threeBet, postBets, "
				+ "postCalls, postRaises, postFolds, postChecks) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}

	@Override
	protected String deleteQuery() {
		return "DELETE FROM VPIP.Stats WHERE playerID=? AND gameID=? AND numPlayers=?";
	}

	@Override
	protected String selectQuery() {
		return "SELECT * FROM VPIP.Stats";
	}

}
