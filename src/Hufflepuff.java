public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int magic, int transgression_distance, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression_distance);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.industriousness = industriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    @Override
    public String toString() {
        return super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "\n ";
    }

    public void performanceComparisonFromHufflepuff(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("          industriousness");
        System.out.println("      " + ((Hufflepuff) hogwarts1).getIndustriousness() + "           " + ((Hufflepuff) hogwarts2).getIndustriousness());
        System.out.println("           loyalty");
        System.out.println("      " + ((Hufflepuff) hogwarts1).getLoyalty() + "           " + ((Hufflepuff) hogwarts2).getLoyalty());
        System.out.println("           honesty");
        System.out.println("      " + ((Hufflepuff) hogwarts1).getHonesty() + "           " + ((Hufflepuff) hogwarts2).getHonesty());
        int sum1 = ((Hufflepuff) hogwarts1).industriousness + ((Hufflepuff) hogwarts1).loyalty + ((Hufflepuff) hogwarts1).honesty;
        int sum2 = ((Hufflepuff) hogwarts2).industriousness + ((Hufflepuff) hogwarts2).loyalty + ((Hufflepuff) hogwarts2).honesty;
        System.out.println("            sum");
        System.out.println("      " + sum1 + "           " + sum2);
    }
}
