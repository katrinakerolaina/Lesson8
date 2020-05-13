package lesson8;

public class AvgMax {

	//declare instance variables
	private int numbers[];
	private double average;
	private int max;
	
	public AvgMax() {
		//numbers[] = null
		//average = 0.0 (because double)
		//max = 0
		
	}
	
	//setter method
	public void setNumbers(int numbers[]) {
		this.numbers = numbers;
	}
	
	//processing method, to compute the average of all the numbers from []
	public void calculateAverage() {
		int sum;//to store the sum of all the elements
		int currentElement; //to store the current element form the array
		
		sum = 0;
		
		for (int i = 0; i<numbers.length; i++) {
			//retrieve the element at index i
			sum = sum +numbers[i];//update 
		}
		
		//compute
		average = (double) sum/numbers.length;
	}
	
	//getter for average
	public double getAverage() {
		return average;
	}
	
	public int computeMax() {
		max = numbers[0];
			for(int i = 1; i< numbers.length; i++) {
				//if the current element of [] located at i > than the value stored in max 
				//need to update max with current element
				if(numbers[i]>max) {
					//update the max with current value
					max = numbers[i];
					
				}
			}
		return max;
		
	}
	
	//getter method to retrieve the max
	public int getMax() {
		return max;
	}
	
}//end class
