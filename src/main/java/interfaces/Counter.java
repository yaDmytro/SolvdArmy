package interfaces;

import people.Recruit;

import java.util.ArrayList;

@FunctionalInterface
public interface Counter {

    void countTheList(ArrayList<? extends Recruit> arrayList);

}
