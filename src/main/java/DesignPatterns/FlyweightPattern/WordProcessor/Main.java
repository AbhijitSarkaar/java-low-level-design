package DesignPatterns.FlyweightPattern.WordProcessor;

public class Main {
    public static void main(String[] args) {
//        Character object1 = new Character('t', "Arial", 1, 0, 0);
//        Character object2 = new Character('t', "Arial", 1, 0, 1);
//        System.out.println(object1 == object2);

        ICharacter object1 = WordProcessorFactory.getCharacterObject('t');
        ICharacter object2 = WordProcessorFactory.getCharacterObject('t');

        System.out.println(object1 == object2);



    }
}
