package Q1.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Q1.FlyweightFactory;
import Q1.CharacterProperties;

public class FlyweightFactoryTest {

    @Test
    public void testGetCharacterProperties() {
        CharacterProperties properties1 = FlyweightFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties properties2 = FlyweightFactory.getCharacterProperties("Arial", "Red", 12);
        assertEquals(properties1, properties2);
    }
}
