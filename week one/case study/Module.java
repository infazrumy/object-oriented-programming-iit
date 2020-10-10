class Module
{
	private String moduleName;
	private int minorAssignmentOne;
	private int minorAssignmentTwo;
	private int projectDesign;
	private int projectImplementation;
	private int finalExam;
	private int finalMarks;

	public String  getModuleName()
	{
		return moduleName;
	}

	public void setModuleName(String moduleName)
	{
		this.moduleName = moduleName;
	}

	public int getMinorAssignmentOne()
	{
		return minorAssignmentOne;
	}
	
	public void setMinorAssignmentOne(int minorAssignmentOne)
	{
		this.minorAssignmentOne = minorAssignmentOne;
	}
	
	public int getMinorAssignmentTwo()
	{
		return minorAssignmentTwo;
	}
	
	public void setMinorAssignmentTwo(int minorAssignmentTwo)
	{
		this.minorAssignmentTwo = minorAssignmentTwo;
	}

	public int getProjectDesign()
	{
		return projectDesign;
	}
	
	public void setProjectDesign(int projectDesign)
	{
		this.projectDesign = projectDesign;
	}

	public int getProjectImplementation()
	{
		return projectImplementation;
	}
	
	public void setProjectImplementation(int projectImplementation)
	{
		this.projectImplementation = projectImplementation;
	}

	public int getFinalExam()
	{
		return finalExam;
	}
	
	public void setFinalExam(int finalExam)
	{
		this.finalExam = finalExam;
	}

	public int getFinalMarks()
	{
		return finalMarks;
	}
	
	public void setFinalMarks(int finalMarks)
	{
		this.finalMarks = finalMarks;
	}


	public void calculateFinalMarks()
	{
	 	finalMarks = finalExam * (50/100);
	}

	

}
