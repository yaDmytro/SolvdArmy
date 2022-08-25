package allVehicles;

public class TransportAircraft extends Vehicle {

    private String name;
    private int number;
    private boolean isWorking;


    public TransportAircraft(){}

/*
    public TransportAircraft(String name, int qty, boolean isWorking){
        this.name = name;
        this.isWorking = isWorking;
    }

 */
/*
    public String getName(){
        return name;
    }

 */



    public void setName(String name) {
        this.name = name;
    }


    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    private void printData(){
        System.out.println("Name:" + name +" IsWorkingfield: "+ isWorking+" Number: "+ number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
