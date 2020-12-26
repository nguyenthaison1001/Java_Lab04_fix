package Actions.Before;

import Actions.Action;

public abstract class ActionBefore implements Action {
    /**
     * Status: NotYet => return 0
     * @return
     */
    @Override
    public Integer getStatus() {
        return 0;
    }
}
