import java.util.ArrayList;

class Student{
	
	private String firstName;
	private String lastName;
	private int registerNumber;
	private Module module;

	public Student(){
	}

	public Student(String firstName, String lastName, int registrationNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.registerNumber = registrationNumber;
		this.module = new Module();
	}	


	public String  getFirstName(){
		return firstName;			
	}

	public String getLastName(){	
		return lastName;
	}

	public Module getModule(){
		return module;
	}

	public static void moduleRetakeStudents(ArrayList<Student> students){

		System.out.println("\nModule re-take Students\n");
		int studentCount = 0;

		for (Student student : students) {
			if(student.getModule().getMarks() < 50) {
				System.out.println(student.getFirstName() +" "+student.getLastName());
				studentCount++;
			}
		}

		if(studentCount==0){
			System.out.println("No Student to Display");
		}
	}

	public static void supplementExamStudents(ArrayList<Student> students){

		System.out.println("\nSupplement Students\n");
		int studentCount = 0;

		for (Student student : students) {
			if(student.getModule().getGrade().equals("I")){
				System.out.println(student.getFirstName() +" "+student.getLastName());
				studentCount++;
			}
		}

		if(studentCount==0){
			System.out.println("No Student to Display");
		}
	}

	public static void studentGradeSummery(ArrayList<Student> students){

		for (Student student : students) {
			if(!(student.getModule().getGrade().equals("I")) && !(student.getModule().getGrade().equals("Fail"))){
				System.out.println(student.getFirstName() +" "+student.getLastName()+"\t\t"+student.getModule().getMarks()+
						"\t\t"+student.getModule().getGrade());
			}
		}

	}
}
