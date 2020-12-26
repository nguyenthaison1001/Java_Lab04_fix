package Actions.Current;

public class Waving extends ActionCurrent {
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
        return 3;
    }
    @Override
    public String Act() {
        return "waves to everyone";
    }
}
