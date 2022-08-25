package interfaces;

import exeptions.*;
import people.Recruit;

public interface Checkable {

    boolean check(Recruit r) throws WrongNameEnteredException, WrongLastNameEnteredException, WrongAgeEnteredException, WrongHeightEnteredException, WrongWeightEnteredException;
}
