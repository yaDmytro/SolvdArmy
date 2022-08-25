package allVehicles;

public enum Tank {
    T72("T-72",4, 125){
        public String specialEduReq(){
            return "Special Education is not required for " + Tank.T72.crewAmount + " crew members";}
    },
    T64("T-64",3,125){
        public String specialEduReq(){
            return "Special Education is not required for " + Tank.T64.crewAmount + " crew members";}
    },
    T80("T-80",3, 125){
        public String specialEduReq(){
            return "Special Education is not required for " + Tank.T80.crewAmount + " crew members";}
    },
    Leopard("Leopard",4, 120){
        @Override
        public String specialEduReq() {
            return "Special Education is not required for " + Tank.Leopard.crewAmount + " crew members";
        }
    },
    Abrams("Abrams",4, 120){
        @Override
        public String specialEduReq() {
            return "Special Education is required for " + Tank.Abrams.crewAmount + " crew members";
        }
    };
    public abstract String specialEduReq();

    private String name;
    private int crewAmount;
    private int calibre;

    Tank(String name, int crewAmount, int calibre){
        this.name = name;
        this.crewAmount = crewAmount;
        this.calibre = calibre;
    }

    public int getCrewAmount() {
        return crewAmount;
    }

    public int setCalibre(int calibre) {
        return calibre;
    }

    public void setCrewAmount(int crewAmount) {
        this.crewAmount = crewAmount;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", crewAmount=" + crewAmount +
                ", calibre=" + calibre +
                '}';
    }
}
