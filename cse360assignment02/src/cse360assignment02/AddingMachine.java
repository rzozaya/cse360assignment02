package cse360assignment02;

/******
 * <h1> AddingMachine </h1> 
 * 	AddingMachine is a Class that can add and subtract
 * to a 'total', initially set to 0.
 * 
 * @author  Ramon Zozaya
 * @version 1.1  
 * @since 	Oct 5, 2020
 * 
 */

public class AddingMachine {
	  // Private variables
	  private int total;
	  private String memory = "0";
	  
	  /****
	   * This is a constructor that instantiates the class
	   * AddingMachine and starts with an initial total of 0 
	   * {@value total}
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /****
	   * 'getTotal' returns:
	   * {@value total}
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /****
	   * 'add' adds the value to total and records the addition
	   * @param value
	   */
	  public void add (int value) {
		  total = total + value;
		  memory = memory + " + " + Integer.toString(value);
	  }
	  
	  /****
	   * 'subtract' subtracts the value to total and records the subtraction
	   * @param value
	   */
	  public void subtract (int value) {
		  total = total - value;
		  memory = memory + " + " + Integer.toString(value);
	  }
	  
	  /****
	   *'toString' prints out the recording of all additions
	   * and subtractions since {@value memory} was last cleared 
	   */
	  public String toString () {
	    return memory;
	  }

	  /****
	   * 'clear' resets the memory back to '0'
	   */
	  public void clear() {
		  memory = "0";
	  }
	}