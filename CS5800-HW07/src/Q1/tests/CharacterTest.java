package Q1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Q1.Character;
import Q1.CharacterProperties;

public class CharacterTest {

    @Test
    public void testCharacter() {
        // Create a CharacterProperties instance
        CharacterProperties properties = new CharacterProperties("Arial", "Black", 12);

        // Create an instance of Character
        Character character = new Character('A', properties);

        // Test getters
        assertEquals('A', character.getCharacter());
        assertEquals(properties, character.getProperties());
    }
}
