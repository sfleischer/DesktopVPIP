package com.poker.vpip.model;
import java.util.ArrayList;
import java.util.List;

public class GameType implements DbEntity<GameType>{
	int typeID;
	String name;
	
	public GameType(int typeID, String name) {
		this.typeID = typeID;
		this.name = name;
	}
	
	@Override
	public List<DbWrapper> updateParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(name));
		wrap.add(new DbWrapper(typeID));
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
		wrap.add(new DbWrapper(typeID));
		return wrap;
	}
	
	
}
