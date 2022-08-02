package edu.odu.cs.cs350;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestJson {
	@Test
	public void testJsonFileName()
	{
		String testpat = JsonWriter.produceFileName();
		assertThat(testpat.matches("\\d{8}-\\d{6}-summary.json"));
	}
}