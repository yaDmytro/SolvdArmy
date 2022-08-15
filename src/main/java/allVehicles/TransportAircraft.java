package allVehicles;

public class TransportAircraft extends Vehicle {

    private String name;
    private boolean isWorking;

    public TransportAircraft(){}


    public TransportAircraft(String name, int qty, boolean isWorking){
        this.name = name;
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
}
