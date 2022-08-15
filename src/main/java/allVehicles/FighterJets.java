package allVehicles;

public class FighterJets {
    private int qty;
    private String name;
    boolean isWorking;

    public FighterJets(){}

    public FighterJets(String name, int qty, boolean isWorking){
        this.name = name;
        this.qty = qty;
        this.isWorking = isWorking;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
