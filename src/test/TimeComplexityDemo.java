package test;
public class TimeComplexityDemo {
	
	public int sum(int n) {
		return n*(n+1)/2;
	}
	
	public int sum2(int n) {
		int sum = 0 ;
		for(int i = 0; i < n ; i++) {
			sum = sum + i;
		}
		return sum;
	} 
	
	public static void main(String[] args) {
			double now = System.currentTimeMillis();
			
			System.out.println("current time: "+now+"\n");
			TimeComplexityDemo ob = new TimeComplexityDemo();
			ob.sum2(100000000);
			System.out.println("Time taken is: "+ (System.currentTimeMillis() - now));
	}
}