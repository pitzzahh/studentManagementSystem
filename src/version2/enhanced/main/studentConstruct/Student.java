package version2.enhanced.main.studentConstruct;

import annotations.note;

public class Student {

    private String id;
    private String firstName;  
    private String lastName; 
    private byte age;
    private String gender;
    private String school; 
    private String course;

    @note(description = "public constructor" +
                 "this allows any other packages from using this Class" +
                 "this is the parent Class of all Classes that uses this Class")
    public Student() {
	    super();
    }
 
    @note(description = "Getters")
    public String getId() {
	    return id;
    }

    public String getFirstName() {
	    return firstName;
    }

    public String getLastName() {
	    return lastName;
    }

    public byte getAge() {
	    return age;
    }

    public String getGender() {
	    return gender;
    }

    public String getSchoolName() {
	    return school;
    }

    public String getCourseName() {
	    return course;
    }

    @note(description = "Setters")
    public void setLrn(String lrn) {
	    this.id = lrn;
    }

    public void setFirstName(String firstName) {
	    this.firstName = firstName;
    }

    public void setLastName(String lastName) {
	    this.lastName = lastName;
    }

    public void setAge(byte age) {
	    this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setSchoolName(String learningModality) {
	    this.school = learningModality;
    }

    public void setCourseName(String classSection) {
	    this.course = classSection;
    }

    /**
     *
     *
     * 		 default value: exportChoiceLoop = true
     * @return a string representation of the students in the ArrayList studentsList
     */
    @note(description = "method used in showing the list of students in the ArrayList studentsList" +
                 "also used when exporting the list into a txt file")
    @Override
    public String toString() {
        return ":---------------------------------------------:" +
                "\n" +
                "     Student ID   : " +  id +
                "\n" +
                "     FirstName    : " + firstName +
                "\n" +
                "     LastName     : " + lastName +
                "\n" +
                "     Age          : " + age +
                "\n" +
                "     Gender       : " + gender +
                "\n" +
                "     School       : " + school +
                "\n" +
                "     Course       : " + course +
                "\n" +
                ":---------------------------------------------:";
	}
}
