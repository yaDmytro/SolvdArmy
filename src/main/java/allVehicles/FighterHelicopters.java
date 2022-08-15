package allVehicles;

import java.util.Objects;

public class FighterHelicopters extends Vehicle {

    private String name;
    private boolean isWorking;
    private int machineGunQty;
    private boolean antiTankLauncher;
    private boolean antiAircraftLauncher;

    public FighterHelicopters(){}

    public FighterHelicopters(String name, int crewQty, boolean armor, int machineGunQty, boolean antiTankLauncher, boolean antiAircraftLauncher, boolean isWorking){
        super(crewQty, armor);
        this.name = name;
        this.machineGunQty = machineGunQty;
        this.antiTankLauncher = antiTankLauncher;
        this.antiAircraftLauncher = antiAircraftLauncher;
        this.isWorking = isWorking;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getMachineGunQty() {
        return machineGunQty;
    }

    public void setMachineGunQty(int machineGunQty) {
        this.machineGunQty = machineGunQty;
    }

    public boolean isAntiTankLauncher() {
        return antiTankLauncher;
    }

    public void setAntiTankLauncher(boolean antiTankLauncher) {
        this.antiTankLauncher = antiTankLauncher;
    }

    public boolean isAntiAircraftLauncher() {
        return antiAircraftLauncher;
    }

    public void setAntiAircraftLauncher(boolean antiAircraftLauncher) {
        this.antiAircraftLauncher = antiAircraftLauncher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FighterHelicopters)) return false;
        if (!super.equals(o)) return false;
        FighterHelicopters that = (FighterHelicopters) o;
        return isWorking() == that.isWorking() && getMachineGunQty() == that.getMachineGunQty() && isAntiTankLauncher() == that.isAntiTankLauncher() && isAntiAircraftLauncher() == that.isAntiAircraftLauncher() && Objects.equals(getName(), that.getName());
    }

    @Override
    public String toString() {
        return "FighterHelicopters{" +
                "name='" + name + '\'' +
                ", isWorking=" + isWorking +
                ", machineGunQty=" + machineGunQty +
                ", antiTankLauncher=" + antiTankLauncher +
                ", antiAircraftLauncher=" + antiAircraftLauncher +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), isWorking(), getMachineGunQty(), isAntiTankLauncher(), isAntiAircraftLauncher());
    }
}
