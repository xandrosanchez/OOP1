public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression_distance, int nobility, int honour, int bravery) {
        super(name, magic, transgression_distance);
        this.bravery = bravery;
        this.honour = honour;
        this.nobility = nobility;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                "\n";
    }

    public void performanceComparisonFromGryffindor(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("          nobility");
        System.out.println("      " + ((Gryffindor) hogwarts1).getNobility() + "           " + ((Gryffindor) hogwarts2).getNobility());
        System.out.println("           honour");
        System.out.println("      " + ((Gryffindor) hogwarts1).getHonour() + "           " + ((Gryffindor) hogwarts2).getHonour());
        System.out.println("           bravery");
        System.out.println("      " + ((Gryffindor) hogwarts1).getBravery() + "           " + ((Gryffindor) hogwarts2).getBravery());
        int sum1 = ((Gryffindor) hogwarts1).nobility + ((Gryffindor) hogwarts1).honour + ((Gryffindor) hogwarts1).bravery;
        int sum2 = ((Gryffindor) hogwarts2).nobility + ((Gryffindor) hogwarts2).honour + ((Gryffindor) hogwarts2).bravery;
        System.out.println("            sum");
        System.out.println("      " + sum1 + "          " + sum2);
    }
}
