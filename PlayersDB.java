package players.com.mrudula;

import java.util.ArrayList;

public class PlayersDB {
	private ArrayList<Players> playerList;
	int n;
	public PlayersDB() {
		super();
		
		playerList = new ArrayList<Players>();		
		n=0;
	}
	boolean add(Players p) {
		playerList.add(p);
		n++;
		return true;
	}
	void remove(Players p) {
		int i=0;
		if(i>=0 && i<playerList.size()) {
			playerList.remove(i);
			n--;
		}
	}
	
	boolean edit(String targetName, String newName, int newRuns) {
	    for (Players player : playerList) {
	        if (player.getName().equalsIgnoreCase(targetName)) {
	            player.setName(newName);
	            player.setRuns(newRuns);
	            return true;
	        }
	    }
	    return false; // Player with the given name not found
	}

	Players findByName(String target) {
		for(int i=0;i<n;i++) {
			Players p=playerList.get(i);
			String name=p.getName();
			if(name.equalsIgnoreCase(target)) {
				return p;
			}
		}
		return null;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    for (Players player : playerList) {
	        sb.append(player).append("\n");
	    }
	    return sb.toString();
	}

	
	
	
	
}
