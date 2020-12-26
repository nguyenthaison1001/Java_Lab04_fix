package Status;

public class Before implements Status {
    /**
     * Status is not yet
     * => isNotYet: true
     * @return true
     */
    @Override
    public boolean isBefore(){return true;}

    /**
     * Status is not yet
     * => isArrived: false
     * @return false
     */
    @Override
    public boolean isCurrent(){return false;}

    /**
     * Status is not yet
     * => isLeft: false
     * @return false
     */
    @Override
    public boolean isAfter(){return false;}

    /**
     * Information about this status
     * @return a string information about this status
     */
    @Override
    public String Stt(){
        return "The crowd has been waiting for a long time!";
    }
}
