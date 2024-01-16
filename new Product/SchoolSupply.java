

public class SchoolSupply extends Product {

	
	double total() {
		double result = 0;
		for(int i = 0; i< size(); i++) {
			
			result += getPrice(i);
		}
		return result;
		
		
	}

}
