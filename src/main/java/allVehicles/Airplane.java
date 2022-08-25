package allVehicles;

public enum Airplane {
    Mig29("Fulcrum"),
    SU24("Fencer"),
    SU25("Frogfoot"),
    SU27("Flanker"),
    F16("Falcon"),
    F15("Eagle"),
    A10("Thunderbolt ");

    private String reportingName;

    Airplane(String reportingName){
        this.reportingName = reportingName;
    }

    public String getReportedName(){
        return reportingName;
    }

}
