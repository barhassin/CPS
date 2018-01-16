package cps.entities;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class CloseComplaintRequest.
 */
public class CloseComplaintRequest implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    
    private String complaintId;
    
    private float compensation;
    
    /**
     * Instantiates a new close complaint request.
     *
     * @param complaintId
     *            the complaint id
     * @param compensation
     *            the compensation
     */
    public CloseComplaintRequest(String complaintId, float compensation)
    {
	this.complaintId = complaintId;
	this.compensation = compensation;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
	return "Complaint Id: " + complaintId + "\nCompensation: " + compensation;
    }
    
    /**
     * Gets the compensation.
     *
     * @return the compensation
     */
    public float getCompensation()
    {
	return compensation;
    }
    
    /**
     * Gets the complaint id.
     *
     * @return the complaint id
     */
    public String getComplaintId()
    {
	return complaintId;
    }
}
