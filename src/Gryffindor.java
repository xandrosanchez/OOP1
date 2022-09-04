public class Gryffindor extends hogwarts{

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
}
