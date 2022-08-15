package armyFields;

import people.Recruit;

import java.util.ArrayList;
import java.util.Objects;

public class Artillery {

    static public ArrayList<Recruit> artilleryNewRecruits = new ArrayList<>();

    private int mortarCount;
    private int shortRangeArtilleryCount;
    private int longRangeArtilleryCount;
    private int multiLaunchRocketSystemCount;
    private int tacticalBallisticRocketSystemCount;

    Artillery(){}

    Artillery(int mortarCount, int shortRangeArtilleryCount, int longRangeArtilleryCount, int multiLaunchRocketSystemCount, int tacticalBallisticRocketSystemCount, SupportingUnits su){
        this.mortarCount = mortarCount;
        this.shortRangeArtilleryCount = shortRangeArtilleryCount;
        this.longRangeArtilleryCount = longRangeArtilleryCount;
        this.multiLaunchRocketSystemCount = multiLaunchRocketSystemCount;
        this.tacticalBallisticRocketSystemCount = tacticalBallisticRocketSystemCount;
    }

    public void setMortarCount(int mortarCount){
        this.mortarCount = mortarCount;
    }

    public int getMortarCount(){
        return mortarCount;
    }

    public void setShortRangeArtilleryCount(int shortRangeArtilleryCount){
        this.shortRangeArtilleryCount = shortRangeArtilleryCount;
    }

    public int getShortRangeArtilleryCount(){
        return shortRangeArtilleryCount;
    }

    public void setLongRangeArtilleryCount(int longRangeArtilleryCount){
        this.longRangeArtilleryCount = longRangeArtilleryCount;
    }

    public int getLongRangeArtilleryCount(){
        return longRangeArtilleryCount;
    }

    public void setMultiLaunchRocketSystemCount(int multiLaunchRocketSystemCount){
        this.multiLaunchRocketSystemCount = multiLaunchRocketSystemCount;
    }
    public int getMultiLaunchRocketSystemCount(){
        return multiLaunchRocketSystemCount;
    }

    public void setTacticalBallisticRocketSystemCount(int tacticalBallisticRocketSystemCount){
        this.tacticalBallisticRocketSystemCount = tacticalBallisticRocketSystemCount;
    }

    public int getTacticalBallisticRocketSystemCount() {
        return tacticalBallisticRocketSystemCount;
    }

    @Override
    public String toString() {
        return "ArtilleryUnit " +
                "mortarCount = " + mortarCount +
                ", shortRangeArtilleryCount = " + shortRangeArtilleryCount +
                ", longRangeArtilleryCount = " + longRangeArtilleryCount +
                ", multiLaunchRocketSystemCount = " + multiLaunchRocketSystemCount +
                ", tacticalBallisticRocketSystemCount = " + tacticalBallisticRocketSystemCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artillery)) return false;
        Artillery artillery = (Artillery) o;
        return getMortarCount() == artillery.getMortarCount() && getShortRangeArtilleryCount() == artillery.getShortRangeArtilleryCount() && getLongRangeArtilleryCount() == artillery.getLongRangeArtilleryCount() && getMultiLaunchRocketSystemCount() == artillery.getMultiLaunchRocketSystemCount() && getTacticalBallisticRocketSystemCount() == artillery.getTacticalBallisticRocketSystemCount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMortarCount(), getShortRangeArtilleryCount(), getLongRangeArtilleryCount(), getMultiLaunchRocketSystemCount(), getTacticalBallisticRocketSystemCount());
    }
}
