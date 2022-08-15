package armyFields;

import people.Recruit;

import java.util.ArrayList;
import java.util.Objects;

public class PanzerBattalion {

    static public ArrayList<Recruit> panzerNewRecruits = new ArrayList<>();
    SupportingUnits su;
    private int tankCount;
    private String model;

    PanzerBattalion(){}

    PanzerBattalion(int tankCount, String model, SupportingUnits su){
        this.tankCount = tankCount;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getTankCount() {

        return tankCount;
    }

    public void setTankCount(int tankCount) {

        this.tankCount = tankCount;
    }

    @Override
    public String toString() {
        return "PanzerBattalion :" +
                "su=" + su +
                ", tankCount=" + tankCount +
                ", model='" + model + '\'' +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PanzerBattalion)) return false;
        PanzerBattalion that = (PanzerBattalion) o;
        return getTankCount() == that.getTankCount() && Objects.equals(su, that.su) && Objects.equals(getModel(), that.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(su, getTankCount(), getModel());
    }
}
