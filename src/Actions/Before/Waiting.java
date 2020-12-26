package Actions.Before;

public class Waiting extends ActionBefore {
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
        return true;
    }

    @Override
    public boolean isCameraman() {
        return true;
    }

    @Override
    public boolean isPolice() {
        return true;
    }

    @Override
    public Integer getActEnergy() {
        return 5;
    }
    @Override
    public String Act() {
        return "waits for the Cosmonaut";
    }
}
