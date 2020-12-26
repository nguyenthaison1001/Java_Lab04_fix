package Actions.Current;

public class CleaningCrowd extends ActionCurrent {
    @Override
    public boolean isCosmonaut() {
        return false;
    }

    @Override
    public boolean isFan() {
        return false;
    }

    @Override
    public boolean isReporter() {
        return false;
    }

    @Override
    public boolean isPhotographer() {
        return false;
    }

    @Override
    public boolean isCameraman() {
        return false;
    }

    @Override
    public boolean isPolice() {
        return true;
    }

    /**
     * Set energy for action
     * @return number of energy
     */
    @Override
    public Integer getActEnergy() {
        return 15;
    }

    /**
     * Describe the action
     * @return string
     */
    @Override
    public String Act() {
        return "cleans the big crowd";
    }
}

