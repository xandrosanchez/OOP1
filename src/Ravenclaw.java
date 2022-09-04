public class Ravenclaw extends hogwarts{

    private int mind;
    private int wisdom;
    private int creation;

    public Ravenclaw(String name, int magic, int transgression_distance, int mind, int wisdom, int creation) {
        super(name, magic, transgression_distance);
        this.mind = mind;
        this.creation = creation;
        this.wisdom = wisdom;
    }

    public int getMind() {
        return mind;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creation=" + creation +
                "\n";
    }
}
