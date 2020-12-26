package Actions.Current;

import Actions.Action;

public abstract class ActionCurrent implements Action {
    /**
     * Status: Arrived => return 1
     * @return return 1
     */
    @Override
    public Integer getStatus() {
        return 1;
    }

}
