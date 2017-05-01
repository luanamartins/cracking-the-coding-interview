package chapter8;

/**
 * Magic Index: A magic index in an array A [0...n-1] is defined to be an index
 * such that A[i] = i. Given a sorted array of distinct integers, write a method
 * to find a magic index, if one exists, in array A.
 * 
 * FOLLOW UP What if the values are not distinct?
 * 
 */

public class Question3 {

	public static int magicIndex(int[] array){
		if(array == null) return -1;
		return magicIndex(array, 0, array.length);
	}
	
	private static int magicIndex(int[] array, int low, int high) {
		if (low > high) {
			return -1;
		} else {
			int middle = (low + high) / 2;
			if (middle < array[middle])
				return magicIndex(array, low, middle - 1);
			else if (middle > array[middle])
				return magicIndex(array, middle + 1, high);
			else
				return middle;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[7];
		array[0] = -1;
		array[1] = 1;
		array[2] = 2;
		array[3] = 5;
		array[4] = 7;
		array[5] = 8; 
		array[6] = 9;
		
		System.out.println(magicIndex(array));
	}

}
