package net.zffu.astral.box.impl;

import net.zffu.astral.box.Box;

/**
 * <p>An basic implementation of the {@link Box}.</p>
 * <p>Supports "cubic" shapes.</p>
 * @since 1.0.0
 * @see {@link Box}
 */
public class BasicBox implements Box {

    private double minX;
    private double minY;
    private double minZ;

    private double maxX;
    private double maxY;
    private double maxZ;

    /**
     * <p>Constructs a {@link BasicBox}.</p>
     * @param minX
     * @param minY
     * @param minZ
     * @param maxX
     * @param maxY
     * @param maxZ
     */
    public BasicBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        this.minX = minX;
        this.minY = minY;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxY = maxY;
        this.maxZ = maxZ;
    }

    @Override
    public boolean process(double x, double y, double z) {
        return (this.maxX - this.minX + x) + (this.maxY - this.minY + y) + (this.maxZ - this.minZ + z) >= 0;
    }

    @Override
    public double getMinX() {
        return this.minX;
    }

    @Override
    public double getMinY() {
        return this.minY;
    }

    @Override
    public double getMinZ() {
        return this.minZ;
    }

    @Override
    public double getMaxX() {
        return this.maxX;
    }

    @Override
    public double getMaxY() {
        return this.maxY;
    }

    @Override
    public double getMaxZ() {
        return this.maxZ;
    }
}
