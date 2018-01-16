package cps.entities;

// TODO: Auto-generated Javadoc
/**
 * The Class MemberIdentifyingInformation.
 */
public class MemberIdentifyingInformation
{
    
    private String carNumber;
    
    private String subscriptionId;
    
    /**
     * Instantiates a new member identifying information.
     *
     * @param subscriptionId
     *            the subscription id
     * @param carNumber
     *            the car number
     */
    public MemberIdentifyingInformation(String subscriptionId, String carNumber)
    {
	this.carNumber = carNumber;
	this.subscriptionId = subscriptionId;
    }
    
    /**
     * Gets the car number.
     *
     * @return the string
     */
    public String GetCarNumber()
    {
	return carNumber;
    }
    
    /**
     * Gets the subscription id.
     *
     * @return the string
     */
    public String GetSubscriptionId()
    {
	return subscriptionId;
    }
}
