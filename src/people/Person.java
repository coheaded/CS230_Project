package people;
/**
 * Abstract Class of a person containing first name, last name, user name , password, activated, and type
 * @author smcarik, ldschramel, ccnoecker, a1noack
 * @version 3.15.16
 */
public abstract class Person {
	
	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private char activated;
	private char type;

	/**
	 * constructor creates a person object
	 * @param fName persons first name
	 * @param lName persons last name
	 * @param uName persons user name
	 * @param pWord persons password
	 * @param activated persons activation status
	 */
	public Person(String fName, String lName, String uName, String pWord, char type, char activated) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pWord = pWord;
		this.activated = activated;
		this.type = type;
	}
	
	/**
	 * default constructor for person
	 */
	public Person(){
		fName = "";
		lName = "";
		uName = "";
		pWord = "";
		activated = 'y';
		type = '\u0000';	
	}
	
	/**
	 * gets the persons first name
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * sets the persons first name
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	/**
	 * gets the persons last name 
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	
	/**
	 * sets the persons last name
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	/**
	 * gets the persons user name
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * gets the persons password
	 * @return the pWord
	 */
	public String getpWord() {
		return pWord;
	}
	/**
	 * sets the persons password
	 * @param pWord the pWord to set
	 */
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	/**
	 * gets the persons activation status
	 * @return the activated
	 */
	public char getActivated() {
		return activated;
	}
	/**
	 * gets the persons type
	 * @return the type
	 */
	public char getType()
	{
		return type;
	}
	/**
	 * changes the activation status of the person
	 */
	public void setActivated()
	{
		if(type=='u')
			activated = 'y';
		else
			activated = 'n';
	}
	/**
	 * sets the activation status of the person
	 * @param activation
	 */
	public void setActivated(char activation)
	{
		if(activation=='y' || activation=='n')
		{
			activated = activation;
		}
		else { System.out.println("You done entered an invalid acivation"); }
	}
	
	/**
	 * changes the type of the person
	 */
	public void setType()
	{
		if(type=='u')
			type = 'a';
		else
			type = 'u';
	}
	
	/**
	 * sets the type of the person
	 * @param type persons new type
	 */
	public void setType(char type)
	{
		if(type=='u'|| type=='a')
			this.type = type;
		else { System.out.println("You done entered an invalid type"); }
	}
}
