package apcs;

public class PrintingStyles {

	public static void main(String args[]) 
    {
		//System.out.print
        System.out.println("My name is Pavan and I am 31 years old.");
        System.out.println("I am learning Java.");
        
        //System.out.format
        String name = "Pavan";
        int age = 31;
        System.out.format("My name is %s and I am %d years old.%nI am learning Java.", name, age);
    }
	
}
