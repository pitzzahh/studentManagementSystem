package version2.enhanced.processes.validation;

import annotations.note;

public class Checker {

	@note(description = "private constructor, this prevents any other packages from using this Class")
	private Checker() {
		
	}

	@note(description = "checks if user input is a valid integer number" +
						"parameter is a String called input" +
						"returns true if the input is a valid integer number")
	public static boolean isInteger(String input) {
	    try {
			Integer.parseInt(input);
			return true;
	    }
	    catch (Exception ignored) {
	    }
	    return false;
	}

	@note(description = "checks if user input is a valid byte number" +
						"parameter is a String called input" +
						"returns true if the input is a valid byte number")
	public static boolean isByte(String input) {
	    try {
			Byte.parseByte(input);
			return true;
	    }
	    catch (Exception ignored) {
	    }
	    return false;
	}
}
