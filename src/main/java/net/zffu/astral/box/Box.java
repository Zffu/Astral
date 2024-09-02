package net.zffu.astral.box;

/**
 * <p>The base of a bounding box in the Astral API.</p>
 * @since 1.0.0
 */
public interface Box {

    /**
     * <p>Processes the box to see if the given coordinate is inside of the box.</p>
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     * @return true or false.
     */
    boolean process(double x, double y, double z);

    /**
     * <p>Gets the minimum x coordinate of the box.</p>
     * @return a double
     */
    double getMinX();

    /**
     * <p>Gets the minimum y coordinate of the box.</p>
     * @return a double
     */
    double getMinY();

    /**
     * <p>Gets the minimum z coordinate of the box.</p>
     * @return a double
     */
    double getMinZ();


    /**
     * <p>Gets the maximum x coordinate of the box.</p>
     * @return a double
     */
    double getMaxX();

    /**
     * <p>Gets the maximum y coordinate of the box.</p>
     * @return a double
     */
    double getMaxY();

    /**
     * <p>Gets the maximum z coordinate of the box.</p>
     * @return a double
     */
    double getMaxZ();

}
