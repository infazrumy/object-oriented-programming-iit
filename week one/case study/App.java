import java.util.ArrayList;
import java.util.Scanner;

class App{

	private static Scanner scanner = new Scanner(System.in);
	private static final ArrayList<Student> STUDENTS = new ArrayList<Student>();
	
	public static void main(String[] args){
		menu();
	}
	

	public static void menu(){
		boolean isUserStop = true;
		String userInput = "";

		System.out.println("---- Student Grading System ----\n");

		while (isUserStop){

			System.out.println("\n1. Enter Students\n2. Display Students Grades \n3. Display Retake Students "+
					"\n4. Display Components Average\n5. Display Highest Components Marks\n6. Display Supplement Students\n"+
					"Q to Exit\n");

			System.out.print("Please select a number: ");
			userInput = scanner.next();

			switch (userInput) {
				case "1":
					enterStudentInfo();
					break;
				case "2":
					Student.studentGradeSummery(STUDENTS);
					break;
				case "3":
					Student.moduleRetakeStudents(STUDENTS);
					break;
				case "4":
					Module.moduleComponentsAverage(STUDENTS);
					break;
				case "5":
					Module.highestComponentMarks(STUDENTS);
					break;
				case "6":
					Student.supplementExamStudents(STUDENTS);
					break;
				default:
					if(userInput.equals("Q")){
						isUserStop = false;
					}else{
						System.out.println("Invalid Selection");
					}
			}
		}
	}


	public static void enterStudentInfo(){
		
		boolean isUserStop = true;
		String userInput = "";

		while (isUserStop){
			
			System.out.print("Press 'A' to add student 'Q' to stop: ");
			userInput = scanner.next();

			if(userInput.equals("A")){

				System.out.print("Please enter the first name: ");
				String firstName = scanner.next();

				System.out.print("Please enter the last name: ");
				String lastName = scanner.next();

				System.out.print("Please enter the Registration number: ");
				int registrationNumber = scanner.nextInt();

				Student student = new Student(firstName, lastName, registrationNumber);

				System.out.print("Please enter Minor Assignment 01 Marks: ");
				int minorAssignmentOne = scanner.nextInt();

				System.out.print("Please enter Minor Assignment 02 Marks: ");
				int minorAssignmentTwo = scanner.nextInt();

				student.getModule().setMinorAssignment(minorAssignmentOne, minorAssignmentTwo);

				System.out.print("Please enter Design marks for the Project: ");
				int designMarks = scanner.nextInt();

				System.out.print("Please enter Implementation marks for the Project: ");
				int implementationMarks = scanner.nextInt();

				student.getModule().setProjectMarks(designMarks, implementationMarks);

				System.out.print("Please enter the Final Exam marks: ");
				int finalExam = scanner.nextInt();

				student.getModule().setFinalExam(finalExam);

				STUDENTS.add(student);

			}else if (userInput.equals("Q")){
				System.out.println("Exited from entering student details...");
				isUserStop = false;
				break;
			}else {
				System.out.println("Invalid Selection");
			}
		}
		
	}

}
