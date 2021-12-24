package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String Alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her" +
                "sister was reading, but it had no pictures or conversations in it, 'and what" +
                "is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word:");
        String name = input.nextLine();
        System.out.println(Alice.toLowerCase().contains(name.toLowerCase().trim()));
        System.out.println("The index of '" + name + "' is at: " + Alice.toLowerCase().indexOf(name.toLowerCase().trim()));
        System.out.println("The length of '" + name + "'" + " is " + name.length());
        String newAlice = Alice.toLowerCase().replace(name.toLowerCase(), "");
        System.out.println(newAlice);
    }
}
