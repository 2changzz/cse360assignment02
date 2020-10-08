package cse360assignment02;

/**
 * 
 * @author sophiachang
 *
 */
public class AddingMachine {
  private int total;
  // Added the variable eq to save all of the transactions
  private String eq = "0";
  
  
 
 /**
  * Tests the AddingMachine with given input
  * @param args
  */
  public static void main(String[] args) 
  {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add(4); 
	  myCalculator.subtract(2); 
	  myCalculator.add(5);
	  myCalculator.toString();
  }
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    
  }
  
/**
 * Returns the total
 * @return total
 */
  public int getTotal () {
    return total;
  }
  
/**
 * Adds the user input value to the total
 * @param value
 */
  public void add (int value) {
	  total = total + value;
	  eq = eq + " + " + value;
  }

/**
 * Subtracts the user input value from the total
 * @param value
 */
  public void subtract (int value) {
	  total = total - value;
	  eq = eq + " - " + value;
  }

 /**
  * Keeps a history of the transactions
  * @return eq
  */
  public String toString () {
	  System.out.println(eq);
	  
	  
    return eq;
  }

 /**
  * Clears the total, sets it to zero
  */
  public void clear() {
	  total = 0;
  }
}

