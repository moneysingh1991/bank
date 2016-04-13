package cs_146_project;
/**
 * This class contains the basic information from
 * client of a bank
 */
public class Client
{
	private String firstName; // first name of the client
	private String lastName; // last name of the client
	private String socialSecurityNumber; // social security number of the client
	private String address; //address of the client
	private long id;  // id of the client
	private String phoneNumber; // phone number of the client
        private String email;
        private String dob;
	
	/**
	 * Constructor that creates a client object
	 * @param firstName the first name of the client
	 * @param lastName the last name of the client
	 * @param socialSecurityNumber the social security number of the clet
	 * @param address the address of the clint
	 * @param id the id of the client
	 * @param phoneNumber the phone number of the client
	 */
	public Client(String firstName, String lastName, String socialSecurityNumber, String address, long id, String phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}
        
        public Client() {
            
        }
	
	/**
	 * Gets the first name of the client
	 * @return the first name of the client
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Gets the last name of the client
	 * @return the last name of the client
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Gets the Social number of the client
	 * @return the Social number of the client
	 */
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	/**
	 * Gets the address of the client
	 * @return the address of the client
	 */
	public String address()
	{
		return address;
	}
	
	/**
	 * Gets the id of the client
	 * @return the id of the client
	 */
	public long getId()
	{
		return id;
	}
	
	/**
	 * Gets the phone number of the client
	 * @return the phone number of the client
	 */
	public String getPhoneNumbe()
	{
		return phoneNumber;
	}
	
	/**
	 * Sets a new first name
	 * @param newFirstName the new first name
	 */
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	
	/**
	 * Sets a new last name
	 * @param newLastName the new last name
	 */
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	
	/**
	 * Sets a new Social security number
	 * @param newSsn the new social security number
	 */
	public void setSocialSecurityNumber(String newSsn)
	{
		socialSecurityNumber = newSsn;
	}
	
	/**
	 * Sets a new adress
	 * @param newAddress the new adress
	 */
	public void setAddress(String newAddress)
	{
		address = newAddress;
	}
	
	/**
	 * Sets a new id
	 * @param newId the new id
	 */
	public void setId(long newId)
	{
		id = newId;
	}
	
	/**
	 * Sets a new phone number
	 * @param newPhoneNumber the new phone number
	 */
	public void setPhoneNumber(String newPhoneNumber)
	{
		phoneNumber = newPhoneNumber;
	}
        
        public void setEmail(String email) {
            this.email = email;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setDob(String dob) {
            this.dob = dob;
        }
        
        public String getDob() {
            return dob;
        }
}

