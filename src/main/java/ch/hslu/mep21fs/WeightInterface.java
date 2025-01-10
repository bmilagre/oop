package ch.hslu.mep21fs;

interface WeightInterface {
    /**
     * Max amount of weight.
     */
    public double maxWeight = 2000;

    /**
     * Minimal amount of weight.
     */
    public double minWeight = 0.01;

    /**
     * Relevant position of weight.
     */
    public int relevantPositionOfWeight = 3;

    /**
     * Returns the saved weight.
     * @return int
     */
    public Double getWeight();
}
