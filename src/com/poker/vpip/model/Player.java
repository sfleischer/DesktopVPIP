package com.poker.vpip.model;
import java.util.ArrayList;
import java.util.List;

public class Player implements DbEntity<Player> {

	int playerID;
	String name;
	
	public Player(int playerID, String name) {
		this.playerID = playerID;
		this.name = name;
	}
	
	@Override
	public List<DbWrapper> updateParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(name));
		wrap.add(new DbWrapper(playerID));
		return wrap;
	}
	@Override
	public List<DbWrapper> insertParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(name));
		return wrap;
	}
	@Override
	public List<DbWrapper> deleteParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(playerID));
		return wrap;
	}

}
