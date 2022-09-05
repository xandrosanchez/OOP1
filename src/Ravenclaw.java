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

    public void performanceComparisonFromRavenclaw(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("           mind");
        System.out.println("      " + ((Ravenclaw) hogwarts1).getMind() + "           " + ((Ravenclaw) hogwarts2).getMind());
        System.out.println("          widsom");
        System.out.println("      " + ((Ravenclaw) hogwarts1).getWisdom() + "           " + ((Ravenclaw) hogwarts2).getWisdom());
        System.out.println("         creation");
        System.out.println("      " + ((Ravenclaw) hogwarts1).getCreation() + "           " + ((Ravenclaw) hogwarts2).getCreation());
        int sum1 = ((Ravenclaw) hogwarts1).getMind() + ((Ravenclaw) hogwarts1).wisdom + ((Ravenclaw) hogwarts1).creation;
        int sum2 = ((Ravenclaw) hogwarts2).getMind() + ((Ravenclaw) hogwarts2).wisdom + ((Ravenclaw) hogwarts2).creation;
        System.out.println("            sum");
        System.out.println("      " + sum1 + "           " + sum2);
    }
}
