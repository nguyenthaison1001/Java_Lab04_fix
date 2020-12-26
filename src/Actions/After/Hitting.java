package Actions.After;

public class Hitting extends ActionAfter {
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

    @Override
    public Integer getActEnergy() {
        return 22;
    }

    @Override
    public String Act() {
        return "hits the baton to someone";
    }
}
