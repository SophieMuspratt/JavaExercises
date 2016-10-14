package exercises;

import java.math.BigDecimal;
//Add Static ZERO import
import static java.math.BigDecimal.ZERO;
import java.util.List;

public class AddItUp {

	// listTest is not a good name
	public BigDecimal add(List<Object> numbers) {
		// Use BigDecimal.ZERO - static import!
		BigDecimal total = ZERO;

		// If not needed, if used, be sure to handle positive first
		// Use enhanced for loop
		for (Object number : numbers) {
			number = convertAndReturnBigDecimal(number);
			total = total.add((BigDecimal) number);
		}
		// ROUND_HALF_EVEN can be moved outside if and for loops
		return total.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

	private Object convertAndReturnBigDecimal(Object number) {
		// No initialising number
		BigDecimal convertedNumber = ZERO;
		// Can extract if statements to a private method
		if (number instanceof BigDecimal) {
			convertedNumber = (BigDecimal) number;
		} else if (number instanceof String) {
			// Can extract string handling to a private method
			// Using try/catch too early!
			convertedNumber = (BigDecimal) stringHandling(number);
		} else if (number instanceof Double) {
			convertedNumber = new BigDecimal((Double) number);
		} else if (number instanceof Integer) {
			convertedNumber = new BigDecimal((Integer) number);
		}
		return convertedNumber;
	}

	private Object stringHandling(Object number) {
		try {
			number = new BigDecimal((String) number);
		} catch (NumberFormatException e) {
			number = ZERO;
		}
		return number;
	}
}
