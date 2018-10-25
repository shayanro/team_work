public class Defense extends Building {

	private int power;

	public Defense(){
		this.power = 30;
		this.cost = 10000;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	@Override
	public void upgrade() {
		if (this.level <= 4 && this.level > 1) {
			this.power += 0;
			this.cost += 5000;
		}
		else {
			System.out.println("not possible");
		}
	}

}