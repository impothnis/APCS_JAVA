package apcs;

public class Comments {
	/**
	 * Javadoc comments
	 * @param args
	 */

	/**
	 * This method/ function prints the name and the age of the reader
	 * on the screen.
	 */
	public static void main(String args[]) 
	{
		/*
 		  Block comment
          Replace Pavan in the quotes below with your name.
          Replace 31 with your age.
		 */
		
		
		String name = "Pavan";
		int age = 31;
		// Line comment
		// This line prints the introduction on to screen.
		System.out.format("My name is %s and I am %d years old.%nI am learning Java.", name, age);
	}

}
