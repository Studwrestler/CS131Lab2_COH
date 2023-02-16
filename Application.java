/**
 * This is the Application object that will launch our application
 * 
 * @author Chase Hall
 * @version 2-16-23 Lab 2 CS131
 */
public class Application {
	/**
	 * Default
	 */
	Application() {

	}

	/**
	 * Main loop of application
	 * 
	 * @param args arguments of main method
	 */

	public static void main(String[] args) {
		Wizard w = new Wizard("George");
		System.out.println("My name is " + w.getName());
		w.setHealth(100);
		w.setKey(420);
		w.setName("Keith");
		System.out.println("I have " + w.getHealth() + " health");
		System.out.println("My key is " + w.getKey());
		System.out.println("My new name is " + w.getName());
		w.lock(420);
		System.out.println("Is the object locked: " + w.isLocked());
		w.unlock(421);
		System.out.println("Is the object locked: " + w.isLocked());
		w.takeDamage(80);
		System.out.println("I have " + w.getHealth() + " health");
		w.unlock(420);
		System.out.println("Is the object locked: " + w.isLocked());
		w.lock(419);
		System.out.println("Is the object locked: " + w.isLocked());
		w.takeDamage(45);
		System.out.println("I have " + w.getHealth() + " health");

	}// end main

}// end class