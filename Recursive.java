public class Recursive {
	
	public static int recursive(int num) {
		if (num == 0 || num == 1)
		return num;
		
		int newNum = recursive(num - 1) + recursive(num - 2);
		return newNum; 
	}

}
