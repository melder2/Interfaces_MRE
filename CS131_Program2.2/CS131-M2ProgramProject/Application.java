/**
 * 
 * @author Michael Elder
 *	Programming Project 2 Problem 2
 *	
 *	This class creates the Application class which checks all of the classes and objects. 
 */
public class Application {

	public static void main(String[] args) {
		/**
		 * 
		 * Creating 4 tasks
		 */
		Task t1 = new Task("Go to the grocery store");
		Task t2 = new Task("Go to the pharmacy");
		Task t3 = new Task("Go to eat");
		Task t4 = new Task("Get ready for the day");
		//Adding 4 tasks
		/**
		 * 
		 * Setting the status for t1 and t2
		 */
		t1.setStatus(Status.NOT_STARTED);
		t2.setStatus(Status.NOT_STARTED);
			System.out.println("Same status for task: " + t1.compareTo(t2));
			//Testing comparison for equal
		/**
		 * 
		 * Setting the status for t3 and t4
		 */
		t3.setStatus(Status.NOT_STARTED);
		t4.setStatus(Status.COMPLETE);
			System.out.println("Different status for task: " + t3.compareTo(t4) + "\n");
			//Testing comparison for equal
		/**
		 * 
		 * Setting the priority for t1 and t2
		 */
		t1.setPriority(Priority.MAX_PRIORITY);
		t2.setPriority(Priority.MAX_PRIORITY);
			System.out.println("Same priority for task: " + t1.compareTo(t2));
			//Testing comparison for equal
		/**
		 * 
		 * Setting the priority for t3 and t4
		 */
		t3.setPriority(Priority.MIN_PRIORITY);
		t4.setPriority(Priority.MED_PRIORITY);
			System.out.println("Different priority for task: " + t3.compareTo(t4) + "\n");
			//Testing comparison for equal
		/**
		 * 
		 * Creating four processes
		 */
		Process p1 = new Process("Open google");
		Process p2 = new Process("Search web");
		Process p3 = new Process("Type in how to code with Java");
		Process p4 = new Process("Insert quotes");
		/**
		 * 
		 * Setting the priority for p1 and p2
		 */
		p1.setPriority(Priority.MAX_PRIORITY);
		p2.setPriority(Priority.MAX_PRIORITY);
			System.out.println("Same priority for process: " + p1.compareTo(p2));
			//Testing comparison for equal
		/**
		 * 
		 * Setting the priority for p3 and p4
		 */
		p3.setPriority(Priority.MIN_PRIORITY);
		p4.setPriority(Priority.MED_PRIORITY);
			System.out.println("Different priority for process: " + p3.compareTo(p4));
			//Testing comparison for equal
	}//end main
}//end class
