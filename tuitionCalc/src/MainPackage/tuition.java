package MainPackage;

import java.util.Scanner;

public class tuition {
	private int initialTuition;
	private double tuitionIncrease;
	private double repaymentAPR;
	private int repaymentYears;
	
	public tuition(int initialTuition, double tuitionIncrease, double repaymentAPR, int repaymentYears)
{/*constructor for tuition with arguments
*/
		this.initialTuition = initialTuition;
		this.tuitionIncrease = tuitionIncrease;
		this.repaymentAPR = repaymentAPR;
		this.repaymentYears = repaymentYears;
	}
	
	public tuition(){
		/*No arg constructor for tuition
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial tuition");
		this.initialTuition = input.nextInt();
		System.out.println("Enter the yearly % tuition increase");
		this.tuitionIncrease = input.nextDouble();
		System.out.println("Enter the repayment APR %");
		this.repaymentAPR = input.nextDouble();
		System.out.println("Enter the number of repayment years");
		this.repaymentYears = input.nextInt();
		
	}
	
	public double getCost(){
		/*Uses the initial inputs to determine the total cost of 
		 * tuition
		 */
		double cost = 0;
		double tuition = initialTuition;
		for(int i=0; i<4; i++){
			cost += tuition;
			tuition = tuition*(1 + tuitionIncrease/100);				
		}
		return cost;
	}
	public double monthlyPayment(){
		/*This uses the final cost of the college to determine the monthly
		 * payments.
		 */
		double p = this.getCost();
		double r = repaymentAPR/1200;
		double n = repaymentYears*12;
		return (p*Math.pow(1+r, n)*r)/(Math.pow(1+r, n)-1);
		
	}
	public static void main(String[] args){
		tuition tuition = new tuition();
		System.out.println("Your tuition cost is " + tuition.getCost());
		System.out.println("Your monthly payments are " + tuition.monthlyPayment());
	}
	

}
