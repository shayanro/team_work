import java.util.ArrayList;

public class Block {

	private int point;
	private int population;
	private int attackPower;
	private int defensePower;
	private int unemployedPopulation;
	private int employedPopulation;
	private int wealth;
	private int blockID;
	private int lastBlock;
	private boolean isDefeding;
	private ArrayList<Building> buildings = new ArrayList<Building>();
	private int lastBuliding;

	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getAttackPower()
	{
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getDefensePower() {
		return defensePower;
	}


	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}

	public int getUnemployedPopulation() {
		return unemployedPopulation;
	}


	public void setUnemployedPopulation(int unemployedPopulation) {
		this.unemployedPopulation = unemployedPopulation;
	}

	public int getEmployedPopulation() {
	return 	employedPopulation;
	}


	public void setEmployedPopulation(int employedPopulation) {
		this.employedPopulation = employedPopulation;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}

	public int getBlockID() {
		return blockID;
	}


	public void setBlockID(int blockID) {
		this.blockID = blockID;
	}

	public Boolean getIsDefeding() {
		return isDefeding;
	}


	public void setIsDefeding(Boolean isDefeding) {
		this.isDefeding = isDefeding;
	}


	public void addBuilding(Building building) {
		buildings.add(building);
		if(buildings.size() >= 2) {
			buildings.get(buildings.size() - 1).setBuildingID(buildings.get(buildings.size() - 2).getBuildingID() + 1);
		}
	}


	public void removeBuilding(int buildingID)
	{
      for(int i=0 ; i< buildings.size() ; i++)
	  {
//	  	if(buildings.get(i).getBuildingID() == buildingID)
//		{
//			buildings.remove(i);
//		}
	  }
	}

}