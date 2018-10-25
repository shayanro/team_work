public class Attack extends Building {

	private int power;


	public Attack(){
		this.power = 100;
		this.cost = 15000;
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
			this.power += 10;
			this.cost += 20000;
		}
		else {
			System.out.println("not possible");
		}
	}
}