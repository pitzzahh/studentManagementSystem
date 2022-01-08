package version1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CallingStudents extends List {

	public static void main(String[] args) {
		
		System.out.print(Student.numberOfStudent());
		System.out.println();
        int choice;
        
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Input student number: ");
              
        choice = keyboardInput.nextInt();
        
        try { 
        	System.out.println();
        	switch(choice){
        	    case 1:
        	        System.out.println(Student.student1.toString());
        	        break;
        	    case 2:
        	    	System.out.println(Student.student2.toString());
        	        break;
        	    case 3:
        	    	System.out.println(Student.student3.toString());
        	        break;
        	    case 4:
        	    	System.out.println(Student.student4.toString());
        	        break;
        	    case 5:
        	    	System.out.println(Student.student5.toString());
        	        break;
        	    case 6:
        	    	System.out.println(Student.student6.toString());
        	        break;
  				case 7:
        	    	System.out.println(Student.student7.toString());
        	        break;
        	    case 8:
        	    	System.out.println(Student.student8.toString());
        	        break;
        	    case 9:
        	    	System.out.println(Student.student9.toString());
        	        break;
        	    case 10:
        	    	System.out.println(Student.student10.toString());
        	        break;
        	    case 11:
        	    	System.out.println(Student.student11.toString());
        	        break;
        	    case 12:
         		   	System.out.println(Student.student12.toString());
					break;
            default : System.out.println("only from 1 to the maximum number of students");

        } // end of switch statement
        keyboardInput.close();
        } // end of try statement
        catch (InputMismatchException ignored) {
        }
		System.out.println();
	}
}

		