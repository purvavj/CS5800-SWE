package Q1;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
        Document document = new Document();
        document.addCharacter('H', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('e', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('l', FlyweightFactory.getCharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('l', FlyweightFactory.getCharacterProperties("Verdana", "Black", 16));
        document.addCharacter('o', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('W', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('o', FlyweightFactory.getCharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('r', FlyweightFactory.getCharacterProperties("Verdana", "Black", 16));
        document.addCharacter('l', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('d', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('C', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('S', FlyweightFactory.getCharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('5', FlyweightFactory.getCharacterProperties("Verdana", "Black", 16));
        document.addCharacter('8', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('0', FlyweightFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('0', FlyweightFactory.getCharacterProperties("Calibri", "Blue", 14));

        try {
            document.save("example_document.txt");
            System.out.println("Document saved successfully.");

            // Load the saved document
            Document loadedDocument = Document.load("example_document.txt");

            // Print loaded characters with their properties
            System.out.println("Loaded characters with their properties:");
            for (Character character : loadedDocument.getCharacters()) {
                System.out.println("Character: " + character.getCharacter() +
                        ", Font: " + character.getProperties().getFont() +
                        ", Color: " + character.getProperties().getColor() +
                        ", Size: " + character.getProperties().getSize());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
