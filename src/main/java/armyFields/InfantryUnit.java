package armyFields;

import people.Recruit;
import people.requirementsForService.Requirements;

import java.util.ArrayList;
import java.util.Objects;

public class InfantryUnit extends Requirements {

    static public ArrayList<Recruit> infantryNewRecruits = new ArrayList<>();
    private int infantryQty;
    private int antiTankSquad;
    private int antiDroneSquad;
    private int sniperUnit;
    private int infantryFightingVehicleQty;
    private int infantryMobilityVehicleQty;

    InfantryUnit(){}

    InfantryUnit(int infantryQty, int sniperUnit, int antiTankSquad, int antiDroneSquad, int infantryFightingVehicleQty, int infantryMobilityVehicleQty, SupportingUnits su){
        this.infantryQty = infantryQty;
        this.sniperUnit = sniperUnit;
        this.antiTankSquad = antiTankSquad;
        this.antiDroneSquad = antiDroneSquad;
        this.infantryFightingVehicleQty = infantryFightingVehicleQty;
        this.infantryMobilityVehicleQty = infantryMobilityVehicleQty;
    }

    public int getInfantryQty() {
        return infantryQty;
    }

    public void setInfantryQty(int infantryQty){
        this.infantryQty = infantryQty;
    }

    public int getSniperUnit(){
        return sniperUnit;
    }

    public void setSniperUnit(int sniperUnit){
        this.sniperUnit = sniperUnit;
    }

    public int getAntiTankSquad() {
        return antiTankSquad;
    }

    public void setAntiTankSquad(int antiTankSquad){
        this.antiTankSquad = antiTankSquad;
    }

    public int getAntiDroneSquad(){
        return antiDroneSquad;
    }

    public void setAntiDroneSquad(int antiDroneSquad){
        this.antiDroneSquad = antiDroneSquad;
    }

    public int getInfantryFightingVehicleQty(){
        return infantryFightingVehicleQty;
    }

    public void setInfantryFightingVehicleQty(int infantryFightingVehicleQty){
        this.infantryFightingVehicleQty = infantryFightingVehicleQty;
    }

    public int getInfantryMobilityVehicleQty(){
        return infantryMobilityVehicleQty;
    }

    public void setInfantryMobilityVehicleQty(int infantryMobilityVehicleQty){
        this.infantryMobilityVehicleQty = infantryMobilityVehicleQty;
    }

    @Override
    public String toString() {
        return "InfantryUnit consists :" +
                "infantryQty=" + infantryQty +
                ", antiTankSquad=" + antiTankSquad +
                ", antiDroneSquad=" + antiDroneSquad +
                ", sniperUnit=" + sniperUnit +
                ", infantryFightingVehicleQty=" + infantryFightingVehicleQty +
                ", infantryMobilityVehicleQty=" + infantryMobilityVehicleQty +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfantryUnit)) return false;
        InfantryUnit that = (InfantryUnit) o;
        return getInfantryQty() == that.getInfantryQty() && getAntiTankSquad() == that.getAntiTankSquad() && getAntiDroneSquad() == that.getAntiDroneSquad() && getSniperUnit() == that.getSniperUnit() && getInfantryFightingVehicleQty() == that.getInfantryFightingVehicleQty() && getInfantryMobilityVehicleQty() == that.getInfantryMobilityVehicleQty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInfantryQty(), getAntiTankSquad(), getAntiDroneSquad(), getSniperUnit(), getInfantryFightingVehicleQty(), getInfantryMobilityVehicleQty());
    }
}
