package Actions.Before;

public class Standing extends ActionBefore {
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
        return true;
    }

    @Override
    public boolean isCameraman() {
        return true;
    }

    @Override
    public boolean isPolice() {
        return false;
    }

    @Override
    public Integer getActEnergy() {
        return 5;
    }
    @Override
    public String Act() {
        return "stands on top of the truck";
    }
}