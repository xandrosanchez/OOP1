public class Hufflepuff extends hogwarts{

    private int industriousness;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int magic, int transgression_distance, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression_distance);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.industriousness = industriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    @Override
    public String toString() {
        return super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "\n ";
    }
}
