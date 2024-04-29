package Q1;
import java.io.Serializable;


public class Character implements Serializable {
    private char character;
    private CharacterProperties properties;

    public Character(char character, CharacterProperties properties) {
        this.character = character;
        this.properties = properties;
    }

    public char getCharacter() {
        return character;
    }

    public CharacterProperties getProperties() {
        return properties;
    }
}
