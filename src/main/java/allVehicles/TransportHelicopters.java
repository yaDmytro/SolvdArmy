package allVehicles;

import java.util.Objects;

public class TransportHelicopters extends Vehicle {

    private String name;
    private boolean isWorking;
    private int landingCrew;
    private boolean rocketLauncher;

    public TransportHelicopters(){}

    public TransportHelicopters(String name, int crewQty, boolean armor, int landingCrew, boolean rocketLauncher, boolean isWorking){
        super(crewQty, armor);
        this.name = name;
        this.isWorking = isWorking;
        this.landingCrew = landingCrew;
        this.rocketLauncher = rocketLauncher;
    }

    public int getLandingCrew() {
        return landingCrew;
    }

    public void setLandingCrew(int landingCrew) {
        this.landingCrew = landingCrew;
    }

    public void setRocketLauncher(){
        this.rocketLauncher = rocketLauncher;
    }

    public boolean getRocketLauncher() {
        return rocketLauncher;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportHelicopters)) return false;
        if (!super.equals(o)) return false;
        TransportHelicopters that = (TransportHelicopters) o;
        return isWorking() == that.isWorking() && getLandingCrew() == that.getLandingCrew() &&
                getRocketLauncher() == that.getRocketLauncher() && Objects.equals(getName(), that.getName());
    }

    @Override
    public String toString() {
        return "TransportHelicopters{" +
                "name='" + name + '\'' +
                ", isWorking=" + isWorking +
                ", landingCrew=" + landingCrew +
                ", rocketLauncher=" + rocketLauncher +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), isWorking(), getLandingCrew(), getRocketLauncher());
    }
}
