/**
 * This class represents a wizard for a Dungeon and Dragons type game;
 * 
 * @author Chase Hall
 * @version 2-16-23 Lab 2 CS131
 */
public class Wizard implements Lockable {

	private String name;
	private int health;
	private int key;
	boolean locked;

	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;
	}// end constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param name used to set name through calling method
	 */
	public Wizard(String name) {
		this.name = name;
		this.health = 0;
		this.key = 0;
		this.locked = false;

	}// end constructor

	/**
	 * This method processes the damage to the object when it is hit by other
	 * objects (e.g. weapons, lightening, etc.)
	 * 
	 * @param power used to set the amount of damage taken through the calling method
	 */
	public void takeDamage(int power) {
		if (locked = true) {
			this.health = health;
		} else {
			this.health = health - power;
		}
	}// end takeDamage

	/**
	 * Getter for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;

	}// end getName

	/**
	 * Setter for name
	 * 
	 * @param name used to set it through calling method
	 */
	public void setName(String name) {
		this.name = name;

	}// end setName

	/**
	 * Getter for health
	 * 
	 * @return the health
	 */
	public int getHealth() {
		return health;

	}// end getHealth

	/**
	 * Setter for health
	 * 
	 * @param health used to set it through calling method
	 */
	public void setHealth(int health) {
		this.health = health;
	}// end setHealth

	/**
	 * Getter for the key
	 * 
	 * @return the key
	 */
	public int getKey() {
		return key;
	}// end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}// end toString
	/**
	 * Setter for Key
	 */

	public void setKey(int key) {
		this.key = key;
	}//end key
	/**
	 * Allows you to lock the object
	 */

	public void lock(int key) {
		if (key == this.key) {
			locked = true;
		}// end object
	}
	/**
	 * Allows you to unlock the object
	 */
	public void unlock(int key) {
		if (key == this.key) {
			locked = false;
		}//end unlock
	}
	/**
	 * Checks if the object is locked
	 */

	public boolean isLocked() {
		return locked;
	}//end isLocked
}// end class
