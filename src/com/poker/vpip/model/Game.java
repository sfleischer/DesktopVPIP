package com.poker.vpip.model;
import java.util.ArrayList;
import java.util.List;

public class Game implements DbEntity<Game>{
	final int gameID;
	final int gameType;
	final int buyin;
	final String name;
	
	public Game(int gameId, int gameType, int buyin, String name) {
		this.gameID = gameId;
		this.gameType = gameType;
		this.buyin = buyin;
		this.name = name;
	}

	@Override
	public List<DbWrapper> updateParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(gameType)); //type
		wrap.add(new DbWrapper(buyin));
		wrap.add(new DbWrapper(name));
		wrap.add(new DbWrapper(gameID));
		return wrap;
	}

	@Override
	public List<DbWrapper> insertParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(gameType)); //type
		wrap.add(new DbWrapper(buyin));
		wrap.add(new DbWrapper(name));
		return wrap;
	}

	@Override
	public List<DbWrapper> deleteParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(gameID));
		return wrap;
	}

}
