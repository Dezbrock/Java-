import java.util.Scanner;
/**
 * 
 */

/**
 * @author Desmond
 * @purpose To calculate taxes for married and single people
 *
 */
public class Taxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double RATE1 = 0.10;
		final double RATE2 = 0.15;
		final double RATE3 = 0.25;
		final double SINGLE_LIMIT1 = 32000;
		final double SINGLE_LIMIT2 = 8000; 
		final double MARRIED_LIMIT1 = 64000;
		final double MARRIED_LIMIT2 = 16000; 
		double tax1 = 0;
		double tax2 = 0;
		double tax3 = 0; 
		double totalTax= tax1+ tax2+ tax3;  
		Scanner in = new Scanner(System.in);
		
		// Prompt user for income.
        System.out.print("Enter your income: ");
        double income = in.nextDouble();
        
        //Prompt user for marital status
        System.out.print("Enter m if your married and s if single: ");
        String relationshipStatus = in.next();
        
        if (relationshipStatus.equals("s")) 
        {
            if (income <= SINGLE_LIMIT2){
            	tax1 = income * RATE1; 
            }
             else if (income > SINGLE_LIMIT2 & income <= SINGLE_LIMIT1) {
                 tax2 = 800 + income * RATE2; 
             }
            
            	 
             else if (income > SINGLE_LIMIT1) { 
                 tax3 = 4400 + income * RATE3;	 
             }	 
             else if (relationshipStatus.equals("m")) {
                 
            	 if (income <= MARRIED_LIMIT2) {
                     tax1 = income * RATE1;
                 }
                 else if (income > MARRIED_LIMIT2 & income <= MARRIED_LIMIT1) {
                     tax2 = 1600 + income * RATE2;
                 }
                 else if (income > MARRIED_LIMIT1) {
                     tax3 = 8800 + income * RATE3;
                 }
        System.out.print("Your tax is: $" + totalTax); 
        
        in.close(); 
        
        


        }
            	
	}
}
}
             

