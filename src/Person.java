public class Person {

    private boolean isEmployed;
    private int record;
    private int initRecord = 0;

    public Person(boolean flag) {
        this.isEmployed = flag;
    }

    public boolean getIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }


    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }



    public void nextDay(){
        if (isEmployed)
            this.record++;
    }
    public void clearRecord(boolean clear) {
        if (clear) {
            record = 0;
        }
    }

}