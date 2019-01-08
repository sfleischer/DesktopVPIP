package com.poker.vpip.model;

public class DbWrapper {
	String str;
	int integer;
	boolean isString;
	
	public DbWrapper(String s) {
		str = s;
		isString = true;
	}
	
	public DbWrapper(int i) {
		integer = i;
		isString = false;
	}
	
	public String getString() {
		return str;
	}
	
	public int getInteger() {
		return integer;
	}
	
	public boolean isString() {
		return isString;
	}
}
