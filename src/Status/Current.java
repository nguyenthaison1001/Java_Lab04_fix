package Status;

public class Current implements Status {
    /**
     * Status is arrived
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isBefore(){return false;}

    /**
     * Status is arrived
     * => isNotYet: true
     * @return true
     */
    @Override
    public boolean isCurrent(){return true;}

    /**
     * Status is arrived
     * => isNotYet: false
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
        return "The crowd becomes chaotic, out of control!";
    }
}
