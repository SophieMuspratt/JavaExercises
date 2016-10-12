package exercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class AddItUp {
	
	public static BigDecimal add(List<Object> listTest) {
		BigDecimal number = new BigDecimal(0);
		BigDecimal total = new BigDecimal(0);
		DecimalFormat df = new DecimalFormat("0.##");
		
		if (!listTest.isEmpty()){
			for(int i = 0; i < listTest.size(); i++){
				
				Object inputNumber = df.format(listTest.get(i));
				
				if(inputNumber instanceof BigDecimal){
					number = (BigDecimal) inputNumber;
					number = number.setScale(2, BigDecimal.ROUND_HALF_EVEN);
				}
				else if (inputNumber instanceof String){
					number = new BigDecimal((String) inputNumber);
				}
				else if (inputNumber instanceof Double){
					number = new BigDecimal((Double) inputNumber);
					number = number.setScale(2, BigDecimal.ROUND_HALF_EVEN);
				}
				else if (inputNumber instanceof Integer){
					number = new BigDecimal((Integer) inputNumber);
				}
				
				total = total.add(number);
				
			}
		}
		else if (listTest.isEmpty()){
			total = new BigDecimal(0);
		}
		
		return total;
		
	}
//		Integer addingIntegerNumbers = 0;
//		Double addingDoubleNumbers = 0.00;
//		String addingStringNumbers = "";
//		BigDecimal addingBigDecimalNumbers = new BigDecimal(0);
//		if (!listTest.isEmpty()){
//			for(int i = 0; i < listTest.size(); i++){
//				if (listTest.get(i) instanceof Integer){
//					addingIntegerNumbers += (Integer) listTest.get(i);
//				}
//				else if (listTest.get(i) instanceof Double){
//					addingDoubleNumbers += (Double) listTest.get(i);
//				}
//				else if (listTest.get(i) instanceof BigDecimal){
//					addingBigDecimalNumbers = addingBigDecimalNumbers.add((BigDecimal) listTest.get(i));
//				}
//				else if (listTest.get(i) instanceof String){
//					addingStringNumbers += (String) listTest.get(i);
//				}
//
//			}
//		}
////		else{
////			return addingNumbers;
//	//	}
//		BigDecimal total = new BigDecimal(addingIntegerNumbers + addingDoubleNumbers + addingStringNumbers);
//		total.add(addingBigDecimalNumbers);
//		total = total.setScale(2, BigDecimal.ROUND_HALF_EVEN);
//		return total;
//		
//	}


}
