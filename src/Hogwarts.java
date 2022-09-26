public class Hogwarts {

    private String name;
    private int magic;
    private int transgressionDistance;

    public Hogwarts(String name, int magic, int transgression_distance) {
        this.name = name;
        this.transgressionDistance = transgression_distance;
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression_distance=" + transgressionDistance + ", ";
    }

    public void performanceComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.magic > hogwarts2.magic) {
            System.out.println(hogwarts1.name + " has more powerful magic than " + hogwarts2.name);
        } else {
            System.out.println(hogwarts2.name + " has more powerful magic than " + hogwarts1.name);
        }
        if (hogwarts1.transgressionDistance > hogwarts2.transgressionDistance){
            System.out.println(hogwarts1.name + " has a long range than" + hogwarts2.name);
        } else {
            System.out.println(hogwarts2.name + " has a long range than " + hogwarts1.name);
        }
        System.out.println();
    }
}
