package armyFields;

public class SupportingUnits {

    private int fuelTruckCount;
    private int medicalVehicleCount;
    private int engineeringVehicle;
    private int reloadingVehicle;

    SupportingUnits(){}

    SupportingUnits(int fuelTruckCount, int medicalVehicleCount, int engineeringVehicle, int reloadingVehicle){
        this.fuelTruckCount = fuelTruckCount;
        this.medicalVehicleCount = medicalVehicleCount;
        this.engineeringVehicle = engineeringVehicle;
        this.reloadingVehicle = reloadingVehicle;
    }

    public void setFuelTruckCount(int fuelTruckCount){
        this.fuelTruckCount = fuelTruckCount;
    }

    public int getFuelTruckCount(){
        return fuelTruckCount;
    }

    public void setMedicalVehicleCount(int medicalVehicleCount){
        this.medicalVehicleCount = medicalVehicleCount;
    }

    public int getMedicalVehicleCount(){
        return medicalVehicleCount;
    }

    public void setEngineeringVehicle(int engineeringVehicle){
        this.engineeringVehicle = engineeringVehicle;
    }

    public int getEngineeringVehicle(){
        return engineeringVehicle;
    }

}
