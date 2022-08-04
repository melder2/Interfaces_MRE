/**
 * 
 * @author Michael ELder 
 * Programming Project 2 Problem 1
 * The Application class creates six rational numbers and then compares them. 
 *
 */
public class Application {

	public static void main(String[] args) {
		/**
		 * Creates six different rational numbers 
		 *
		 */
		RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r4, r5, r6, r7;
        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);
        /**
		 * Tests the compareTo method 
		 *
		 */
        System.out.println(r1.compareTo(r2));
		System.out.println(r2.compareTo(r4));
		System.out.println(r4.compareTo(r5));
		System.out.println(r5.compareTo(r6));
		System.out.println(r6.compareTo(r7));
		

	}

}
