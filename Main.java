public class Main extends Recursive{
	public static void main(String[] args) {
		int var = 10; 
		
		for (int number = 0; number < var; number++) {
            recursive(number);
            if(number == 9) {
         	   System.out.printf("The 10th term of the Fibonacci sequence is %d ", recursive(number)); 
            }
		}
	}
}
		
		

