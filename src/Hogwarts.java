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

    public void performanceComparisonFromHogwarts(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("           magic");
        System.out.println("      " + hogwarts1.getMagic() + "            " + hogwarts2.getMagic());
        System.out.println("    transgression distance");
        System.out.println("      " + hogwarts1.getTransgressionDistance() + "            " + hogwarts2.getTransgressionDistance());
        int sum1 = hogwarts1.getMagic() + hogwarts1.getTransgressionDistance();
        int sum2 = hogwarts2.getMagic() + hogwarts2.getTransgressionDistance();
        System.out.println("            sum");
        System.out.println("      " + sum1 + "           " + sum2);
    }
}
