package version1;

public class Student extends CallingStudents{
	
	private String firstName;  
	private String lastName; 
	private String gender; 
	private String learningModality; 
	private String classSection;
	private static byte numberOfStudents;
	
	public Student(String firstName, String lastName, String gender, String learningModality, String classSection) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGender(gender);
		this.setLearningModality(learningModality);
		this.setClassSection(classSection);
		numberOfStudents++;
	
	}
	static String numberOfStudent() {
		return "Number of Students: "+(byte)numberOfStudents;
	}
	// Getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getLearningModality() {
		return learningModality;
	}
	public String getClassSection() {
		return classSection;
	}
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLearningModality(String learningModality) {
		this.learningModality = learningModality;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	// returns string values
	public String toString() {
		return "LastName: "+lastName+"\n"
				  +"FirstName: "+firstName+"\n"
				  +"Gender: "+gender+"\n"
				  +"LearningModality: "+learningModality+"\n"
				  +"ClassSection: "+classSection;
	}
}
