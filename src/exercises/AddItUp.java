package exercises;

import java.math.BigDecimal;
//Add Static ZERO import
import static java.math.BigDecimal.ZERO;
import java.util.List;

public class AddItUp {

	public BigDecimal add(List<Object> numbers) {
		BigDecimal total = ZERO;

		for (Object number : numbers) {
			number = convertAndReturnBigDecimal(number);
			total = total.add((BigDecimal) number);
		}
		return total.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

	private Object convertAndReturnBigDecimal(Object number) {
		BigDecimal convertedNumber = ZERO;
		if (number instanceof BigDecimal)
			convertedNumber = (BigDecimal) number;
		else if (number instanceof String)
			convertedNumber = (BigDecimal) stringHandling(number);
		else if (number instanceof Double)
			convertedNumber = new BigDecimal((Double) number);
		else if (number instanceof Integer)
			convertedNumber = new BigDecimal((Integer) number);
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
