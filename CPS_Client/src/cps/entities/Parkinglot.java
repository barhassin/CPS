package cps.entities;

import java.io.Serializable;

import cps.entities.enums.ParkinglotStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class Parkinglot.
 */
public class Parkinglot implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    
    private final int depth = 3;
    
    private final int height = 3;
    
    private int width;
    
    private String parkinglotName;
    
    private int totalSpotsNumber;
    
    private ParkinglotStatus status;
    
    private float guestRate;
    
    private float inAdvanceRate;
    
    /**
     * Instantiates a new parkinglot.
     *
     * @param parkinglotName
     *            the parkinglot name
     * @param width
     *            the width
     * @param status
     *            the status
     * @param guestRate
     *            the guest rate
     * @param inAdvanceRate
     *            the in advance rate
     */
    public Parkinglot(String parkinglotName, int width, ParkinglotStatus status, float guestRate, float inAdvanceRate)
    {
	this.parkinglotName = parkinglotName;
	this.width = width;
	this.status = status;
	this.guestRate = guestRate;
	this.inAdvanceRate = inAdvanceRate;
	
	this.totalSpotsNumber = depth * height * width;
    }
    
    /**
     * Gets the depth.
     *
     * @return the depth
     */
    public int getDepth()
    {
	return depth;
    }
    
    /**
     * Gets the guest rate.
     *
     * @return the guest rate
     */
    public float getGuestRate()
    {
	return guestRate;
    }
    
    /**
     * Gets the height.
     *
     * @return the height
     */
    public int getHeight()
    {
	return height;
    }
    
    /**
     * Gets the in advance rate.
     *
     * @return the in advance rate
     */
    public float getInAdvanceRate()
    {
	return inAdvanceRate;
    }
    
    /**
     * Gets the parkinglot name.
     *
     * @return the parkinglot name
     */
    public String getParkinglotName()
    {
	return parkinglotName;
    }
    
    /**
     * Gets the status.
     *
     * @return the status
     */
    public ParkinglotStatus getStatus()
    {
	return status;
    }
    
    /**
     * Gets the total spots number.
     *
     * @return the total spots number
     */
    public int getTotalSpotsNumber()
    {
	return totalSpotsNumber;
    }
    
    /**
     * Gets the width.
     *
     * @return the width
     */
    public int getWidth()
    {
	return width;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Parkinglot name: " + parkinglotName + "\nWidth: " + width + "\nStatus: " + status + "\nGuest rate: "
		+ guestRate + "\nInAdvance rate: " + inAdvanceRate + "\nTotal spots: " + totalSpotsNumber;
    }
}
