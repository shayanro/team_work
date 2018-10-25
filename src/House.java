public class House extends Building {
	private int rooms;
	private int floors;

	public House(int floors, int rooms) {
		if (floors >=3 && floors <=6 && rooms<=4 && rooms>=1) {
			this.floors = floors;
			this.rooms = rooms;
			this.level = 1;
			this.population = this.rooms * this.floors;
			this.cost = addCost();
		}
		else {
			System.out.println("not possible");
		}
	}

	public int addCost() {
		return 700 + this.floors * 300 + this.floors * this.rooms * 100;
	}

	public int getRooms() {
		return this.rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public void upgrade(int addedUnit, int addedFloor) {
		if (floors >=3 && floors <=5 && rooms<=3 && rooms>=1) {
			this.rooms++;
			this.floors++;
			this.level++;
			this.population = this.rooms * this.floors;
			this.cost = upgradeCost(addedUnit, addedFloor);
		}
		else {
			System.out.println("not possible");
		}
	}

	public int upgradeCost(int addedUnit, int addedFloor) {
		return addedUnit * 50 + addedFloor * 300;
	}
}