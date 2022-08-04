/**
 * 
 * @author Michael Elder
 *	Programming Project 2 Problem 2
 *	
 *	This class creates the Process class with three integers and the compareTo method. 
 */
public class Process implements Priority{
	/**
	 * Creating three private objects
	 */
	private String ProcessID;
	private int priority;
	private int myPriority;
		/**
		 * 
		 * Preferred constructor with parameter ProcessID and setting priority and myPriority equal to something
		 */
		public Process(String ProcessID) {
			this.ProcessID = ProcessID;
			priority = 1;
			myPriority = Priority.MIN_PRIORITY;
		}//end preferred constructor
		/**
		 * 
		 * Getter for ProcessID
		 */
		public String getProcessID() {
			return ProcessID;
		}//end getter for ProccessID
		/**
		 * 
		 * Setter for ProcessID
		 */
		public void setProcessID(String ProcessID) {
			this.ProcessID = ProcessID;
		}//end setter for ProcessID
		/**
		 * 
		 * Getter for myPriority
		 */
		public int getPriority() {
			return myPriority;
		}//end getter for Priority
		/**
		 * 
		 * Setter for myPriority
		 */
		public void setPriority(int p) {
			myPriority = p;	
		}//end setter for Priority
		/**
		 * 
		 * compareTo method
		 */
		public int compareTo(Priority p) {
			if (this.myPriority == p.getPriority()) {
				return 1;
			}
			return 0;
		}//end compareTo method
		/**
		 * 
		 * toString method
		 */
		@Override
		public String toString() {
			return "Process [ProcessID=" + ProcessID + ", priority=" + priority;
		}//end to String

	
}
