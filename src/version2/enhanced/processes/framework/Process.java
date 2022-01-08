package version2.enhanced.processes.framework;

import java.io.File;
import annotations.note;
import java.util.Scanner;
import annotations.fixed;
import java.util.Objects;
import annotations.problem;
import version2.enhanced.constants.Constants;
import java.util.ArrayList;
import version2.enhanced.processes.validation.Checker;
import java.util.concurrent.TimeUnit;
import version2.enhanced.main.studentConstruct.Student;
import version2.enhanced.processes.sorting.SortProcessing;
import version2.enhanced.processes.importingAndExporting.FileProcessing;

public class Process {

	@note(description = "field used to store the user sorting choice, default value: sortingChoice = 0")
	private static byte sortingChoice = 0;

	@note(description = "field used in importList method, default value: importing = true")
	private static boolean importing = true;

	@note(description = "field used in storing the path used in importing, default value: importPath = \"\"")
	private static String importPath = "";

	@note(description = "field used in storing the file name used in importing, default value: importFileName = \"\"")
	private static String importFileName = "";

	@note(description = "field used to check if the user input matches this field" +
			"default value: YES")
	private static final String FIRST_RESPONSE = "YES";

	@note(description = "field used to check if the user input matches this field" +
			"default value: NO")
	private static final String SECOND_RESPONSE = "NO";


	@note(description = "field used in MainActivity class, enhanced.main method " +
			"Process class, importList method, resetMain method" +
			"stores the user choice in importList method" +
			"default value: importErrorResponse = u0000")
	public static char importErrorResponse;

	@note(description = "field used in exportList method, default value: exporting = true")
	private static boolean exporting = true;

	@note(description = "field used in storing the path used in exporting, default value: exportPath = \"\"")
	private static String exportPath = "";

	@note(description = "field used in storing the file name used in exporting, default value: exportFileName = \"\"")
	private static String exportFileName = "";

	@note(description = "field used in MainActivity class, enhanced.main method " +
			"Process class, exportList method, resetMain method" +
			"stores the user choice in exportList method" +
			"default value: exportErrorResponse = u0000")
	public static char exportErrorResponse;

	@note(description = "field used in createStudent method" +
				 		"used in adding a studentId loop" +
				 		"default value: addStudentId = true")
	private static boolean addStudentId = true;

	@note(description = "field used in createStudent method" +
				 		"used in adding a first name loop" +
				 		"default value: addFirstName = true")
	private static boolean addFirstName = true;

	@note(description = "field used in createStudent method" +
				 		"used in adding a last name loop" +
				 		"default value: addLastName = true")
	private static boolean addLastName = true;

	@note(description = "field used in createStudent method" +
				 		"used in adding an age loop" +
				 		"default value: addAge = true")
	private static boolean addAge = true;

	@note(description = "field used in createStudent method" +
				 		"used in adding a gender loop" +
				 		"default value: addGender = true")
	private static boolean addGender = true;

	@note(description = "field used in createStudent method" +
				 		"used in adding a school loop" +
				 		"default value: addSchool = true")
	private static boolean addSchool = true;

	@note(description = "field used in createStudent method" +
						"used in adding a course loop" +
						"default value: addCourse = true")
	private static boolean addCourse = true;

	@note(description = "field used in sortStudentList method, default value: emptySortingLoopChoice = false")
	private static boolean emptySortingLoopChoice = false;

	@note(description = "field used in removeInTheList method, default value: removeLrn = false")
	private static boolean removeLrn;

	@note(description = "field used in sortStudentList method, default value: sorting = true")
	private static boolean sorting = true;

	@note(description = "field used in sortStudentList method, default value: nextStep = true")
	private static boolean nextStep = true;

	@note(description = "field used in sortStudentList method, default value: empty = true")
	private static boolean empty = true;

	@note(description = "field used in createStudent method, default value: lrnResponse = \"\"")
	private static String lrnResponse = "";

	@note(description = "field used in createStudent method and addList method, default value: invalidId = false")
	private static boolean invalidId = false;

	@note(description = "field used in removeInTheList method, default value: invalidIdDeletion = false")
	private static boolean invalidIdDeletion;

	@note(description = "field used in MainActivity class, enhanced.main method " +
						"Process class, resetMain method" +
						"boolean field used when checking if the enhanced.main interface choice is valid or not" +
						"default value: isValidMainChoice = false")
	public static boolean isValidMainChoice = false;

	@note(description = "field used in MainActivity class, enhanced.main method " +
						"Process class, importList method, resetMain method" +
						"boolean field used in looping through the choice of the user in the enhanced.main interface" +
						"default value: choiceCheck = true")
	public static boolean choiceCheck = true;

	@note(description = "field used in MainActivity class, enhanced.main method " +
						"Process class, importList method, resetMain method" +
						"boolean field used in looping the whole program" +
						"default value: isNotExit = true")
	public static boolean isNotExit = true;

	@note(description = "field used in MainActivity class, enhanced.main method " +
			"Process class, exportList method, resetMain method" +
			"boolean variable used in looping when exporting" +
			"default value: exportFileTypeChoice = 0")
	public static byte exportFileTypeChoice;

	@note(description = "field used in MainActivity class, enhanced.main method " +
						"Process class, importList method, resetMain method" +
						"boolean variable used in looping when importing" +
						"default value: importChoiceLoop = true")
	public static boolean importChoiceLoop = true;

	@note(description = "field used in MainActivity class, enhanced.main method " +
						"Process class, exportList method, resetMain method" +
						"boolean variable used in looping when exporting" +
						"default value: exportChoiceLoop = true")
	public static boolean exportChoiceLoop = true;

	@note(description = "field used in MainActivity class, enhanced.main method " +
						"Process class, importList method, resetMain method" +
						"boolean variable used in looping when importing" +
						"default value: importFileTypeChoice = 0")
	public static byte importFileTypeChoice;

	@note(description = "field used in MainActivity class, enhanced.main method" +
						"Process class, resetMain method" +
						"stores the user choice from the enhanced.main interface" +
						"default value: mainChoice = 0")
	public static byte mainChoice;

	@note(description = "identifier for the Scanner object")
	static Scanner userInput;

	@note(description = "storing student list into an ArrayList studentsList, the data type is the Student class" +
						"array size: 200")
	public static ArrayList<Student> studentsList = new ArrayList<>(200);

	@note(description = "private constructor, this prevents any other packages from using this Class")
	private Process() {
	}

	@note(description = "method that creates the student information then returning it" +
						"returns a student object to be added in the array" +
						"returns null if the user did not proceed in the middle of execution of this method")
	private static Student createStudent() throws InterruptedException {

		Student student = new Student();
		String temporaryString;

		while (addStudentId) {
			System.out.println(":-----------------------------:");
			System.out.println(":         Student ID          : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			temporaryString = userInput.nextLine().trim();

			if (temporaryString.matches("[0-9]+") && ( temporaryString.length() == 10 || temporaryString.length() == 11 || temporaryString.length() == 12) ) {
				if (isIdExisted(temporaryString)) {
					System.out.println(":THIS ID IS ALREADY EXISTED(!):");
					tryAgain();
				}
				else {
					resetConditions();
					student.setLrn(temporaryString);
					addStudentId = false;
				}
			}
			else {
				System.out.println("\n : STUDENT ID MUST BE 10 or 11 or 12 NUMBERS (!) :");
				System.out.println("          : PLEASE TRY AGAIN :           ");
				tryAgain();
			}
		}
		// FirstName
		while (addFirstName) {
			System.out.println(":-----------------------------:");
			System.out.println(":     Student FirstName       : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			temporaryString = userInput.nextLine().trim();

			if (temporaryString.length() != 0) {
				if (Checker.isInteger(temporaryString)) {
					System.out.println();
					line();
					System.out.println("        : A FIRST NAME IS NOT A NUMBER :       ");
					line();
				}
				else if(temporaryString.matches("[!@#$%^&*()]+")) {
					line();
					System.out.println("   : PLEASE ENTER YOUR FIRST NAME PROPERLY :   ");
					line();
				}
				else {
					student.setFirstName(temporaryString);
					addFirstName = false;
				}
			}
			else {
				line();
				System.out.println("        : PLEASE DO NOT LEAVE IT BLANK (!) :   ");
				line();
			}
		}
		// LastName
		while (addLastName) {
			System.out.println(":-----------------------------:");
			System.out.println(":      Student LastName       : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			temporaryString = userInput.nextLine().trim();

			if (temporaryString.length() != 0) {
				if (Checker.isInteger(temporaryString)) {
					System.out.println();
					line();
					System.out.println("        : A LAST NAME IS NOT A NUMBER :        ");
					line();
				}
				else if(temporaryString.matches("[!@#$%^&*()]+")) {
					line();
					System.out.println("   : PLEASE ENTER YOUR LAST NAME PROPERLY :    ");
					line();
				}
				else {
					student.setLastName(temporaryString);
					addLastName = false;
				}
			}
			else {
				line();
				System.out.println("        : PLEASE DO NOT LEAVE IT BLANK (!) :   ");
				line();
			}
		}
		// Age
		while (addAge) {
			try {
				System.out.println(":-----------------------------:");
				System.out.println(":         Student Age         : ");
				System.out.println(":-----------------------------:");
				System.out.print("   >>>>: ");

				temporaryString = userInput.nextLine().trim();
				
				if (Checker.isByte(temporaryString)) {
					if (temporaryString.length() != 0) {
						byte age = Byte.parseByte(temporaryString); // 19
						if (age > 0) {
							student.setAge(age);
							addAge = false;
						}
						else {
							line();
							System.out.println("       : A STUDENT AGE IS NOT BELOW ZERO :     ");
							line();
						}
					}
				}
				else if (Checker.isInteger(temporaryString)) {
					line();
					System.out.println("        : A STUDENT CANNOT BE THAT OLD :       ");
					line();
				}
				else if (!Checker.isByte(temporaryString)) {
					line();
					System.out.println("             : AN AGE IS A NUMBER :            ");
					line();
				}
				else {
					line();
					System.out.println("        : PLEASE DO NOT LEAVE IT BLANK (!) :   ");
					line();
				}
			}
			catch (NumberFormatException n_f_e) {
				line();
				System.out.println("             : AN AGE IS A NUMBER :            ");
				line();
			}
			// here
		}
		// Gender
		while (addGender) {
			System.out.println(":-----------------------------:");
			System.out.println(":       Student Gender        : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			temporaryString = userInput.nextLine().trim().toUpperCase();

			if (temporaryString.length() != 0) {
				if (Checker.isInteger(temporaryString)) {
					System.out.println();
					line();
					System.out.println("          : A GENDER IS NOT A NUMBER :         ");
					line();
				}
				else if(temporaryString.matches("[!@#$%^&*()]+") || temporaryString.length() <= 3) {
					line();
					System.out.println("     : PLEASE ENTER YOUR GENDER PROPERLY :     ");
					line();
				}
				else {
					student.setGender(temporaryString);
					addGender = false;
				}
			}
			else {
				line();
				System.out.println("        : PLEASE DO NOT LEAVE IT BLANK (!) :   ");
				line();
			}
		}
		// School
		while (addSchool) {
			System.out.println(":-----------------------------:");
			System.out.println(":       Student School        : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			temporaryString = userInput.nextLine().trim().toUpperCase();

			if (temporaryString.length() != 0) {
				if (Checker.isInteger(temporaryString)) {
					System.out.println();
					line();
					System.out.println("   : PLEASE ENTER YOUR SCHOOL NAME PROPERLY :  ");
					line();
				}
				else if(temporaryString.matches("[!@#$%^&*()]+")) {
					line();
					System.out.println("   : PLEASE ENTER YOUR SCHOOL NAME PROPERLY :  ");
					line();
				}
				else {
					student.setSchoolName(temporaryString);
					addSchool = false;
				}
			}
			else {
				line();
				System.out.println("        : PLEASE DO NOT LEAVE IT BLANK (!) :   ");
				line();
			}
		}
		// Course
		while (addCourse) {
			System.out.println(":-----------------------------:");
			System.out.println(":       Student Course        : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			temporaryString = userInput.nextLine().trim().toUpperCase();

			if (temporaryString.length() != 0) {
				if (Checker.isInteger(temporaryString)) {
					System.out.println();
					line();
					System.out.println("  : PLEASE ENTER YOUR COURSE NAME PROPERLY :   ");
					line();
				}
				else if(temporaryString.matches("[!@#$%^&*()]+")) {
					line();
					System.out.println("  : PLEASE ENTER YOUR COURSE NAME PROPERLY :   ");
					line();
				}
				else {
					student.setCourseName(temporaryString);
					addCourse = false;
				}
			}
			else {
				line();
				System.out.println("        : PLEASE DO NOT LEAVE IT BLANK (!) :   ");
				line();
			}
		}

		if(lrnResponse.equals("YES") && !invalidId) {
			System.out.print("                  : ADDING :");
			delay();
		}
		else if (lrnResponse.equals("NO")) {
			System.out.print(' ');
		}
		else {
			if (lrnResponse.isBlank() && (invalidId && lrnResponse.matches("[!@#$%^&*()a-zA-Z]+")) ) {
				System.out.print(' ');
			}
			else if(lrnResponse.isBlank() && invalidId) {
				System.out.print(' ');
			}
			else if(invalidId) {
				System.out.print(' ');
			}
			else {
				System.out.print("                  : ADDING :");
				delay();
			}
		}
		return student;
	}

	private static void tryAgain() throws InterruptedException {
		System.out.println("Do you want to try again?");
		System.out.println("YES or NO");
		System.out.print("   >>>>: ");
		lrnResponse = userInput.nextLine().toUpperCase().trim();
		if (lrnResponse.equals("YES")) {
			System.out.print("\t\t : PROCEEDING :");
			delay();
		}
		else if (lrnResponse.equals("NO")) {
			System.out.print(": REDIRECTING TO MAIN MENU :");
			Process.delay();
			negateCreateStudentFunction();
			removeLrn = false;
		}
		else {
			line();
			System.out.println("              : INVALID INPUT (!) :            ");
			line();
			negateCreateStudentFunction();
			invalidId = true;
		}
	}
	// end of createStudent() method
	/** 
	 * @note method that Exports the list of Student, asks for the directory to be saved and its file name
	 *		 if studentList.size() == 0, the method exits and returns to enhanced.main interface
	 * @param fileType (the type of file to be exported : .bin and .txt file is exported)
	 * @throws InterruptedException exportList
	 */
	public static void exportList(final String fileType) throws InterruptedException {

		File directory;
		File fileName = null;
		if (studentsList.size() != 0) {
			while (exporting) {
				System.out.println(":-----------------------------:");
				System.out.println(":     ENTER THE FILE PATH     : ");
				System.out.println(":-----------------------------:");
				System.out.print("   >>>>: ");

				exportPath = userInput.nextLine().trim();
				directory = new File(exportPath);
				if (directory.isDirectory()) {
					System.out.println(":-----------------------------:");
					System.out.println(":     ENTER THE FILE NAME     : ");
					System.out.println(":-----------------------------:");
					System.out.print("   >>>>: ");
					exportFileName = userInput.nextLine().trim();
					fileName = new File(exportFileName);
					// file check
					if (!fileName.exists()) {
						exporting = false;
					}
					else {
						System.out.println("FILE ALREADY EXISTS!");
						System.out.println("PLEASE TRY OTHER FILE NAME!");
						System.out.println();
						System.out.println("Do you want to try again?");
						System.out.println("Y for yes : N for no");
						System.out.print("   >>>>: ");
						exportErrorResponse = userInput.nextLine().toUpperCase().charAt(0);
						if (exportErrorResponse == ('Y')) {
							System.out.print("\t\t : PROCEEDING :");
							delay();
						}
						else if (exportErrorResponse == 'N') {
							exporting = false;
						}
						else {
							System.out.print(": REDIRECTING TO MAIN MENU :");
							Process.delay();
							exporting = false;
						}
					}
				}
				else {
					resetExportInputs();
					resetConditions();
					System.out.println("\n\t    INVALID FILE PATH (!)");
					System.out.println("Do you want to try again?");
					System.out.println("Y for yes : N for no");
					System.out.print("   >>>>: ");

					exportErrorResponse = userInput.nextLine().toUpperCase().charAt(0);
					if (exportErrorResponse == ('Y')) {
						resetExportInputs();
						resetConditions();
						System.out.print("\t\t : PROCEEDING :");
						delay();
					}
					else if (exportErrorResponse == 'N') {
						System.out.print(": REDIRECTING TO MAIN MENU :");
						Process.delay();
						exporting = false;
					}
					else {
						System.out.print(": REDIRECTING TO MAIN MENU :");
						Process.delay();
						exporting = false;
					}
				}
			}
			// checks and solve
			try {

				if (fileName != null) {
					if (!fileName.exists()) {
						if(fileType.equals("text") || fileType.equals("bin")) {
							FileProcessing.writeFileBinary(studentsList, exportPath + exportFileName);
							FileProcessing.writeFile(studentsList, exportPath + exportFileName);
							System.out.print("                   : SAVING :");
							delay();
							System.out.println("            : SAVED SUCCESSFULLY (!) :        ");
						}
					}
					else {
						System.out.println("ERROR");
					}
				}
			}
			catch (NullPointerException ignored) {
				System.out.println("     : INVALID CHOICE (!) :    ");
			}
			resetExportInputs();
		}
		else {
			System.out.println("            : THE LIST IS EMPTY (!) :       ");
			System.out.println("     : NO PRESENT DATA TO BE EXPORTED (!) :    ");
		}
	}

	/**
	 * @param fileType (the type of file to be exported : .bin file is only exported)
	 * @throws InterruptedException importList
	 */
	@note(description = "importing removes the current list" +
						"imports the list of students from the local storage" +
						"checks if the directory and file is valid" +
						"if the directory or file is not valid, " +
						"it asks the user if it wants to try again or proceed to enhanced.main interface")
	public static void importList(final String fileType) throws InterruptedException {

		File directory;
		File file = null;
		while (importing) {

			resetImportInputs();
			resetConditions();
			System.out.println(":-----------------------------:");
			System.out.println(":     ENTER THE FILE PATH     : ");
			System.out.println(":-----------------------------:");
			System.out.print("   >>>>: ");

			importPath = userInput.nextLine().trim();
			directory = new File(importPath);
			// directory check
			if (directory.isDirectory()) {
				System.out.println(":-----------------------------:");
				System.out.println(":     ENTER THE FILE NAME     : ");
				System.out.println(":-----------------------------:");
				System.out.print("   >>>>: ");
				importFileName = userInput.nextLine().trim();
				file = new File(importPath + importFileName + ".bin");
				// file check
				if (file.exists()) {
					importing = false;
				}
				else {
					System.out.println("FILE DOES NOT EXISTS!");
					System.out.println("PLEASE TRY OTHER FILE NAME!");
					System.out.println();
					System.out.println("Do you want to try again?");
					System.out.println("Y for yes : N for no");
					System.out.print("   >>>>: ");
					importErrorResponse = userInput.nextLine().toUpperCase().charAt(0);
					if (importErrorResponse == ('Y')) {
						System.out.print("\t\t : PROCEEDING :");
						delay();
					}
					else if (importErrorResponse == 'N') {
						importing = false;
					}
					else {
						System.out.print(": REDIRECTING TO MAIN MENU :");
						Process.delay();
						importing = false;
					}
				}
			}
			else {
				resetImportInputs();
				resetConditions();
				System.out.println("\n\t    INVALID FILE PATH (!)3");
				System.out.println("Do you want to try again?");
				System.out.println("Y for yes : N for no");
				System.out.print("   >>>>: ");

				importErrorResponse = userInput.nextLine().toUpperCase().charAt(0);
				if (importErrorResponse == ('Y')) {
					resetImportInputs();
					resetConditions();
					System.out.print("\t\t : PROCEEDING :");
					delay();
				}
				else if (importErrorResponse == 'N') {
					System.out.print(": REDIRECTING TO MAIN MENU :");
					Process.delay();
					importing = false;
				}
				else {
					System.out.print(": REDIRECTING TO MAIN MENU :");
					Process.delay();
					break;
				}
			}
		}
		try {
			// solving
			if(Objects.equals(fileType, "bin")) {
				assert file != null;
				if (file.exists()) {
					Process.studentsList = FileProcessing.readFileBinary(importPath, importFileName);
					setImportingText();
					resetImportInputs();
					resetConditions();
				}
				else {
					System.out.println(" : FILE IS NOT A VALID FILE (!) : ");
				}
			}
			else {
				System.out.println("ERROR");
			}
		}
		catch (NullPointerException ignored) {
			System.out.println("     : INVALID CHOICE (!) :    ");
		}
		resetImportInputs();
	}
	/**
	 * @throws InterruptedException showList
	 */
	@note(description = "method that shows the list of Students by iterating through the ArrayList studentsList" +
						"if studentsList.size() == 0, outputs list is empty")
	public static void showList() throws InterruptedException {

		if (isEmptyList())
			System.out.println("              : THE LIST IS EMPTY :            ");
		else {
			for (byte id = 0; id < studentsList.size(); id++) {
				line();
				System.out.println("Student No: " + (id + 1));
				System.out.println(studentsList.get(id).toString());
				if (studentsList.size() > 1)
					infoPause();
			}
		}
	}

	/**
	 * @throws InterruptedException removeInTheList
	 */
	@note(description = "method that Deletes 1 Student in the ArrayList")
	@problem(description = "instead of deleting a certain student, it deletes the first lrn in the array, so it won't delete those i > 1." +
						   "what I want is if the lrn that the userInputs is in the ArrayList" +
						   "I want is get the lrn of that lrn and remove all of its contents." +
						   "Well I don't know how to do that, hahahahahah." +
						   "IT WORKS NOW!")
	@fixed(isFixed = true)
	public static void removeInTheList() throws InterruptedException {

		String id = "";
		removeLrn = true;
		/* Gets the right input from the user
		 * converting the string to byte
		 */
		while (removeLrn) {
			if (isEmptyList()) {
				System.out.println("              : THE LIST IS EMPTY :            ");
				removeLrn = false;
			}
			else {
				if (!isIdExisted(id) && !invalidIdDeletion) {
					showList();
				}
				System.out.println(":-------------------------------:");
				System.out.println(" :ENTER STUDENT ID FOR DELETION: ");
				System.out.println(":-------------------------------:");
				System.out.print("   >>>>: ");

				id = userInput.nextLine().trim();

				if (id.matches("[0-9]+") && ( id.length() == 10 || id.length() == 11 || id.length() == 12) ) {
					removeLrn = false;
				}
				else {
					System.out.println("    : THAT LRN DOES NOT EXIST (!) :   ");
					invalidIdDeletion = true;
				}
				//solve
				if (isIdExisted(id)) {
					final String finalId = id;
					studentsList.removeIf(obj -> obj.getId().equals(finalId)); // ito
					System.out.print("          : REMOVING FROM THE LIST :");
					delay();
					System.out.println("\n    SUCCESSFULLY REMOVED FROM THE LIST (!)");
					invalidIdDeletion = false;
				}
				if (invalidIdDeletion) {
					tryAgain();
				}
			}
		}
	}

	/**
	 * @throws InterruptedException sortStudentList
	 */
	@note(description = "method that Sort the list of Students")
	public static void sortStudentList() throws InterruptedException {

		String choice2 = "";
		String temporaryString;
		String emptySize = "       : THE LIST IS EMPTY :     ";
		String lessStudent = ":THERE IS ONLY 1 STUDENT IN THE LIST:";
		while (sorting) {
			while (empty) {
				if (isEmptyList() || studentsList.size() == 1) {
					line();
					if (studentsList.size() == 1) {
						emptySortingLoopChoice = true;
						System.out.println(lessStudent);
						System.out.println(":------------------------------------:");
						System.out.println(": ARE YOU SURE YOU WANT TO SORT NOW? :");
						System.out.println("            : YES OR NO :             ");
						System.out.println(":------------------------------------:");
						System.out.print("   >>>>: ");
						choice2 = userInput.nextLine().toUpperCase().trim();
					}
					else {
						System.out.println(emptySize);
						line();
						sorting = false;
						empty = false;
						nextStep = false;
						System.out.print("    : REDIRECTING TO MAIN MENU :");
						Process.delay();
					}
					while(emptySortingLoopChoice){
						switch (choice2) {
							case SECOND_RESPONSE -> {
								nextStep = false;
								sorting = false;
								emptySortingLoopChoice = false;
								System.out.print(": REDIRECTING TO MAIN MENU :");
								Process.delay();
							}
							case FIRST_RESPONSE -> {
								System.out.print("\t\t : PROCEEDING :");
								delay();
								emptySortingLoopChoice = false;
								empty = false;
							}
							default -> {
								if(!choice2.contains("YES") || !choice2.contains("NO")) {
									System.out.println("\t\t   :Invalid Input (!):");
									System.out.print(": REDIRECTING TO MAIN MENU :");
									Process.delay();
									emptySortingLoopChoice = false;
									empty = false;
									nextStep = false;
									sorting = false;
								}
							}
						}
					}
				}
				empty = false;
			}
			while (nextStep) {
				if (isNotEmptyList() || ( isEmptyList() && choice2.equals(FIRST_RESPONSE) ) ) {
					System.out.println();
					System.out.println("NUMBER :" + Constants.SORT_IN_ID_ASCENDING + " : FOR...  Sort Ascending  by student ID .");
					System.out.println("NUMBER :" + Constants.SORT_IN_ID__DESCENDING + " : FOR...  Sort Descending by student ID.");
					System.out.println("NUMBER :" + Constants.SORT_IN_LAST_NAME_ASCENDING + " : FOR...  Sort Ascending  by student LAST_NAME .");
					System.out.println("NUMBER :" + Constants.SORT_IN_LAST_NAME_DESCENDING + " : FOR...  Sort Descending by student LAST_NAME.");
					System.out.println("NUMBER :" + Constants.SORT_IN_FIRST_NAME_ASCENDING + " : FOR...  Sort Ascending  by student FIRST_NAME .");
					System.out.println("NUMBER :" + Constants.SORT_IN_FIRST_NAME_DESCENDING + " : FOR...  Sort Descending by student FIRST_NAME.");
					System.out.println("NUMBER :" + Constants.SORT_IN_AGE_ASCENDING + " : FOR...  Sort Ascending  by student AGE .");
					System.out.println("NUMBER :" + Constants.SORT_IN_AGE__DESCENDING + " : FOR...  Sort Descending by student AGE.");
					System.out.println("NUMBER :" + Constants.SORT_IN_GENDER_ASCENDING + " : FOR...  Sort Ascending  by student GENDER .");
					System.out.println("NUMBER :" + Constants.SORT_IN_GENDER_DESCENDING + " : FOR...  Sort Descending by student GENDER.");
					System.out.println("NUMBER :" + Constants.SORT_IN_SCHOOL_NAME_ASCENDING + " : FOR...  Sort Ascending  by student SCHOOL_NAME .");
					System.out.println("NUMBER :" + Constants.SORT_IN_SCHOOL_NAME_DESCENDING + ": FOR...  Sort Descending by student SCHOOL_NAME.");
					System.out.println("NUMBER :" + Constants.SORT_IN_COURSE_NAME_ASCENDING + ": FOR...  Sort Ascending  by student COURSE_NAME .");
					System.out.println("NUMBER :" + Constants.SORT_IN_COURSE_NAME_DESCENDING + ": FOR...  Sort Descending by student COURSE_NAME.");

					if (isNotEmptyList() || ( isEmptyList() && choice2.equals(FIRST_RESPONSE) ) ) {
						System.out.println(":-----------------------------:");
						System.out.println(":        SELECT CHOICE        : ");
						System.out.println(":-----------------------------:");
						System.out.print("   >>>>: ");
						temporaryString = userInput.nextLine().trim();
						if (Checker.isByte(temporaryString)) {
							sortingChoice = Byte.parseByte(temporaryString);
						}
						nextStep = false;
						sorting = false;
					}
					else
						System.out.println("\t\t  :  INVALID INPUT (!)  :");
				}
				else
					sorting = false;
				//solving
				switch (sortingChoice) {
					case Constants.SORT_IN_ID_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortIdAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_ID__DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortIdDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_LAST_NAME_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortLastNameAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_LAST_NAME_DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortLastNameDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_FIRST_NAME_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortFirstNameAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_FIRST_NAME_DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortFirstNameDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_AGE_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortAgeAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_AGE__DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortAgeDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_GENDER_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortGenderAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_GENDER_DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortGenderDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_SCHOOL_NAME_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortSchoolNameAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_SCHOOL_NAME_DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortSchoolNameDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_COURSE_NAME_ASCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortCourseNameAscending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					case Constants.SORT_IN_COURSE_NAME_DESCENDING -> {
						System.out.print("\t\t\t :SORTING:");
						delay();
						SortProcessing.sortCourseNameDescending(studentsList);
						System.out.println("\n\t      SUCCESSFULLY SORTED (!)");
					}
					default -> System.out.println("\t      INVALID SORT CHOICE (!)");
				}
			}
		}
	}

	@note(description = "one way process reset, resets some conditions")
	static void processReset() {
		resetConditions();
		resetImportInputs();
		lrnResponse = "";
	}

	@note(description = "resets the fields that are used in the enhanced.main method")
	public static void resetMain() {
		choiceCheck  = true;
		importChoiceLoop = true;
		exportChoiceLoop = true;
		isValidMainChoice = false;
		mainChoice = 0;
	}

	@note(description = "resets the inputs that are used in importing lists")
	public static void resetImportInputs() {
		importPath = "";
		importFileName = "";
		importFileTypeChoice = 0;
		importErrorResponse = ' ';
	}

	@note(description = "resets the inputs that are used in importing lists")
	public static void resetExportInputs() {
		exportPath = "";
		exportFileName = "";
		exportFileTypeChoice = 0;
		exportErrorResponse = ' ';
	}

	@note(description = "resets the looping conditions used in adding a student")
	static void resetCreateStudentConditions() {
		addFirstName = true;
		addLastName = true;
		addGender = true;
		addSchool = true;
		addCourse = true;
		addStudentId = true;
		addAge = true;
	}

	@note(description = "resets the looping conditions used some methods in the Process class" +
						"resets importing, exporting, removing student in the list conditions")
	public static void resetConditions() {
		sorting = true;
		sortingChoice = 0;
		emptySortingLoopChoice = false;
		nextStep = true;
		exporting = true;
		importing = true;
		removeLrn = true;
		empty = true;
		invalidIdDeletion = false;
	}

	@note(description = "negates the looping conditions in createStudent method" +
						"used in cases where the user did not enter inputs properly" +
						"it makes the whole createStudent method conditions to false")
	static void negateCreateStudentFunction() {
		addFirstName = false;
		addLastName = false;
		addGender = false;
		addSchool = false;
		addCourse = false;
		addStudentId = false;
		addAge = false;
	}

	@note(description = "outputs when the user is done executing certain functions" +
						" pauses the console")
	public static void clearConsole() {
		System.out.println(":---------------------------------------------:");
		System.out.println("           : PRESS ENTER TO CONTINUE :         ");
		System.out.println(":---------------------------------------------:");
	}

	@note(description = "inserts a line above and below descriptions")
	public static void line() {
		System.out.println(":---------------------------------------------:");
	}

	@note(description = "creates a loading output")
	public static void delay() throws InterruptedException {
		for (int lrn = 1 ; lrn <= 3 ; lrn++) {
			TimeUnit.MILLISECONDS.sleep(400);
			System.out.print(".");
		}
		TimeUnit.MILLISECONDS.sleep(400);
		System.out.println();
	}

	@note(description = "pauses the outputs of showList method, if the size of the studentsList is > 1")
	public static void infoPause() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(80);
	}

	@note(description = "checks if studentList is empty" +
						"returns true if the list is empty or no objects")
	public static boolean isEmptyList() {
		return (studentsList.size() == 0);
	}

	@note(description = "checks if studentList is not empty" +
						"returns true if the list is not empty or has objects")
	public static boolean isNotEmptyList() {
		return (studentsList.size() != 0);
	}

	@note(description = "clears the list")
	public static void clearList() {
		studentsList.clear();
	}

	@note(description = "method that shows the total number of students")
	public static void numberOfStudent() {
		System.out.println("  Number Of Students: "+ studentsList.size()); //1
	}

	/**
	 * @param id student ID
	 */
	@note(description = "checks if an LRN is existed, iterating through the array using an enhanced for loop" +
						"returns true if the student ID already existed")
	public static boolean isIdExisted(final String id) {
		// looping
		for (Student student : studentsList) {
			if (student.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	@note(description = "initiates the program" +
						"initializes mainChoice used in enhanced.main method" +
						"initializes sorting choice in sortStudentsList method")
	public static void initialize() {
		mainChoice = 0;
		sortingChoice = 0;
		userInput = new Scanner(System.in);
	}

	@note(description = "method that creates a Student object and adding that object in the ArrayList studentsList" +
						"it also removes any null objects in the ArrayList studentsList")
	public static void addList() throws InterruptedException {
		Student newStudent = createStudent();
		studentsList.add(newStudent);

		try {
			for (int i = 0; i < studentsList.size(); i++) {
				studentsList.removeIf(student -> student.getId() == null);
			}
		} 
		catch (NullPointerException ignored) {
		}
		if(lrnResponse.equals("YES")) {
			System.out.println("\n         STUDENT ADDED SUCCESSFULLY (!)");
			resetMain();
			processReset();
			resetCreateStudentConditions();
		}
		else if (lrnResponse.equals("NO")) {
			resetMain();
			processReset();
			resetCreateStudentConditions();
		}
		else {
			if (lrnResponse.isBlank() && (invalidId && lrnResponse.matches("[!@#$%^&*()a-zA-Z]+")) ) {
				System.out.print(' ');
			}
			else if(lrnResponse.isBlank() && invalidId) {
				System.out.print(' ');
			}
			else if(invalidId) {
				System.out.print(' ');
			}
			else {
				System.out.println("\n         STUDENT ADDED SUCCESSFULLY (!)");
			}
			resetMain();
			processReset();
			resetCreateStudentConditions();
		}	
	}

	@note(description = "creates a loading output when importing" +
						"outputs if the import process is a success")
	static void setImportingText() throws InterruptedException {
		System.out.print("                : IMPORTING :");
		delay();
		System.out.println("\n            SUCCESSFULLY IMPORTED (!)");
	}
}
	