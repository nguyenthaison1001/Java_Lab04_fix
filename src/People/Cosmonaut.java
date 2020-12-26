package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Cosmonaut extends People {
    public Cosmonaut(String name, Status nowStatus, ArrayList<Action> allAction){
        super(name, nowStatus, allAction);
    }

    @Override
    public boolean checkJob(Action action) {
        return action.isCosmonaut();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Cosmonaut " + str;
        return str;
    }
}
