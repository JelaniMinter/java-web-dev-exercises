package studio;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class CountingCharacters {
    public static void main(String[] args) {
//        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
//                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                "Once you’ve done that, it’s pretty straightforward from there.";

        File text = new File("C:\\Users\\Crimson Gamer\\Documents\\Programming\\Java\\java-practice\\chapter-1\\java-web-dev-exercises\\src\\studio\\testfile.txt");
        Scanner input;
//        String paragraph;

        try {
            input = new Scanner(text);
//            int lineNumber = 1;
            String newString = "";
            while (input.hasNextLine()) {
                newString = newString + input.nextLine();
            }
            input.close();
            printOutput(newString);
        } catch (FileNotFoundException errorfile) {
            System.out.println("File not found");
        }
    }

    public static void printOutput(String paragraph) {
        HashMap<Character, Integer> characters = new HashMap<>();

        char[] charactersInString = paragraph.toLowerCase().toCharArray();

        for (char letter : charactersInString) {
            if (Character.isLetter(letter)) {
                if (!characters.containsKey(letter)) {
                    characters.put(letter, 1);
                } else {
                    characters.put(letter, (characters.get(letter) + 1));
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(entry);
        }
    }
}
