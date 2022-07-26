package edu.odu.cs.cs350;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OptionsTest {

    @Test void testLoadExtensionsFromFile() {
        Options options = new Options("settings.ini");

        List<String> extensions = options.getValidExts();

        assertEquals(extensions.get(0), "html");
        assertEquals(extensions.get(1), "htm");
    }
}
