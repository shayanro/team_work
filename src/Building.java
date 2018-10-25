import java.util.concurrent.Callable;

public class Building {

	protected String type;
	protected String buildingID;
	protected int population;
	protected int level;
	protected int cost;

	public Building(){

	}

	public void setCost(int cost){
		this.cost=cost;
	}

	public int getCost(){
		return this.cost;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type=type;
	}

	public String getBuildingID() {
		return this.buildingID;
	}

	public void setBuildingID(String buildingID) {
		this.buildingID = buildingID;
	}

	public int getPopulation() {
		return this.population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}

	public void upgrade() {

	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}


}