/**
 * This is the Lockable interface it will have its features implemented in the Wizard class
 * 
 * @author Chase Hall
 * @version 2-16-23 Lab 2 CS131
 */
interface Lockable {
	void setKey(int key);

	void lock(int key);

	void unlock(int key);

	boolean isLocked();

}//end interface
