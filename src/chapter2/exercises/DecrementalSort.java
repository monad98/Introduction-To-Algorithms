//Exercises 2.1-2

package chapter2.exercises;

import java.util.Arrays;

public class DecrementalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {31, 41, 59, 29, 41, 58};
		for( int j = 1; j < a.length; j++) {
			int key = a[j];
			int i = j - 1;
			while(i>=0 && a[i] < key) {
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = key;
		}
		System.out.println(Arrays.toString(a));

	}	
}
