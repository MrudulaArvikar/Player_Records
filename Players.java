package players.com.mrudula;

import java.util.Objects;

public class Players {
	private String name;
	private int runs;
	public Players() {
		super(); 
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, runs);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Players)) {
			return false;
		}
		Players other = (Players) obj;
		return Objects.equals(name, other.name) && runs == other.runs;
	}
	@Override
	public String toString() {
		return "Players [name=" + name + ", runs=" + runs + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public Players(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	
	
}
