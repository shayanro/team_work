public class Person {

	private boolean isEmployed;
	private int record;
	private int initRecord = 0;

	public void init(){
	    setRecord(initRecord);
    }

	public boolean getIsEmployed() {
		return isEmployed;
	}

	/**
	 * 
	 * @param isEmployed
	 */
	public void setIsEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	public int getRecord() {
		return record;
	}

	/**
	 * 
	 * @param record
	 */
	public void setRecord(int record) {
		this.record = record;
	}

    public void increaseRecord(boolean increase) {
        if (increase){
            record++;
        }
    }

    public void clearRecord(boolean clear) {
        if (clear){
            record = 0;
        }
    }

}