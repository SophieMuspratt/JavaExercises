package exercises;

import java.math.BigDecimal;
//Remove unused imports
import java.text.DecimalFormat;
import java.util.List;

public class AddItUp {

	//listTest is not a good name
	public static BigDecimal add(List<Object> listTest) {
		//No initialising number
		BigDecimal number = new BigDecimal(0);
		//Use BigDecimal.ZERO - static import!
		BigDecimal total = new BigDecimal(0);

		//If not needed, if used, be sure to handle positive first
		if (!listTest.isEmpty()) {

			//Use enhanced for loop
			for (int i = 0; i < listTest.size(); i++) {
				//Using try/catch too early!
				try {
					//Can extract if statements to a private method
					if (listTest.get(i) instanceof BigDecimal) {
						number = (BigDecimal) listTest.get(i);
						// ROUND_HALF_EVEN can be moved outside if and for loops
						number = number.setScale(2, BigDecimal.ROUND_HALF_EVEN);
					} else if (listTest.get(i) instanceof String) {
						//Can extract string handling to a private method
						number = new BigDecimal((String) listTest.get(i));
					} else if (listTest.get(i) instanceof Double) {
						number = new BigDecimal((Double) listTest.get(i));
						// Again ROUND_HALF_EVEN can be moved
						number = number.setScale(2, BigDecimal.ROUND_HALF_EVEN);
					} else if (listTest.get(i) instanceof Integer) {
						number = new BigDecimal((Integer) listTest.get(i));
					} else {
						number = new BigDecimal(0);
					}
				} catch (NumberFormatException e) {
					number = new BigDecimal(0);
				}

				total = total.add(number);

			}
		}
		return total;
	}
}
