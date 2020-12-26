package People;

import Actions.*;
import Status.*;

import java.util.ArrayList;

public class Cameraman extends People {
    public Cameraman(String name, Status nowStatus, ArrayList<Action> allAction){
        super(name, nowStatus, allAction);
    }

    @Override
    public boolean checkJob(Action action) {
        return action.isCameraman();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Cameraman " + str;
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cameraman){
            Cameraman another = (Cameraman) obj;
            return this.name.equals(another.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()%12;
    }
}
