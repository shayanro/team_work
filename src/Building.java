public class Building {
    protected String type;
    protected int buildingID;
    protected int population;
    protected int level;
    protected int cost;
    protected Person[] persons = new Person[1];

    public Building() {
    }

    public void addPerson(Person person) {
        Person[] newPersons = new Person[this.persons.length + 1];
        for (int i = 0; i < this.persons.length; i++) {
            newPersons[i] = this.persons[i];
        }
        newPersons[newPersons.length - 1] = person;
    }

//	public void removePerson(Person person){
//		for (int i = 0 ; i<this.persons.length ; i++){
//			if ()
//		}
//	}

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBuildingID() {
        return this.buildingID;
    }

    public void setBuildingID(int buildingID) {
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