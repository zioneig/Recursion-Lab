/* This class uses recursion and dynamic programming to calculate the sum of arrays and fibonacci numbers
 * @author Zion Eig-Tassiello
 */

import java.util.ArrayList;

public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	private static ArrayList<Integer> fibArray = new ArrayList<Integer>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fibArray.add(0);
		
		int index = 0;

		//System.out.println(fibonacci(8));
		
		
		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) {
		
		if(num == 0)
			return arr[num];
		
		return arr[num] + sumOfArray(arr, --num);
		
	}

	//returns the fibonacci number recursively and dynamically
	public static int fibonacci(int num) {
		if(num <= 2) {
			if(fibArray.size() <= num) {
				fibArray.add(1);
			}
			return 1;
		}
		
		if(fibArray.size() > num) {
			return fibArray.get(num);
		}
		else if(fibArray.size() == num){
			fibArray.add(fibArray.get(num-1) + fibArray.get(num-2));
			return fibArray.get(num);
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
}