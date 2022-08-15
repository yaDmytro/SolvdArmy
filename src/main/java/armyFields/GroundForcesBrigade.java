package armyFields;

import java.util.Objects;

public class GroundForcesBrigade {

    private int brigade_ID;
    private String brigade_name;
    PanzerBattalion pz;
    PanzerBattalion pz_1;
    Artillery a;
    InfantryUnit i1;
    InfantryUnit i2;

    GroundForcesBrigade(){}

    GroundForcesBrigade(int brigade_ID, String brigade_name, PanzerBattalion pz, PanzerBattalion pz_1, Artillery a, InfantryUnit i1, InfantryUnit i2){
        this.brigade_ID = brigade_ID;
        this.brigade_name = brigade_name;
    }

    public void setBrigade_ID(int brigade_ID){
        this.brigade_ID = brigade_ID;
    }

    public int getBrigade_ID(){
        return brigade_ID;
    }

    public void setBrigade_name(String brigade_name){
        this.brigade_name = brigade_name;
    }

    public String getBrigade_name(){
        return brigade_name;
    }

    @Override
    public String toString() {
        return "GroundForcesBrigade : " +
                "brigade_ID=" + brigade_ID +
                ", brigade_name='" + brigade_name + '\'' +
                ", pz=" + pz +
                ", pz_1=" + pz_1 +
                ", a=" + a +
                ", i1=" + i1 +
                ", i2=" + i2 + ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroundForcesBrigade)) return false;
        GroundForcesBrigade that = (GroundForcesBrigade) o;
        return getBrigade_ID() == that.getBrigade_ID() && Objects.equals(getBrigade_name(), that.getBrigade_name()) && Objects.equals(pz, that.pz) && Objects.equals(pz_1, that.pz_1) && Objects.equals(a, that.a) && Objects.equals(i1, that.i1) && Objects.equals(i2, that.i2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrigade_ID(), getBrigade_name(), pz, pz_1, a, i1, i2);
    }
}
