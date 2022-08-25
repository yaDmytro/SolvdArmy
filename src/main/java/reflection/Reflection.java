package reflection;

import allVehicles.Panzer;
import allVehicles.TransportAircraft;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws IllegalAccessException {
        TransportAircraft transportAircraft = new TransportAircraft();
        String name = null;
        int number = transportAircraft.getNumber();
        printData(transportAircraft);
        Field field = null;
        try {
            field = transportAircraft.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(transportAircraft, (String) "An - 225");
            name = (String) field.get(transportAircraft);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        printData(transportAircraft);


        //System.out.println(name);

    }

    public static void printData(Object transportAircraft){
        try {
            Method method = transportAircraft.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(transportAircraft);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

