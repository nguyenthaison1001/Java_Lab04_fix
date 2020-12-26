package Actions.Before;

public class Laughing extends ActionBefore {
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
        return true;
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
        return 7;
    }

    @Override
    public String Act() {
        return "laughs out loud";
    }
}