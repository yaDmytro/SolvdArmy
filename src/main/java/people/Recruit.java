package people;

import java.util.Objects;

public class Recruit extends Person{

    Person p;

    private ArmyFields preferredField;

    public Recruit(){}

    public Recruit(String firstName, String lastName, int age, Sex sexType, double weight, double height, boolean highEducation, ArmyFields preferredField){
        super(firstName, lastName, age, sexType, weight, height, highEducation);
        this.preferredField = preferredField;
    }

    public ArmyFields getPreferredField() {
        return preferredField;
    }

    public void setPreferredField(ArmyFields preferredField) {
        this.preferredField = preferredField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recruit)) return false;
        if (!super.equals(o)) return false;
        Recruit recruit = (Recruit) o;
        return getPreferredField() == recruit.getPreferredField();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPreferredField());
    }
    /*
    @Override
    public String toString() {
        return "Recruit{ " + "NAME: "+ p.getFirstName() + " " + p.getLastName() + "; " + "age = " + p.getAge() + ";" + " sex = " + p.getSexType() + ";"
                + " height = " + p.getHeight() + ";" + " weight = " + p.getWeight() + ";" + " preferredField = " + preferredField + "; " + '}';
    }

     */
}
