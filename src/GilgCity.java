import java.util.*;

public class GilgCity {

    int initPoint = 0;
    int initWealth = 30000;

	private int point;
	private int population;
	private int attackPower;
	private int defensePower;
	private int unemployedPopulation;
	private int employedPopulation;
	private int wealth;
	private ArrayList<Block> blocks=new ArrayList<Block>();

	public void init(){
	    setPoint(initPoint);
	    setWealth(initWealth);

    }

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

	public int getAttackPower() {
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

	public int getEmployedPopulationn() {
		return employedPopulation;
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
	public void addBlock(Block block) {
		blocks.add(block);
		if(blocks.size() >= 2) {
			blocks.get(blocks.size() - 1).setBlockID(blocks.get(blocks.size() - 2).getBlockID() + 1);
		}
	}


	public void removeBlock(int blockID)
	{
		for(int i=0 ; i< blocks.size() ; i++)
		{
			if(blocks.get(i).getBlockID() == blockID)
			{
				blocks.remove(i);
			}
		}
	}
}