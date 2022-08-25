package allVehicles;

import java.util.Objects;

public abstract class Vehicle {

    private int crewQty;
    private boolean armor;
    private boolean isWorking;

    public Vehicle(){
        crewQty = 0;
        armor = false;
        isWorking = true;

    }

    public Vehicle(boolean armor){
        this.armor = armor;
    }

    public Vehicle(int crewQty, boolean armor){
        this.crewQty = crewQty;
        this.armor = armor;
    }
    public Vehicle(int crewQty, boolean armor, boolean isWorking){
        this.crewQty = crewQty;
        this.armor = armor;
        this.isWorking = isWorking;
    }

    public int getCrewQty(){
        return crewQty;
    }

    public void setCrewQty(int crewQty){
        this.crewQty = crewQty;
    }

    public boolean getArmor(){
        return armor;
    }

    public void setArmor(boolean armor){
        this.armor = armor;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getCrewQty() == vehicle.getCrewQty() && getArmor() == vehicle.getArmor() && isWorking() == vehicle.isWorking();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCrewQty(), getArmor(), isWorking());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "crewQty=" + crewQty +
                ", armor=" + armor +
                ", isWorking=" + isWorking +
                '}';
    }
}
