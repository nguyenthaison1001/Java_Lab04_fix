package Actions.Before;

public class Coming extends ActionBefore {
    @Override
    public boolean isCosmonaut() {
        return true;
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
        return false;
    }

    @Override
    public Integer getActEnergy() {
        return 0;
    }
    @Override
    public String Act() {
        return "is on his yellow car, coming to the hotel";
    }
}
