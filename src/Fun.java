public class Fun extends Building {
	// private ArrayList Person;
//    private int cap;
	private double pointPerPerson;

	public Fun() {
		this.population = 50;
		for (int i=0 ; i<this.population ; i++){
			addPerson(new Person(true));
		}
		this.cost = 6000;
		this.level = 1;
		pointPerPerson = 1.2;
	}

//    public int getCapacity() {
//        return this.population;
//    }
//
//    public void setCapacity(int population) {
//        this.population = population;
//    }

	@Override
	public void upgrade() {
		if (this.level == 1 || this.level == 2) {
			this.population += 70;
			this.cost = (this.level + 1) * 5000;
			this.level++;
			pointPerPerson += 0.2;
		} else {
			System.out.println("not possible");
		}
	}
}