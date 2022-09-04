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

        performanceComparison(gryffindor1,gryffindor3);
        performanceComparison(ravenclaw1,hufflepuff2);
    }

    public static void performanceComparison(hogwarts hogwarts1, hogwarts hogwarts2){ //сделал одним методом для упрощения использования. но правильно ли так?
        System.out.println("\n" +
                "    student comparison...");
        System.out.println(hogwarts1.getName() + " and " + hogwarts2.getName());
        if (hogwarts1.getClass() != hogwarts2.getClass()){
            System.out.println("           magic");
            System.out.println("      " + hogwarts1.getMagic() + "            " + hogwarts2.getMagic());
            System.out.println("    transgression distance");
            System.out.println("      " + hogwarts1.getTransgression_distance() + "            " + hogwarts2.getTransgression_distance());
        } else if (hogwarts1.getClass() == Ravenclaw.class) {
            System.out.println("           mind");
            System.out.println("      " + ((Ravenclaw) hogwarts1).getMind() + "           " + ((Ravenclaw) hogwarts2).getMind());
            System.out.println("          widsom");
            System.out.println("      " + ((Ravenclaw) hogwarts1).getWisdom() + "           " + ((Ravenclaw) hogwarts2).getWisdom());
            System.out.println("         creation");
            System.out.println("      " + ((Ravenclaw) hogwarts1).getCreation() + "           " + ((Ravenclaw) hogwarts2).getCreation());
        } else if (hogwarts1.getClass() == Slytherin.class) {
            System.out.println("          cunning");
            System.out.println("      " + ((Slytherin) hogwarts1).getCunning() + "           " + ((Slytherin) hogwarts2).getCunning());
            System.out.println("       determination");
            System.out.println("      " + ((Slytherin) hogwarts1).getDetermination() + "           " + ((Slytherin) hogwarts2).getDetermination());
            System.out.println("          ambition");
            System.out.println("      " + ((Slytherin) hogwarts1).getAmbition() + "           " + ((Slytherin) hogwarts2).getAmbition());
            System.out.println("      resourcefulness");
            System.out.println("      " + ((Slytherin) hogwarts1).getResourcefulness() + "           " + ((Slytherin) hogwarts2).getResourcefulness());
            System.out.println("       lust for power");
            System.out.println("      " + ((Slytherin) hogwarts1).getLust_for_power() + "           " + ((Slytherin) hogwarts2).getLust_for_power());
        } else if (hogwarts1.getClass() == Gryffindor.class) {
            System.out.println("          nobility");
            System.out.println("      " + ((Gryffindor) hogwarts1).getNobility() + "           " + ((Gryffindor) hogwarts2).getNobility());
            System.out.println("           honour");
            System.out.println("      " + ((Gryffindor) hogwarts1).getHonour() + "           " + ((Gryffindor) hogwarts2).getHonour());
            System.out.println("           bravery");
            System.out.println("      " + ((Gryffindor) hogwarts1).getBravery() + "           " + ((Gryffindor) hogwarts2).getBravery());
        } else if (hogwarts1.getClass() == Hufflepuff.class) {
            System.out.println("          industriousness");
            System.out.println("      " + ((Hufflepuff) hogwarts1).getIndustriousness() + "           " + ((Hufflepuff) hogwarts2).getIndustriousness());
            System.out.println("           loyalty");
            System.out.println("      " + ((Hufflepuff) hogwarts1).getLoyalty() + "           " + ((Hufflepuff) hogwarts2).getLoyalty());
            System.out.println("           honesty");
            System.out.println("      " + ((Hufflepuff) hogwarts1).getHonesty() + "           " + ((Hufflepuff) hogwarts2).getHonesty());
        }
    }
}