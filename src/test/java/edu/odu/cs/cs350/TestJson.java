package edu.odu.cs.cs350;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;


public class TestJson {
	@Test
	public void testJsonFileName()
	{
		Pattern namepat = Pattern.compile("\\d{8}-\\d{6}-summary.json");
		string testpat = JsonWriter.produceFileName();
		assertThat(namepat.matches(testpat).matches());
	}
}

