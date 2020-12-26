package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Reporter extends People {
    public Reporter(String name, Status nowStatus, ArrayList<Action> allAction){
        super(name, nowStatus, allAction);
    }

    @Override
    public boolean checkJob(Action action) {
        return action.isReporter();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Reporter " + str;
        return str;
    }
}
