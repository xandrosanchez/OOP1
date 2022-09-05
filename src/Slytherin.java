public class Slytherin extends Hogwarts {

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

    public int getLustForPower() {
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

    public void performanceComparisonFromSlytherin(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("          cunning");
        System.out.println("      " + ((Slytherin) hogwarts1).getCunning() + "           " + ((Slytherin) hogwarts2).getCunning());
        System.out.println("       determination");
        System.out.println("      " + ((Slytherin) hogwarts1).getDetermination() + "           " + ((Slytherin) hogwarts2).getDetermination());
        System.out.println("          ambition");
        System.out.println("      " + ((Slytherin) hogwarts1).getAmbition() + "           " + ((Slytherin) hogwarts2).getAmbition());
        System.out.println("      resourcefulness");
        System.out.println("      " + ((Slytherin) hogwarts1).getResourcefulness() + "           " + ((Slytherin) hogwarts2).getResourcefulness());
        System.out.println("       lust for power");
        System.out.println("      " + ((Slytherin) hogwarts1).getLustForPower() + "           " + ((Slytherin) hogwarts2).getLustForPower());
        int sum1 = ((Slytherin) hogwarts1).cunning + ((Slytherin) hogwarts1).determination + ((Slytherin) hogwarts1).ambition + ((Slytherin) hogwarts1).resourcefulness + ((Slytherin) hogwarts1).lust_for_power;
        int sum2 = ((Slytherin) hogwarts2).cunning + ((Slytherin) hogwarts2).determination + ((Slytherin) hogwarts2).ambition + ((Slytherin) hogwarts2).resourcefulness + ((Slytherin) hogwarts2).lust_for_power;
        System.out.println("            sum");
        System.out.println("      " + sum1 + "          " + sum2);
    }
}
