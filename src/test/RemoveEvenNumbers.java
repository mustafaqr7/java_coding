package test;

public class RemoveEvenNumbers {
	
	int[] rEven(int[] arr) {
		
		// Counting length of the original array
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 ) {
				count++;
			}
		}
		//Number of odd numbers in Array
		System.out.println("Length of new array: "+count);
		
		//New array creation
		int[] arr2 = new int[count];
		
		//Inserting data into the new array
		for(int i = 0, j = 0; i < arr.length; i++) {
			if(arr[i]% 2 != 0 ) {
				arr2[j] = arr[i];
				j++;
			}
		}
		
		return arr2;
	}
	
	public void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RemoveEvenNumbers objEvenNumbers = new RemoveEvenNumbers();
		int[] arr = new int[] {2,33,45,3,12,44,67};
		objEvenNumbers.printArray(arr);
		arr = objEvenNumbers.rEven(arr);
		objEvenNumbers.printArray(arr);

		
	}
}
