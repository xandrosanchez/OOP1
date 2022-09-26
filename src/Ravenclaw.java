public class Ravenclaw extends Hogwarts {

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

    public void performanceComparisonFromRaveclaw(Ravenclaw ravenclaw1,Ravenclaw ravenclaw2){
        if (ravenclaw1.mind > ravenclaw2.mind) {
            System.out.println(ravenclaw1.getName() + " more mind than " + ravenclaw2.getName());
        } else{
            System.out.println(ravenclaw2.getName() + " more mind than " + ravenclaw1.getName());
        }
        if (ravenclaw1.wisdom > ravenclaw2.wisdom) {
            System.out.println(ravenclaw1.getName() + " more wisdom than " + ravenclaw2.getName());
        } else{
            System.out.println(ravenclaw2.getName() + " more wisdom than " + ravenclaw1.getName());
        }
        if (ravenclaw1.creation > ravenclaw2.creation) {
            System.out.println(ravenclaw1.getName() + " more creation than " + ravenclaw2.getName());
        } else{
            System.out.println(ravenclaw2.getName() + " more creation than " + ravenclaw1.getName());
        }
        System.out.println();
    }

}
