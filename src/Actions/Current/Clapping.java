package Actions.Current;

public class Clapping extends ActionCurrent {
    @Override
    public boolean isCosmonaut() {
        return false;
    }

    @Override
    public boolean isFan() {
        return true;
    }

    @Override
    public boolean isReporter() {
        return false;
    }

    @Override
    public boolean isPhotographer() {
        return true;
    }

    @Override
    public boolean isCameraman() {
        return false;
    }

    @Override
    public boolean isPolice() {
        return false;
    }

    /**
     * Set energy for action
     * @return number of energy
     */
    @Override
    public Integer getActEnergy() {
        return 16;
    }

    /**
     * Describe the action
     * @return string
     */
    @Override
    public String Act() {
        return "applauds";
    }
}
