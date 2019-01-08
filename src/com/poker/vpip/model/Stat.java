package com.poker.vpip.model;
import java.util.ArrayList;
import java.util.List;

public class Stat implements DbEntity<Stat>{
	
	int playerID, gameID, numPlayers, handsPlayed, numWalks, VPIP, PFR, 
		CB, FCB, WTSD, threeBet, postBets, postCalls, postRaises, postFolds, postChecks;
	
	/* -----------------------------------------------------
	 * ---------------------- GETTERS ----------------------
	 * -----------------------------------------------------
	 */
	
	public void setPlayerID(int p) {
		playerID = p;
	}
	
	public void setGameID(int g) {
		gameID = g;
	}
	
	public void setNumPlayers(int n) {
		numPlayers = n;
	}
	
	public void setHandsPlayed(int h) {
		handsPlayed = h;
	}
	
	public void setNumWalks(int w) {
		numWalks = w;
	}
	
	public void setVPIP(int v) {
		VPIP = v;
	}
	
	public void setPFR(int p) {
		PFR = p;
	}
	
	public void setCB(int c) {
		CB = c;
	}
	
	public void setFCB(int f) {
		FCB = f;
	}
	
	public void setWTSD(int w) {
		WTSD = w;
	}
	
	public void setThreeBet(int t) {
		threeBet = t;
	}
	
	public void setPostBets(int b) {
		postBets = b;
	}
	
	public void setPostCalls(int b) {
		postCalls = b;
	}
	
	public void setPostRaises(int b) {
		postRaises = b;
	}
	
	public void setPostFolds(int b) {
		postFolds = b;
	}
	
	public void setPostChecks(int b) {
		postChecks = b;
	}
	
	
	/* -----------------------------------------------------
	 * ---------------------- GETTERS ----------------------
	 * -----------------------------------------------------
	 */
	
	public int getPlayerID() {
		return playerID;
	}
	
	public int getGameID() {
		return gameID;
	}
	
	public int getNumPlayers() {
		return numPlayers;
	}
	
	public int getHandsPlayed() {
		return handsPlayed ;
	}
	
	public int getNumWalks() {
		return numWalks;
	}
	
	public int getVPIP() {
		return VPIP;
	}
	
	public int getPFR() {
		return PFR;
	}
	
	public int getCB() {
		return CB;
	}
	
	public int getFCB() {
		return FCB;
	}
	
	public int getWTSD() {
		return WTSD;
	}
	
	public int getThreeBet() {
		return threeBet;
	}
	
	public int getPostBets() {
		return postBets;
	}
	
	public int getPostCalls() {
		return postCalls;
	}
	
	public int getPostRaises() {
		return postRaises;
	}
	
	public int getPostFolds() {
		return postFolds;
	}
	
	public int getPostChecks() {
		return postChecks;
	}
	
	@Override
	public List<DbWrapper> updateParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(handsPlayed));
		wrap.add(new DbWrapper(numWalks));
		wrap.add(new DbWrapper(VPIP));
		wrap.add(new DbWrapper(PFR));
		wrap.add(new DbWrapper(CB));
		wrap.add(new DbWrapper(FCB));
		wrap.add(new DbWrapper(WTSD));
		wrap.add(new DbWrapper(threeBet));
		wrap.add(new DbWrapper(postBets));
		wrap.add(new DbWrapper(postCalls));
		wrap.add(new DbWrapper(postRaises));
		wrap.add(new DbWrapper(postFolds));
		wrap.add(new DbWrapper(postChecks));
		wrap.add(new DbWrapper(playerID));
		wrap.add(new DbWrapper(gameID));
		wrap.add(new DbWrapper(numPlayers));
		return wrap;
	}
	

	@Override
	public List<DbWrapper> insertParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(playerID));
		wrap.add(new DbWrapper(gameID));
		wrap.add(new DbWrapper(numPlayers));
		wrap.add(new DbWrapper(handsPlayed));
		wrap.add(new DbWrapper(numWalks));
		wrap.add(new DbWrapper(VPIP));
		wrap.add(new DbWrapper(PFR));
		wrap.add(new DbWrapper(CB));
		wrap.add(new DbWrapper(FCB));
		wrap.add(new DbWrapper(WTSD));
		wrap.add(new DbWrapper(threeBet));
		wrap.add(new DbWrapper(postBets));
		wrap.add(new DbWrapper(postCalls));
		wrap.add(new DbWrapper(postRaises));
		wrap.add(new DbWrapper(postFolds));
		wrap.add(new DbWrapper(postChecks));
		return wrap;
	}

	@Override
	public List<DbWrapper> deleteParameters() {
		ArrayList<DbWrapper> wrap = new ArrayList<DbWrapper>();
		wrap.add(new DbWrapper(playerID));
		wrap.add(new DbWrapper(gameID));
		wrap.add(new DbWrapper(numPlayers));
		return wrap;
	}

}
