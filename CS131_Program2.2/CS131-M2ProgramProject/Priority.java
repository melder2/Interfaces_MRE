/**
 * 
 * @author Michael Elder
 *	Programming Project 2 Problem 2
 *	
 *	This class creates the Priority interface with three integer constants and getter and setter for Priority. 
 */
public interface Priority {
	
	final int MED_PRIORITY = 5;
	final int MIN_PRIORITY = 1;
	final int MAX_PRIORITY = 10;
	//Declaring constants for the Priority interface
	public int getPriority();
	public void setPriority(int priority);
	//Getter and setter for Priority
}
