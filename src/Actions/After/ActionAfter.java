package Actions.After;

import Actions.Action;

public abstract class ActionAfter implements Action {
    /**
     * Status: Left => return -1
     * @return -1
     */
    @Override
    public Integer getStatus() {
        return -1;
    }
}
