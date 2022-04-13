import java.util.Scanner; 
/**
 * 
 */

/**
 * @author Desmond
 * @purpose to calculate the area and perimeter of a square. 
 *
 */
public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{ 
		Scanner in = new Scanner(System.in); 
		System.out.print("What is the length of one side of the square?: ");
		double length = in.nextDouble();
		in.close(); 
		
		double perimeter; 
		perimeter = calcPerimeter(length); 
		System.out.printf("The perimeter of a square with a side length of %.2f is %.2f\n ", length, perimeter);
		
		 
		System.out.printf("The area of a square with a side length of %.2f is %.2f.  ", length, calcArea(length));
	}
	public static double calcPerimeter(double value)
	{
		double perimeter = (4 * value);  
		return perimeter; 
	}
	public static double calcArea(double value)
	{
		double area =(value * value); 
		return area; 
	}
		 
	
}


