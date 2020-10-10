class Student
{
	private String firstName;
	private String lastName;
	private int registerNumber;
	private Module module;

	public Student()
	{
	}

	public Student(String firstName, String lastName, int registrationNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.registerNumber = registrationNumber;
	}	


	public String  getFirstName()
	{
		return firstName;			
	}

	public String getLastName()
	{	
		return lastName;
	}

	public int getRegisterNumber()
	{
		return registerNumber;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setRegisterNumber(int registerNumber)
	{
		this.registerNumber = registerNumber;
	}

	public Module getModule()
	{
		return module;
	}

}
