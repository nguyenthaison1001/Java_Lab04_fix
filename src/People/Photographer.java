package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Photographer extends People {
    public Photographer(String name, Status nowStatus, ArrayList<Action> allAction) {
        super(name, nowStatus, allAction);
    }

    @Override
    public boolean checkJob(Action action) {
        return action.isPhotographer();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Photographer " + str;
        return str;
    }
}
