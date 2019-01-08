package com.poker.vpip.model;
import java.util.List;

public interface DbEntity<T> {
	
	public List<DbWrapper> updateParameters();
	
	public List<DbWrapper> insertParameters();
	
	public List<DbWrapper> deleteParameters();
}
