/**
 * 
 */

/**
 * @author Desmond
 * @purpose to compute the average of an array filled with 10 random values excluding the smallest value.
 * @date 09/17/2021
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare the array
		int[] numbers = new int[10]; 
		
		//Filling the array with random numbers
		for (int i=0; i < numbers.length; i++)
		{ 
			numbers[i] = (int)(Math.random()*100);   
		}
		
		//Showing the values 
		for(int element : numbers) 
		{
			System.out.print(element + " "); 
		}
		System.out.println(); 
		
		
		//Display the average 
		double avg = avgNumb(numbers); 
		System.out.printf("The average of the numbers is %.2f\n" , avg);
		
	
	}
	//Create an method that calculates the average except for the smallest number 
	public static double avgNumb(int[] array)
	{
		int min = array[0]; 
		int total = array[0]; 
		for (int i = 1; i < array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
			total = total + array[i]; 
		}
		total = total - min; 
		double average = (total*1.0)/(array.length - 1); 
		return average; 

	}

}
