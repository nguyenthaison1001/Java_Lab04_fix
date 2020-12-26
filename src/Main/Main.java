package Main;

import Actions.*;
import Actions.After.*;
import Actions.Before.*;
import Actions.Current.*;
import Exceptions.IllegalTimeException;
import Exceptions.NullDrinkRuntimeException;
import People.*;
import Status.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, IllegalTimeException {
        ArrayList<Action> allAction = allAction();      //Declare Arraylist of Actions of each type of People

        /*
          - Local class
          - Create a new action
          - Add it to ArrayList fanAction
        */
        class StandingOnRoof extends Standing {
            @Override
            public Integer getActEnergy() {
                return 9;
            }
            @Override
            public String Act() {
                return "ready stands on the roof";
            }
        }
        allAction.add(new StandingOnRoof());

        Status nowStatus;
        Minute minuteNow;
        int time = setTime();            // Initialize the time from method setTime
        for (int i = 0; i < Minute.values().length; i++){                 //Loop with enum
            minuteNow = Minute.values()[i];
            System.out.printf("\n---It's %s%s now!\n---", time, minuteNow);

            if (i <= 1) nowStatus = new Before();                   //Status: Before()
            else if (i <= 3) nowStatus = new Current();             //Status: Current()
            else nowStatus = new After();                           //Status: After()
            System.out.println(nowStatus.Stt());
            allPeopleAct(allAction, nowStatus);

            /*
               - Anonymous class
               - Create a class baby, extends class People
             */
            People Boy = new People("Kitty", nowStatus, allAction){
                @Override
                public boolean checkJob(Action action) {
                    return action.isFan();
                }
                @Override
                public String toString() {
                    return "Boy " + super.toString();
                }
            };
            System.out.println(Boy.toString());
        }
    }

    /**
     * Set time. Time is a number in range [0;23].
     * @return time as a number
     * @throws IOException A checked exception, will occur if enter not a number.
     * @throws IllegalTimeException A checked exception, will occur if the number isn't in range [0;23]
     */
    private static Integer setTime() throws IOException, IllegalTimeException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the time: " );
        int time = Integer.parseInt(reader.readLine());
        if (time < 0 || time >= 24) {
            throw new IllegalTimeException("Time must be a number in range [0;23]!. ");
        }
        else
            return time;
    }
    /**
     * Declare ArrayList for all of People
     * Loop "for" to get each elements of People
     * @param allAction ArrayLists all of actions
     * @param nowStatus nowStatus
     */
    private static void allPeopleAct(ArrayList<Action> allAction,Status nowStatus) {
        ArrayList<People> allPeople = allPeople(allAction, nowStatus);
        People.Water water = new People.Water();        // Create an object of the static inner class.
        for (People pp: allPeople){
            System.out.println(pp.toString());
            if (water.isThirsty()) {
                System.out.print("  " + pp.name + " is thirsty, ");
                /*
                 - If (random<=0.3) -> assign (water=null) -> NullPointerException
                 - NullDrinkRuntimeException: unchecked exception
                 */
                if (Math.random() <= 0.3) {
                    System.out.println("but, it seems that, water is over...");
                    water = null;
                }
                try {
                    water.drink();
                }
                catch (NullPointerException e) {
                    throw new NullDrinkRuntimeException("Object Water is null! ", e);
                }
            }
        }
    }

    /**
     * Create ArrayLists of Fan
     * @param allAction ArrayLists all of actions
     * @param nowStatus nowStatus
     * @return ArrayLists of Fan
     */
    static ArrayList<People> allPeople(ArrayList<Action> allAction, Status nowStatus) {
        return new ArrayList<People>(){{
            add(new Cosmonaut("Biden", nowStatus, allAction));
            add(new Fan("Jane", nowStatus, allAction));
            add(new Reporter("Alex", nowStatus, allAction));
            add(new Cameraman("John", nowStatus, allAction));
            add(new Photographer("Peter", nowStatus, allAction));
            add(new Police("David", nowStatus, allAction));
        }};
    }

    /**
     * Create ArrayLists of actions of Fan
     * @return ArrayLists of actions of Fan
     */
    static ArrayList<Action> allAction(){
        return new ArrayList<Action>(){{
            add(new Coming());
            add(new Talking());
            add(new Laughing());
            add(new Waiting());
            add(new SettingUp());
            add(new Standing());

            add(new Shouting());
            add(new BlowingWhistle());
            add(new Clapping());
            add(new CleaningCrowd());
            add(new Filming());
            add(new Interviewing());
            add(new Shooting());
            add(new Wearing());
            add(new Waving());

            add(new Touching());
            add(new Following());
            add(new Stepping());
            add(new Packing());
            add(new TossingFlower());
            add(new Hitting());
        }};
    }
}
