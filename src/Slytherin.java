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

    public void performanceComparisonFromSlytherin(Slytherin slytherin1,Slytherin slytherin2){
        if (slytherin1.lust_for_power > slytherin2.lust_for_power) {
            System.out.println(slytherin1.getName() + " more power than " + slytherin2.getName());
        } else{
            System.out.println(slytherin2.getName() + " more power than " + slytherin1.getName());
        }
        if (slytherin1.resourcefulness > slytherin2.resourcefulness) {
            System.out.println(slytherin1.getName() + " more resourcefulness than " + slytherin2.getName());
        } else{
            System.out.println(slytherin2.getName() + " more resourcefulness than " + slytherin1.getName());
        }
        if (slytherin1.ambition > slytherin2.ambition) {
            System.out.println(slytherin1.getName() + " more ambition than " + slytherin2.getName());
        } else{
            System.out.println(slytherin2.getName() + " more ambition than " + slytherin1.getName());
        }
        if (slytherin1.determination > slytherin2.determination) {
            System.out.println(slytherin1.getName() + " more determination than " + slytherin2.getName());
        } else{
            System.out.println(slytherin2.getName() + " more determination than " + slytherin1.getName());
        }
        if (slytherin1.cunning > slytherin2.cunning) {
            System.out.println(slytherin1.getName() + " more cunning than " + slytherin2.getName());
        } else{
            System.out.println(slytherin2.getName() + " more cunning than " + slytherin1.getName());
        }
        System.out.println();
    }


}
