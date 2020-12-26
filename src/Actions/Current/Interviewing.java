package Actions.Current;

public class Interviewing extends ActionCurrent {
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
        return 19;
    }
    @Override
    public String Act() {
        return "interviews the Hero";
    }
}