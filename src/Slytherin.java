public class Slytherin extends hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust_for_power;

    public Slytherin(String name, int magic, int transgression_distance, int cunning, int determination, int ambition, int resourcefulness, int lust_for_power) {
        super(name, magic, transgression_distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust_for_power = lust_for_power;
    }

    public int getLust_for_power() {
        return lust_for_power;
    }

    public void setLust_for_power(int lust_for_power) {
        this.lust_for_power = lust_for_power;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lust_for_power=" + lust_for_power +
                "\n ";
    }
}
