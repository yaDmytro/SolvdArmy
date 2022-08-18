package people;

import armyFields.*;
import com.sun.tools.javac.Main;
import interfaces.Checkable;
import com.solvd.army.interfaces.Counter;
import exeptions.*;
import interfaces.Sorting;
import people.requirementsForService.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.lang3.*;
import static org.apache.commons.io.FileUtils.writeStringToFile;


public class RecruitingCenter implements Checkable, Counter, Sorting {

    final String newRecruits = "newRecruits.txt";
    final File file = new File("F:\\projects\\Solvd\\solvdArmyExample\\",newRecruits);
    final String wrongNewRecruits = "wrongNewRecruits";
    Recruit r;
    private static final Logger LOGGER = LogManager.getLogger(Main.class.getName());
    static public ArrayList<Recruit> listRecruits = new ArrayList<>();

    //requirements
    AirborneReq airborneReq = new AirborneReq(25,40,60,100,160.0,200.0,false);
    AirforceReq airforceReq = new AirforceReq(25,59,60,80,160.0,190.0,true);
    ArtilleryReq artilleryReq = new ArtilleryReq(18,60,55,120,150.0,200.0,false);
    NavalReq navalReq = new NavalReq(18,60,55,120,150.0,190.0,true);
    PanzerReq panzerReq = new PanzerReq(18,50,55,90,145.0,180.0,false);
    InfantryReq infantryReq = new InfantryReq(18,60,50,130,145.0,200.0,false);


    @Override
    public void sorting(ArrayList<Recruit> set){
        for (int i = 0; i < set.size(); i++) {

            switch(set.get(i).getPreferredField()){
                case AIRBORNE:
                    if(set.get(i).getAge() > airborneReq.getMaxAge() || set.get(i).getAge() < airborneReq.getMinAge()){
                        LOGGER.info("Aging problem");
                    }
                    if(set.get(i).getWeight() > airborneReq.getMaxWeight() || set.get(i).getWeight() < airborneReq.getMinWeight()){
                        LOGGER.info("Weight problem");
                    }
                    if(set.get(i).getHeight() > airborneReq.getMaxHeight() || set.get(i).getHeight() < airborneReq.getMinHeight()){
                        LOGGER.info("Height problem");
                    } else{

                        AirborneForces.airBornNewRecruits.add(set.get(i));
                        LOGGER.info("New recruit added to AirBorne list");

                    }
                    break;
                case AIRFORCES:
                    if(set.get(i).getAge() > airforceReq.getMaxAge() || set.get(i).getAge() < airforceReq.getMinAge()){
                        LOGGER.info("Aging problem");
                    }
                    if(set.get(i).getWeight() > airforceReq.getMaxWeight() || set.get(i).getWeight() < airforceReq.getMinWeight()){
                        LOGGER.info("Weight problem");
                    }
                    if(set.get(i).getHeight() > airforceReq.getMaxHeight() || set.get(i).getHeight() < airforceReq.getMinHeight()){
                        LOGGER.info("Height problem");
                    }
                    if(set.get(i).getHighEducation() == airforceReq.isHighEducation()){
                        LOGGER.info("HighEducation problem");
                    } else{

                        AirForces.airForcesNewRecruits.add(set.get(i));
                        LOGGER.info("New recruit added to AirForces list");

                    }
                    break;
                case ARTILLERY:
                    if(set.get(i).getAge() > artilleryReq.getMaxAge() || set.get(i).getAge() < artilleryReq.getMinAge()){
                        LOGGER.info("Aging problem");
                    }
                    if(set.get(i).getWeight() > artilleryReq.getMaxWeight() || set.get(i).getWeight() < artilleryReq.getMinWeight()){
                        LOGGER.info("Weight problem");
                    }
                    if(set.get(i).getHeight() > artilleryReq.getMaxHeight() || set.get(i).getHeight() < artilleryReq.getMinHeight()){
                        LOGGER.info("Height problem");
                    } else{

                        Artillery.artilleryNewRecruits.add(set.get(i));
                        LOGGER.info("New recruit added to Artillery list");

                    }
                    break;
                case INFANTRY:
                    if(set.get(i).getAge() > infantryReq.getMaxAge() || set.get(i).getAge() < infantryReq.getMinAge()){
                        LOGGER.info("Aging problem");
                    }
                    if(set.get(i).getWeight() > infantryReq.getMaxWeight() || set.get(i).getWeight() < infantryReq.getMinWeight()){
                        LOGGER.info("Weight problem");
                    }
                    if(set.get(i).getHeight() > infantryReq.getMaxHeight() || set.get(i).getHeight() < infantryReq.getMinHeight()){
                        LOGGER.info("Height problem");
                    } else{

                        InfantryUnit.infantryNewRecruits.add(set.get(i));
                        LOGGER.info("New recruit added to Infantry list");

                    }
                    break;
                case NAVAL:
                    if(set.get(i).getAge() > navalReq.getMaxAge() || set.get(i).getAge() < navalReq.getMinAge()){
                        LOGGER.info("Aging problem");
                    }
                    if(set.get(i).getWeight() > navalReq.getMaxWeight() || set.get(i).getWeight() < navalReq.getMinWeight()){
                        LOGGER.info("Weight problem");
                    }
                    if(set.get(i).getHeight() > navalReq.getMaxHeight() || set.get(i).getHeight() < navalReq.getMinHeight()){
                        LOGGER.info("Height problem");
                    }
                    if(set.get(i).getHighEducation() == navalReq.isHighEducation()){
                        LOGGER.info("HighEducation problem");
                    } else{

                        NavalForces.navalForcesNewRecruits.add(set.get(i));
                        LOGGER.info("New recruit added to Naval Forces list");

                    }
                    break;
                case PANZER:
                    if(set.get(i).getAge() > panzerReq.getMaxAge() || set.get(i).getAge() < panzerReq.getMinAge()){
                        LOGGER.info("Aging problem");
                    }
                    if(set.get(i).getWeight() > panzerReq.getMaxWeight() || set.get(i).getWeight() < panzerReq.getMinWeight()){
                        LOGGER.info("Weight problem");
                    }
                    if(set.get(i).getHeight() > panzerReq.getMaxHeight() || set.get(i).getHeight() < panzerReq.getMinHeight()){
                        LOGGER.info("Height problem");

                    } else{

                        PanzerBattalion.panzerNewRecruits.add(set.get(i));
                        LOGGER.info("New recruit added to Panzer Battalion list");

                    }
                    break;
            }
        }
    }

    @Override
    public void counter(){
        LOGGER.info("We have " + listRecruits.size() + " new recruits");
    }

    @Override
    public void check(Recruit r) {
        boolean success = true;
        while(success){

            boolean status = true;
            if (StringUtils.isEmpty(r.getFirstName()) || StringUtils.isBlank(r.getFirstName())){

                LOGGER.error("New error detected: ", new WrongNameEnteredException());
                status = false;
                String updatedName = StringUtils.deleteWhitespace(r.getFirstName());
                r.setFirstName(updatedName);

            }
            if(StringUtils.isEmpty(r.getLastName()) || StringUtils.isBlank(r.getLastName())){

                LOGGER.error("New error detected: ", new WrongLastNameEnteredException());
                status = false;
                String updatedLastName = StringUtils.deleteWhitespace(r.getLastName());
                r.setLastName(updatedLastName);

            }
            if(r.getAge() <= 18 || r.getAge() > 65){

                LOGGER.error("New error detected: ", new WrongAgeEnteredException());
                status = false;

            }
            if(r.getWeight() < 45.0 || r.getWeight() > 175.0){

                LOGGER.error("New error detected: ", new WrongWeightEnteredException());
                status = false;

            }
            if(r.getHeight() <= 150.0 || r.getHeight() > 220.0 ){

                LOGGER.error("New error detected: ", new WrongHeightEnteredException());
                status = false;

            }
            if(status){

                listRecruits.add(r);
                /*
                try {
                    writeStringToFile(file, String.valueOf(r), true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                */

                try(FileWriter writer = new FileWriter(file, true)){
                    writer.write(listRecruits.size() +". " + r + "\n");
                    writer.flush();
                }catch (IOException ex){
                    LOGGER.error("we have IOException in file whiter");
                }
                LOGGER.info("Added new Recruit to Recruit List");

                success = false;
            } else{
                success = false;
            }

        }
    }
}
