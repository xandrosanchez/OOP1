public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindor1 = new Gryffindor("Harry Potter",78,45,24,89,100);
        Gryffindor gryffindor2 = new Gryffindor("Hermione Granger",98,64,35,15,80);
        Gryffindor gryffindor3 = new Gryffindor("Ron Weasley",50,49,39,98,56);
        Slytherin slytherin1 = new Slytherin("Draco Malfoy",87,36,27,18,99,100,78);
        Slytherin slytherin2 = new Slytherin("Graham Montagu",79,37,74,69,18,99,58);
        Slytherin slytherin3 = new Slytherin("Gregory Goyle",49,69,19,100,65,44,71);
        Ravenclaw ravenclaw1 = new Ravenclaw("Zhou Chang",91,59,39,86,72);
        Ravenclaw ravenclaw2 = new Ravenclaw("Padma Patil", 100,28,49,57,25);
        Ravenclaw ravenclaw3 = new Ravenclaw("Marcus Belby",69,27,49,44,79);
        Hufflepuff hufflepuff1 = new Hufflepuff("Zacharias Smith",29,17,99,75,84);
        Hufflepuff hufflepuff2 = new Hufflepuff("Cedric Diggory",85,37,37,88,39);
        Hufflepuff hufflepuff3 = new Hufflepuff("Justin Finch-Fletchley", 28,51,63,100,62);

        System.out.println(ravenclaw1);
        System.out.println(gryffindor1);
        System.out.println(slytherin2);
        System.out.println(hufflepuff3);
        performanceComparison(slytherin1,slytherin3);
        performanceComparison(gryffindor1,ravenclaw2);
    }

    public static void performanceComparison(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("\n" +
                "    student comparison...");
        System.out.println(hogwarts1.getName() + " and " + hogwarts2.getName());
        if (hogwarts1.getClass() != hogwarts2.getClass()){
            hogwarts1.performanceComparisonFromHogwarts(hogwarts1,hogwarts2);
        } else if (hogwarts1.getClass() == Ravenclaw.class) {
            ((Ravenclaw) hogwarts1).performanceComparisonFromRavenclaw(hogwarts1,hogwarts2);
        } else if (hogwarts1.getClass() == Slytherin.class) {
            ((Slytherin) hogwarts1).performanceComparisonFromSlytherin(hogwarts1,hogwarts2);
        } else if (hogwarts1.getClass() == Gryffindor.class) {
            ((Gryffindor) hogwarts1).performanceComparisonFromGryffindor(hogwarts1,hogwarts2);
        } else if (hogwarts1.getClass() == Hufflepuff.class) {
            ((Hufflepuff) hogwarts1).performanceComparisonFromHufflepuff(hogwarts1,hogwarts2);
        }
    }
}