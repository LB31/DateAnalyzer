import static org.junit.Assert.*;

import org.junit.Test;

public class TestHarness implements JulianDate {

	@Test
	public void testConvertToJulianDate() {
		int firstCase = convertToJulianDate(1, 1, 1993);
		int secondCase = convertToJulianDate(1, 1, 1493);
		assertEquals(2448989, firstCase);
		assertEquals(2266377, secondCase);
	}

	@Test
	public void testcurrentJulianDate() {
		int firstCase = currentJulianDate();
		assertEquals(2457525, firstCase);
	}

	@Test
	public void testdaysBetween() {
		int firstCase = daysBetween(10, 5, 2016);
		assertEquals(6, firstCase);
	}

}
