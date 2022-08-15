package interfaces;

import allVehicles.Vehicle;

public interface Repairing<T extends Vehicle> {

    <T extends Vehicle> T  repairing(T thing);

}
