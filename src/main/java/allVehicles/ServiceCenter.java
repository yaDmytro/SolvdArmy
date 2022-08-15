package allVehicles;

import exeptions.*;
import interfaces.Checkable;
import interfaces.Repairing;
import people.Recruit;

public class ServiceCenter<T extends Vehicle> implements Repairing<T>, Checkable {

    T thing;

    @Override
    public <T extends Vehicle> T repairing(T thing) {
        thing.setWorking(true);
       return thing;
    }

    @Override
    public void check(Recruit r) throws WrongNameEnteredException, WrongLastNameEnteredException, WrongAgeEnteredException, WrongHeightEnteredException, WrongWeightEnteredException {

    }
}
