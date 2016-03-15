
/**
 * 
 */

/**
 * @author smcarik
 *
 */
public abstract class Person {
	
	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private char activated;
	private char type;

	/**
	 * @param fName
	 * @param lName
	 * @param uName
	 * @param pWord
	 * @param activated
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
	
	public Person(){
		fName = "";
		lName = "";
		uName = "";
		pWord = "";
		activated = 'y';
		type = '\u0000';	
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * @return the pWord
	 */
	public String getpWord() {
		return pWord;
	}
	/**
	 * @param pWord the pWord to set
	 */
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	/**
	 * @return the activated
	 */
	public char getActivated() {
		return activated;
	}
	/**
	 * @return the type
	 */
	public char getType()
	{
		return type;
	}
	
	public void setActivated()
	{
		if(type=='u')
			activated = 'y';
		else
			activated = 'n';
	}
	
	public void setActivated(char activation)
	{
		if(activation=='y' || activation=='n')
		{
			activated = activation;
		}
		else { System.out.println("You done entered an invalid acivation"); }
	}
	
	public void setType()
	{
		if(type=='u')
			type = 'a';
		else
			type = 'u';
	}
	
	public void setType(char type)
	{
		if(type=='u'|| type=='a')
			this.type = type;
		else { System.out.println("You done entered an invalid type"); }
	}
}
