package com.sparta.nam.exceptions;

import java.text.ParseException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {

    public static final Logger LOGGER = Logger.getLogger(com.sparta.nam.logging.App.class.getName());

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logFile2.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch(Exception ex){
            ex.printStackTrace();
        }

//        Integer[] ints = {1,2,3};

//        System.out.println(ints[7]); // ArrayIndexOutOfBoundsException

//        int a = 1 / 0; //Arithmetic Exception

//        Animal myDog = new Animal("Fido", 10);
//        Animal myCat = new Animal();
//
//        try {
//            System.out.println(myDog.getName());
//            System.out.println(myCat.getName());
//        }catch(NullPointerException ex){
//            System.out.println("Sorry that animal does not have a name");
//        }
//        System.out.println();
//        try {
//            myCat.setVaccinationDate("10-05-2015");
//            myDog.setVaccinationDate("10-05-2015");
//            // myDog.setVaccinationDate("15 June, 2018");
//        } catch (ParseException e) {
//            System.out.println("Invalid date format, should be \"dd-MM-yyyy\"");;
//        } finally{
//            System.out.println("The animals are:");
//            System.out.println("myDog:" + myDog);
//            System.out.println("myCat" + myCat);
//        }
//        System.out.println(myDog.getVaccinationDate());
//        System.out.println(myCat.getName_Handled());
//        System.out.println("Program is finished");


        try{
            throw new RuntimeException();
        } catch (Exception ex){
            LOGGER.log(Level.SEVERE, "SEVERE Name cannot be null"); // highest
        }

        try {
            Animal myHamster = new Animal(null, 2, "27-07-2022");
            Animal myRabbit = new Animal("Vineer", 1, "27-07-2022");
            Animal myOtherDog = new Animal("Dayanna", 2, "27-07-2022");
            Animal myOtherCat = new Animal("Farah", 12, "27-07-2022");
        }




            catch (NullPointerException e) {
                System.out.println("Name cannot be null");
            }
            catch (IllegalArgumentException e) {
                            System.out.println("Age cannot be negative");
                        }
            catch (ParseException e) {
                System.out.println("Date format is incorrect");
            }
            catch (RuntimeException e) {
                System.out.println("Caught an RuntimeException object");
            }
            catch (Exception e) {
                System.out.println("Caught an Exception object");
            }
        finally{
            System.out.println("Program is complete");
        }
    }


}
