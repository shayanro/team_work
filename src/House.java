public class House extends Building {

    private int rooms;
    private int floors;

    public House(int floors, int rooms) {
        this.floors = floors;
        this.rooms = rooms;
    }

    public int addCost(){
        return 700 + this.floors*300 + this.rooms*100;
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

    public void upgrade() {
		this.rooms++;
		this.floors++;
    }

    public int upgradeCost(int addedUnit, int addedFloor){
        return addedUnit*50 + addedFloor*300;
    }


}