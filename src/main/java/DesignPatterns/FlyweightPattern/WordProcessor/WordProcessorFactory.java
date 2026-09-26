package DesignPatterns.FlyweightPattern.WordProcessor;

import java.util.HashMap;
import java.util.Map;

public class WordProcessorFactory {
    static Map<Character, WordProcessorCharacter> characters = new HashMap<>();

    public static WordProcessorCharacter getCharacterObject(Character c) {
        if(characters.containsKey(c)) {
            return characters.get(c);
        }
        else {
            WordProcessorCharacter wordProcessorCharacter = new WordProcessorCharacter(c.charValue(), "Arial", 1);
            characters.put(c, wordProcessorCharacter);
            return characters.get(c);
        }
    }
}
