package edu.odu.cs.cs350;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestImage {

	@Test
	public void testImageSource()
	{
		List<String> imageTags = new ArrayList<>();
		List<String> internalImages = new ArrayList<>();
		List<String> externalImages = new ArrayList<>();



		for(String e: imageTags)
		{
			if(e == "internal")
			{
				internalImages.add(e);
			}

			else
				externalImages.add(e);
		}
	}
}
