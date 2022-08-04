package edu.odu.cs.cs350;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestExcel {
	@Test
	public void testExcelFileName()
	{
		String testpat = ExcelWriter.produceFileName();
		assertTrue(testpat.matches("\\d{8}-\\d{6}-summary.xlsx"));
	}
    
}
