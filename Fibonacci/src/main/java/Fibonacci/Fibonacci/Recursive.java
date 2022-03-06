package Fibonacci.Fibonacci;

public class Recursive {
	/**
	 * This method is to run the Fibonacci sequences in the recursive method
	 * @param num  the integer being called into the method to determine the newNum 
	 * @return newNum - is the number being return for each term 
	 */
	public static int recursive(int num) {
		if (num == 0 || num == 1)
		return num;
		
		int newNum = recursive(num - 1) + recursive(num - 2);
		return newNum; 
	}
}