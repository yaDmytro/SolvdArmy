package people;

import java.util.Objects;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Sex sexType;
    private double weight;
    private double height;
    private boolean highEducation;

    public Person(){}

    public Person(String firstName, String lastName, int age, Sex sexType, double weight, double height, boolean highEducation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sexType = sexType;
        this.weight = weight;
        this.height = height;
        this.highEducation = highEducation;

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Sex getSexType(){
        return sexType;
    }

    public void setSexType(Sex sexType){
        this.sexType = sexType;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public boolean getHighEducation(){
        return highEducation;
    }

    public void setHighEducation(boolean highEducation){
        this.highEducation = highEducation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Double.compare(person.getWeight(), getWeight()) == 0 && Double.compare(person.getHeight(), getHeight()) == 0 && getHighEducation() == person.getHighEducation() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && getSexType() == person.getSexType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getSexType(), getWeight(), getHeight(), getHighEducation());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sexType=" + sexType +
                ", weight=" + weight +
                ", height=" + height +
                ", highEducation=" + highEducation +
                '}';
    }
}
