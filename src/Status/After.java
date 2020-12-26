package Status;

public class After implements Status {
    /**
     * Status is left
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isBefore(){return false;}

    /**
     * Status is left
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isCurrent(){return false;}

    /**
     * Status is left
     * => isNotYet: true
     * @return true
     */
    @Override
    public boolean isAfter(){return true;}

    /**
     * Information about this status
     * @return a string information about this status
     */
    public String Stt(){
        return "The crowd is getting bigger!";
        }
}
