package people.requirementsForService;

import people.Sex;

public class NavalReq extends Requirements{

    public NavalReq(){}

    public NavalReq(int minAge, int maxAge, double minWeight, double maxWeight, double minHeight, double maxHeight, boolean highEducation){

        super(minAge, maxAge, minWeight, maxWeight, minHeight, maxHeight, highEducation);

    }
}
