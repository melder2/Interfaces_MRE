/**
 * 
 * @author Michael Elder
 *	Programming Project 2 Problem 2
 *	
 *	This class creates the Task class which has name, priority, and myStatus of type Status. 
 */
public class Task implements Priority{

	/**
	 * Creating three private objects.
	 */
	private String name;
	private int priority;
	private Status myStatus;
	/**
	 * Preferred constructor with parameter name and setting priority and myStatus equal to something.
	 * 
	 */
	public Task(String name) {
		this.name = name;
		priority = 0;
		myStatus = Status.NOT_STARTED;
	}//end empty argument constructor
	/**
	 * 
	 * getter for name
	 */
	public String getName() {
		return name;
	}//end getter for name
	/**
	 * 
	 * setter for name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setter for name
	/**
	 * 
	 * getter for priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * 
	 * setter for priority
	 */
	public void setPriority(int p) {
		this.priority = p;
	}	
	/**
	 * 
	 * getter for Status
	 */
	public Status getStatus() {
		return myStatus;
	}//end getter for Status
	/**
	 * 
	 * setter for Status
	 */
	public void setStatus(Status s) {
		myStatus = s;	
	}//end setter for Status
	/**
	 * 
	 * compareTo method
	 */
	public int compareTo(Task t) {
		if (this.myStatus == t.getStatus()) {
			return 1;
		}
		return 0;	
	}
	/**
	 * 
	 * toString method
	 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString
	
}
