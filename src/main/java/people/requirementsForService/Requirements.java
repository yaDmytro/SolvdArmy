package people.requirementsForService;

import java.util.Objects;

public abstract class Requirements {

    private int minAge;
    private int maxAge;
    private double minWeight;
    private double maxWeight;
    private double minHeight;
    private double maxHeight;
    private boolean highEducation;

    public Requirements(){}

    public Requirements(int minAge, int maxAge, double minWeight, double maxWeight, double minHeight, double maxHeight, boolean highEducation){

        this.minAge = minAge;
        this.maxAge = maxAge;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.highEducation = highEducation;

    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public boolean isHighEducation() {
        return highEducation;
    }

    public void setHighEducation(boolean highEducation) {
        this.highEducation = highEducation;
    }

    @Override
    public String toString() {
        return "Requirements for Armyfield" +
                "minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", minHeight=" + minHeight +
                ", maxHeight=" + maxHeight +
                ", highEducation=" + highEducation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Requirements)) return false;
        Requirements that = (Requirements) o;
        return getMinAge() == that.getMinAge() && getMaxAge() == that.getMaxAge() && Double.compare(that.getMinWeight(), getMinWeight()) == 0 && Double.compare(that.getMaxWeight(), getMaxWeight()) == 0 && Double.compare(that.getMinHeight(), getMinHeight()) == 0 && Double.compare(that.getMaxHeight(), getMaxHeight()) == 0 && isHighEducation() == that.isHighEducation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMinAge(), getMaxAge(), getMinWeight(), getMaxWeight(), getMinHeight(), getMaxHeight(), isHighEducation());
    }
}
