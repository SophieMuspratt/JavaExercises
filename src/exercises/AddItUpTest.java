package exercises;

import static org.junit.Assert.*;
//Use assertThat

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AddItUpTest {
	
	//Remove static use in test and instantiate AddItUp class
	
	
	//Tests should be in a TDD order
	@Test
	public void whenEmptyListIsUsedThenReturn0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		BigDecimal expected = new BigDecimal (0);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	@Test
	public void nullArgumentsShouldReturn0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(null);
		
		BigDecimal expected = new BigDecimal (0);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	//
	@Test
	public void handleMultipleArgumentsWithNullReturning0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(null);
		listTest.add(Integer.valueOf(22));
		listTest.add(Double.valueOf(18.95));
		listTest.add(new BigDecimal(1.95));
		
		BigDecimal expected = new BigDecimal (42.90);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	@Test
	public void textArgumentsShouldReturn0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add("Test");
		
		BigDecimal expected = new BigDecimal (0);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	@Test
	public void handleMultipleArgumentsWithTextReturning0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add("Test");
		listTest.add(Integer.valueOf(22));
		listTest.add(Double.valueOf(18.95));
		listTest.add(new BigDecimal(1.95));
		
		BigDecimal expected = new BigDecimal (42.90);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
	}

	@Test
	public void unexpectedObjectsShouldReturn0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(Boolean.valueOf(true));
		
		BigDecimal expected = new BigDecimal (0);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	@Test
	public void handleMultipleArgumentsWithUnexpectedOnbjectReturning0() {	
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(Boolean.valueOf(true));
		listTest.add(Integer.valueOf(22));
		listTest.add(Double.valueOf(18.95));
		listTest.add(new BigDecimal(1.95));
		
		BigDecimal expected = new BigDecimal (42.90);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
	}

	//Wrong test name
	@Test
	public void whenOneIntegerIsInListReturnThatSameInteger() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(10);
		
		BigDecimal expected = new BigDecimal (10);
	
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	@Test
	public void addMultipleIntegersFromList() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(10);
		listTest.add(7);
		listTest.add(29);
		
		BigDecimal expected = new BigDecimal (46);
	
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	//Wrong test name
	@Test
	public void whenOneDoubleIsInListReturnThatSameDouble() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(10.99);
		
		BigDecimal expected = new BigDecimal (10.99);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	@Test
	public void addMultipleDoublesFromList() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(Double.valueOf(10));
		listTest.add(Double.valueOf(7.13));
		listTest.add(Double.valueOf(29));
		
		BigDecimal expected = new BigDecimal (46.13);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	//Wrong test name
	@Test
	public void whenOneBigDecimalIsInListReturnThatSameBigDecimal() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(new BigDecimal(10.99));
		
		BigDecimal expected = new BigDecimal (10.99);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	@Test
	public void addMultipleBigDecimalFromList() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(BigDecimal.valueOf(10));
		listTest.add(BigDecimal.valueOf(7));
		listTest.add(BigDecimal.valueOf(29.01));
		
		BigDecimal expected = new BigDecimal (46.01);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	//Wrong test name
	@Test
	public void whenOneStringIsInListReturnThatSameString() {
		List<Object> listTest = new ArrayList<Object>();	
		
		listTest.add("19");
		
		BigDecimal expected = new BigDecimal (19);
	
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	@Test
	public void addMultipleStringFromList() {
		List<Object> listTest = new ArrayList<Object>();	
	
		listTest.add(String.valueOf(10));
		listTest.add(String.valueOf(7));
		listTest.add(String.valueOf(29.99));
		
		BigDecimal expected = new BigDecimal (46.99);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	
		assertEquals(expected, AddItUp.add(listTest));
		
	}
	
	@Test
	public void addIntegerAndDoubleTogether() {
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(22);
		listTest.add(18.99);
		
		BigDecimal expected = new BigDecimal (40.99);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	@Test
	public void addIntegerDoubleAndBigDecimalTogether() {
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(Integer.valueOf(22));
		listTest.add(Double.valueOf(18.95));
		listTest.add(new BigDecimal(1.95));
		
		BigDecimal expected = new BigDecimal (42.90);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
	
	@Test
	public void addIntegerDoubleBigDecimalAndStringTogether() {
		List<Object> listTest = new ArrayList<Object>();
		
		listTest.add(Integer.valueOf(22));
		listTest.add(Double.valueOf(18.95));
		listTest.add(new BigDecimal(1.95));
		listTest.add(String.valueOf(1));
		
		BigDecimal expected = new BigDecimal (43.90);
		expected = expected.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		assertEquals(expected, AddItUp.add(listTest));
	}
}
