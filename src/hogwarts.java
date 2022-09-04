import java.util.Objects;

public class hogwarts {

    private String name;
    private int magic;
    private int transgression_distance;

    public hogwarts(String name, int magic, int transgression_distance) {
        this.name = name;
        this.transgression_distance = transgression_distance;
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression_distance() {
        return transgression_distance;
    }

    public void setTransgression_distance(int transgression_distance) {
        this.transgression_distance = transgression_distance;
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
                ", transgression_distance=" + transgression_distance + ", ";
    }
}
