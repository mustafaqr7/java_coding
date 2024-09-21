package test;

public class SecondMax {
	public static int sMax(int[] arr) {
		int secondM = Integer.MIN_VALUE;
		int firstM = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > firstM ) {
				secondM = firstM;
				firstM = arr[i];
			}
			else if(arr[i] > secondM && arr[i]!= firstM ) {
				secondM = arr[i];
			}
		}
		return secondM;
	}

	public static void main(String[] args) {
		
		int x = sMax(new int[] {1,34,56,55});
		System.out.println("x: "+x);
	}

}
