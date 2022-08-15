package interfaces;

import exeptions.*;
import people.Recruit;

public interface Checkable {

    void check(Recruit r) throws WrongNameEnteredException, WrongLastNameEnteredException, WrongAgeEnteredException, WrongHeightEnteredException, WrongWeightEnteredException;
}
