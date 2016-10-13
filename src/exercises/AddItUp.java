package exercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class AddItUp {
	
	public static BigDecimal add(List<Object> listTest) {
		BigDecimal number = new BigDecimal(0);
		BigDecimal total = new BigDecimal(0);
		
		if (!listTest.isEmpty()){
			for(int i = 0; i < listTest.size(); i++){
				
				if(listTest.get(i) instanceof BigDecimal){
					number = (BigDecimal) listTest.get(i);
					number = number.setScale(2, BigDecimal.ROUND_HALF_EVEN);
				}
				else if (listTest.get(i) instanceof String){
					
					number = new BigDecimal((String) listTest.get(i));
				}
				else if (listTest.get(i) instanceof Double){
					number = new BigDecimal((Double) listTest.get(i));
					number = number.setScale(2, BigDecimal.ROUND_HALF_EVEN);
				}
				else if (listTest.get(i) instanceof Integer){
					number = new BigDecimal((Integer) listTest.get(i));
				}
				
				total = total.add(number);
				
			}
		}
		else if (listTest.isEmpty()){
			total = new BigDecimal(0);
		}
		
		return total;
	}
}
