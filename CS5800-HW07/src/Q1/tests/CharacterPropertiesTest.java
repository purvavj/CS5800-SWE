package Q1.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Q1.CharacterProperties;

public class CharacterPropertiesTest {

    @Test
    public void testCharacterProperties() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        assertEquals("Arial", properties.getFont());
        assertEquals("Red", properties.getColor());
        assertEquals(12, properties.getSize());
    }
}
