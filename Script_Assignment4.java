import java.util.ArrayList;

public class Script_Assignment4 {


/**
 *Author : Yatharth Alpeshkumar Soni
 *Sheridan ID : 991503772
 *Submission Date : 2018/07/25 
 *Instructor : Haya Ghalayini
 *Project : Assignment4
 *Icecream Selection Application
 * 
 */
	
	double cost = 0;
	double total = 0;
	ArrayList<String> arr = new ArrayList<String>();
	
		public double getIcecreamCost(String sizeRadio, String syrupRadio, String fruitRadio, String cakeRadio) {
		if("Large".equals(sizeRadio) && "Single".equals(cakeRadio) && "None".equals(syrupRadio) && "None".equals(fruitRadio)){
			cost = 8.00;
			return cost;
		}
		if("Medium".equals(sizeRadio) && "Double".equals(cakeRadio) && "Double".equals(syrupRadio) && "Double".equals(fruitRadio)){
			cost = 8.00;
			return cost;
		}
		if("Large".equals(sizeRadio)) {
			cost += 7.00;
		}
		if("Medium".equals(sizeRadio)) {
			cost += 5.00;
		}
		if("Small".equals(sizeRadio)) {
			cost += 3.00;
		}
		if("Double".equals(syrupRadio)) {
			cost += 3.00;
		}
		if("Single".equals(syrupRadio)) {
			cost += 1.50;
		}
		if("None".equals(syrupRadio)) {
			cost += 0.00;
		}
		if("Triple".equals(cakeRadio)) {
			cost += 4.50;
			
		}
		if("Double".equals(cakeRadio)) {
			cost += 3.00;
		}
		if("Single".equals(cakeRadio)) {
			cost += 1.50;
		}
		if("Double".equals(fruitRadio)) {
			cost += 3.00;
		}
		if("Single".equals(fruitRadio)) {
			cost += 1.50;
		}
		if("None".equals(fruitRadio)) {
			cost += 0.00;
		}return cost;
	}
}
