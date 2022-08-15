package people.requirementsForService;

import people.Sex;

public class InfantryReq extends Requirements {

    public InfantryReq(){}

    public InfantryReq(int minAge, int maxAge, double minWeight, double maxWeight, double minHeight, double maxHeight, boolean highEducation){

        super(minAge, maxAge, minWeight, maxWeight, minHeight, maxHeight, highEducation);

    }

}
