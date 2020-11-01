import java.util.ArrayList;

class Module {

	private int minorAssignmentOne;
	private int minorAssignmentTwo;
	private int projectDesign;
	private int projectImplementation;
	private int finalExam;
	private int marks;

	private String grade;

	public void setMinorAssignment(int minorAssignmentOne, int minorAssignmentTwo){
		this.minorAssignmentOne = minorAssignmentOne;
		this.minorAssignmentTwo = minorAssignmentTwo;
	}

	public int getMinorAssignmentMarks(){
		return this.minorAssignmentOne + this.minorAssignmentTwo;
	}

	public void setProjectMarks(int projectDesign, int projectImplementation){
		this.projectDesign = projectDesign;
		this.projectImplementation = projectImplementation;
	}

	public int getProjectMarks(){
		return this.projectDesign + this.projectImplementation;
	}

	public void setFinalExam(int finalExam){
		this.finalExam = finalExam;
	}

	public int getFinalExamMarks(){
		return this.finalExam;
	}

	public int getMarks(){

		int marks = 0;
		//15% of the final marks are allocated for the Minor assignment
		marks = marks + (this.minorAssignmentOne*6/100);
		marks = marks + (this.minorAssignmentTwo*9/100);

		//35% of the final marks are allocated for the Project
		marks = marks + (this.projectDesign*15/100);
		marks = marks + (this.projectImplementation*20/100);

		//50% of the final marks are allocated for the final exam
		marks = marks +  (this.finalExam*50/100);

		return marks;
	}

	public String getGrade(){

		int finalMarks = getMarks();
		if(this.finalExam > 50){
			if(finalMarks>=80){
				this.grade = "Higher Distinction";
			}
			else if(finalMarks>=70){
				this.grade = "Distinction";
			}
			else if(finalMarks>=60){
				this.grade = "Credit";
			}
			else if(finalMarks>=50){
				this.grade = "Pass";
			}
			else {
				this.grade = "Fail";
			}
		}else {
			this.grade = "I";
		}
		return this.grade;
	}

	/**
	 * This method prints the average marks for the all components
	 * @param students ArrayList
	 */
	public static void moduleComponentsAverage(ArrayList<Student> students){

		int totalMinorAssignmentMarks = 0;
		int totalProjectMarks = 0;
		int totalFinalExamMarks = 0;

		for (Student student : students) {
			totalMinorAssignmentMarks = totalMinorAssignmentMarks + student.getModule().getMinorAssignmentMarks()*15/100;
			totalProjectMarks = totalProjectMarks + student.getModule().getProjectMarks()*35/100;
			totalFinalExamMarks = totalFinalExamMarks + student.getModule().getFinalExamMarks()*50/100;
		}

		System.out.println("Average for Minor AssignmentMarks: " + totalMinorAssignmentMarks/students.size());
		System.out.println("Average for Projects Marks: " + totalProjectMarks/students.size());
		System.out.println("Average for Final Exam Marks: " + totalFinalExamMarks/students.size());
	}

	/**
	 * This method loop through the students list and print the highest marks student
	 * @param students ArrayList
	 */
	public static void highestComponentMarks(ArrayList<Student> students){

		Student highestMarksForMinorAssignment = students.get(0);
		Student highestMarksForProject = students.get(0);
		Student highestMarksForFinalExam = students.get(0);

		for (Student student : students) {
			if(highestMarksForMinorAssignment.getModule().getMinorAssignmentMarks() < student.getModule().getMinorAssignmentMarks()){
				highestMarksForMinorAssignment = student;
			}

			if(highestMarksForProject.getModule().getProjectMarks() < student.getModule().getProjectMarks()){
				highestMarksForProject = student;
			}

			if(highestMarksForFinalExam.getModule().getFinalExamMarks() < student.getModule().getFinalExamMarks()){
				highestMarksForFinalExam = student;
			}
		}

		System.out.println("Highest Marks for Minor Assignment: " + highestMarksForMinorAssignment.getModule().getMinorAssignmentMarks()*15/100 + ", " +
				"Name: " + highestMarksForMinorAssignment.getFirstName() + " " + highestMarksForMinorAssignment.getLastName());

		System.out.println("Highest Marks for Project: " + highestMarksForProject.getModule().getProjectMarks()*35/100 + ", " +
				"Name: " + highestMarksForProject.getFirstName() + " " + highestMarksForProject.getLastName());

		System.out.println("Highest Marks for Final Exam: " + highestMarksForFinalExam.getModule().getFinalExamMarks()*50/100 + ", " +
				"Name: " + highestMarksForFinalExam.getFirstName() + " " + highestMarksForFinalExam.getLastName());
	}

}
