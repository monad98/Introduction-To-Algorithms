//Exercise 2.1-3
package chapter2.exercises;

public class SearchingProblem {

	public static void main(String[] args) {
		int[] a = {1,2,3,6,67,13,22,13,44,62,76,12};
		int v = 62;
		
		System.out.println(linearSearch(a, v));

	}
	
	private static int linearSearch(int[] a, int v) {
		
		int i = 0;
		while(i < a.length) {
			if(a[i] == v) {
				return i;
			}
			i++;
		}
		
		return -1;
	}

}
