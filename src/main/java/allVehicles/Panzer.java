package allVehicles;

import java.util.Objects;

public class Panzer extends Vehicle{

    private String name;
    private boolean isWorking;
    private int cannonCaliber;
    private boolean antiRocketLauncher;
    private boolean airDefenceCapabilities;

    public Panzer(){}

    public Panzer(String name, int crewQty, boolean armor, int cannonCaliber, boolean antiRocketLauncher, boolean airDefenceCapabilities, boolean isWorking){

        super(crewQty, armor);
        this.name = name;
        this.cannonCaliber = cannonCaliber;
        this.antiRocketLauncher = antiRocketLauncher;
        this.airDefenceCapabilities = airDefenceCapabilities;
        this.isWorking = isWorking;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getCannonCaliber() {
        return cannonCaliber;
    }

    public void setCannonCaliber(int cannonCaliber) {
        this.cannonCaliber = cannonCaliber;
    }

    public boolean isAntiRocketLauncher() {
        return antiRocketLauncher;
    }

    public void setAntiRocketLauncher(boolean antiRocketLauncher) {
        this.antiRocketLauncher = antiRocketLauncher;
    }

    public boolean isAirDefenceCapabilities() {
        return airDefenceCapabilities;
    }

    public void setAirDefenceCapabilities(boolean airDefenceCapabilities) {
        this.airDefenceCapabilities = airDefenceCapabilities;
    }

    @Override
    public String toString() {
        return "Panzer{" +
                "name='" + name + '\'' +
                ", isWorking=" + isWorking +
                ", cannonCaliber=" + cannonCaliber +
                ", antiRocketLauncher=" + antiRocketLauncher +
                ", airDefenceCapabilities=" + airDefenceCapabilities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Panzer)) return false;
        if (!super.equals(o)) return false;
        Panzer panzer = (Panzer) o;
        return isWorking == panzer.isWorking && getCannonCaliber() == panzer.getCannonCaliber() && isAntiRocketLauncher() == panzer.isAntiRocketLauncher() && isAirDefenceCapabilities() == panzer.isAirDefenceCapabilities() && Objects.equals(getName(), panzer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), isWorking, getCannonCaliber(), isAntiRocketLauncher(), isAirDefenceCapabilities());
    }
}
