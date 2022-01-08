package version2.enhanced.processes.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import version2.enhanced.main.studentConstruct.Student;

/**
 * @author Peter John Arao
 * @version 2.0
 */
public class SortProcessing {

    /*
     * private constructor
     */
    private SortProcessing() {
    }
    /**  
     * @note Method that sorts students ID in Ascending order
     * @param studentList that takes the studentList array
     */
    public static void sortIdAscending(final ArrayList<Student> studentList) {
        studentList.sort(Comparator.comparing(Student::getId));
    }
    /**
     * @note Method that sorts students ID in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortIdDescending(final ArrayList<Student> studentList) {
        studentList.sort((object1, object2) -> object2.getId().compareTo(object1.getId()));
    }
    /** 
     * @note Method that sorts students LastName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortLastNameAscending(final ArrayList<Student> studentList) {
	    studentList.sort(Comparator.comparing(Student::getLastName));
    }
    /** 
     * @note Method that sorts students LastName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortLastNameDescending(final ArrayList<Student> studentList) {
	    studentList.sort((object1, object2) -> object2.getLastName().compareTo(object1.getLastName()));
    }	
    /** 
     * @note Method that sorts students FirstName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortFirstNameAscending(final ArrayList<Student> studentList) {
	    studentList.sort(Comparator.comparing(Student::getFirstName));
    }
    /** 
     * @note Method that sorts student FirstName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortFirstNameDescending(final ArrayList<Student> studentList) {
	    studentList.sort((object1, object2) -> object2.getFirstName().compareTo(object1.getFirstName()));
    }
    /** 
     * @note Method that sorts students Age in Ascending order
     * @param studentList that takes the studentList array
     */
    public static void sortAgeAscending(final ArrayList<Student> studentList) {
        studentList.sort(Comparator.comparingInt(Student::getAge));
    }
    /** 
     * @note Method that sorts students Age in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortAgeDescending(final ArrayList<Student> studentList) {
        studentList.sort((object1, object2) -> Byte.compare(object2.getAge(), object1.getAge()));
    }
    /** 
     * @note Method that sorts students Gender in Ascending order
     * @param studentList that takes the studentList array
     */
    public static void sortGenderAscending(final ArrayList<Student> studentList) {
	    studentList.sort(Comparator.comparing(Student::getGender));
    }
    /** 
     * @note Method that sorts student Gender in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortGenderDescending(final ArrayList<Student> studentList) {
	    studentList.sort((object1, object2) -> object2.getGender().compareTo(object1.getGender()));
    }
    /** 
     * @note Method that sorts students SchoolName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortSchoolNameAscending(final ArrayList<Student> studentList) {
        studentList.sort(Comparator.comparing(Student::getSchoolName));
    }
    /** 
     * @note Method that sorts student SchoolName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortSchoolNameDescending(final ArrayList<Student> studentList) {
	    studentList.sort((object1, object2) -> object2.getSchoolName().compareTo(object1.getSchoolName()));
    }
    /** 
     * @note Method that sorts students CourseName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortCourseNameAscending(final ArrayList<Student> studentList) {
	    studentList.sort(Comparator.comparing(Student::getCourseName));
    }
    /** 
     * @note Method that sorts student CourseName in Descending order
     * @param studentList that takes the studentList array
     */
    public static void sortCourseNameDescending(final ArrayList<Student> studentList) {
        studentList.sort((object1, object2) -> object2.getCourseName().compareTo(object1.getCourseName()));
    }
}
