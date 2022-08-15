

import allVehicles.FighterHelicopters;
import allVehicles.Panzer;
import allVehicles.ServiceCenter;
import allVehicles.TransportHelicopters;
import people.ArmyFields;
import people.Recruit;
import people.RecruitingCenter;
import people.Sex;

public class Main {

    public static void main(String[] args) throws NullPointerException {

        RecruitingCenter rc = new RecruitingCenter();

        Recruit person1 = new Recruit("Oleg", "Yakubov", -20, Sex.m, 75.5, 175.5,true, ArmyFields.ARTILLERY);
        Recruit person2 = new Recruit(" ", "Tarasenko", 25, Sex.f, 45, 155.5,false, ArmyFields.INFANTRY);
        Recruit person3 = new Recruit("Dmytro", "Taranov", 41, Sex.m, 73.0, 173.7,true, ArmyFields.AIRBORNE);
        Recruit person4 = new Recruit("Olena", "Ostapenko", 27, Sex.f, -75.0, -175.5,false, ArmyFields.AIRFORCES);
        Recruit person5 = new Recruit("Igor", "Yakubov", 37, Sex.m, 83.1, 181.2,true, ArmyFields.AIRBORNE);
        Recruit person6 = new Recruit("Oksana", "Yakubovska", 21, Sex.f, 63.0, 185.5,false, ArmyFields.AIRFORCES);
        Recruit person7 = new Recruit("Mykola", "Kutepov", 31, Sex.m, 90.2, 174.7,true, ArmyFields.INFANTRY);
        Recruit person8 = new Recruit("Ignhat", "Gaevskyi", 29, Sex.m, 66.5, 172.3,false, ArmyFields.PANZER);
        Recruit person9 = new Recruit("Natalia", "Mayevska", 22, Sex.f, 55.5, 170.7,false, ArmyFields.ARTILLERY);
        Recruit person10 = new Recruit("John", "McCain", 47, Sex.m, 79, 179.5,true, ArmyFields.AIRFORCES);
        Recruit person11 = new Recruit("Daria", "Kovalenko", 35, Sex.f, 60.5, 165.5,true, ArmyFields.NAVAL);

        rc.check(person1);
        rc.check(person2);
        rc.check(person3);
        rc.check(person4);
        rc.check(person5);
        rc.check(person6);
        rc.check(person7);
        rc.check(person8);
        rc.check(person9);
        rc.check(person10);
        rc.check(person11);

        rc.counter();

        rc.sorting(RecruitingCenter.listRecruits);

        TransportHelicopters ts = new TransportHelicopters("MI-17", 3, true, 15, true, false);
        System.out.println(ts);
        FighterHelicopters fh = new FighterHelicopters("Mi-24", 2, true, 3, false, true, false );
        System.out.println(fh);

        Panzer panzer = new Panzer("T-72", 3, true,125,false,false,false);
        System.out.println(panzer);
        ServiceCenter<Panzer> serviceCenter = new ServiceCenter<>();
        serviceCenter.repairing(panzer);
        serviceCenter.repairing(ts);
        System.out.println(panzer);

    }
}
