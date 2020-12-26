package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Fan extends People {

    public Fan(String name, Status nowStatus, ArrayList<Action> allAction) {
        super(name, nowStatus, allAction);
    }

    @Override
    public boolean checkJob(Action action) {
        return action.isFan();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Fan " + str;
        if (nowStatus.isCurrent()){
            Fan.Touching touch = new Fan.Touching();
        return str.substring(0,str.length()-1) + touch.checkTouching();}
        else return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fan){
            Fan another = (Fan) obj;
            return this.name.equals(another.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()%10;
    }

    /**
     * Non-static nested class.
     * If random<=0.3 -> isHungry -> lose energy.
     */
    private class Touching {
        boolean isTouching = false;
        public int energyLost = 25;
        public String checkTouching(){
            if (Math.random() <= 0.3){
                isTouching = true;
                return ("\n  " + name + " just touched the Cosmonaut suit => her hand was beaten by police => energy loses -" +energyLost+ "!");
            } return "";
        }
    }
}