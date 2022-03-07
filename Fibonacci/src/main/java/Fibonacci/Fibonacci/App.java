package Fibonacci.Fibonacci;

/**
 * 
 * @author czumaran
 *
 * This class outputs the 10th term of Fibonacci sequences in a recursive method
 */
public class App extends Recursive{
	/**
	 * This is the main method used to execute the program 
	 * 
	 * @param args will output the 10th term for the number assigned to var
	 *
     */
	public static void main(String[] args) {
		int var = 10; 
		
		for (int number = 0; number < var; number++) {
            recursive(number);
            if(number == 9) {
         	   System.out.printf("The 10th term of the Fibonacci Sequence is %d ", recursive(number)); 
            }
		}
	}		
}
