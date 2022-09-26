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

    public void performanceComparisonFromHufflepuff(Hufflepuff hufflepuff1,Hufflepuff hufflepuff2){
        if (hufflepuff1.honesty > hufflepuff2.honesty) {
            System.out.println(hufflepuff1.getName() + " more honesty than " + hufflepuff2.getName());
        } else{
            System.out.println(hufflepuff2.getName() + " more honesty than " + hufflepuff1.getName());
        }
        if (hufflepuff1.loyalty > hufflepuff2.loyalty) {
            System.out.println(hufflepuff1.getName() + " more loyalty than " + hufflepuff2.getName());
        } else{
            System.out.println(hufflepuff2.getName() + " more loyalty than " + hufflepuff1.getName());
        }
        if (hufflepuff1.industriousness > hufflepuff2.industriousness) {
            System.out.println(hufflepuff1.getName() + " more industriousness than " + hufflepuff2.getName());
        } else{
            System.out.println(hufflepuff2.getName() + " more industriousness than " + hufflepuff1.getName());
        }
        System.out.println();
    }

}
