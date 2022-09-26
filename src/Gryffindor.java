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

    public void performanceComparisonFromGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1.honour > gryffindor2.honour) {
            System.out.println(gryffindor1.getName() + " more honour than " + gryffindor2.getName());
        } else{
            System.out.println(gryffindor2.getName() + " more honour than " + gryffindor1.getName());
        }
        if (gryffindor1.nobility > gryffindor2.nobility) {
            System.out.println(gryffindor1.getName() + " more nobility than " + gryffindor2.getName());
        } else{
            System.out.println(gryffindor2.getName() + " more nobility than " + gryffindor1.getName());
        }
        if (gryffindor1.bravery > gryffindor2.bravery) {
            System.out.println(gryffindor1.getName() + " more bravery than " + gryffindor2.getName());
        } else{
            System.out.println(gryffindor2.getName() + " more bravery than " + gryffindor1.getName());
        }
        System.out.println();
    }


}
