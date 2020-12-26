package Actions;

public interface Action {
    boolean isCosmonaut();
    boolean isFan();
    boolean isReporter();
    boolean isPhotographer();
    boolean isCameraman();
    boolean isPolice();
    /**
     * Method returns index Status
     * @return index status
     */
    Integer getStatus();

    /**
     * Set up the energy of action
     * @return the number of energy
     */
    Integer getActEnergy();

    /**
     * Method returns information about the actions
     * @return a string
     */
    String Act();
}
