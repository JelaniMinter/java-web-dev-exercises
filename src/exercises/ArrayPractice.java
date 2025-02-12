package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] firstArray = {1, 1, 2, 3, 5, 8};

        for (int i=0; i<firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        for (int i=0; i<firstArray.length; i++) {
            if (!(firstArray[i] % 2 == 0)) {
                System.out.println(firstArray[i]);
            };
        }

        String rhyme = "I would not, could not, in a box." +
                "I would not, could not with a fox." +
                "I will not eat them in a house." +
                "I will not eat them with a mouse.";
        String[] rhymeArray = rhyme.split(" ");
        System.out.println(Arrays.toString(rhymeArray));

        String[] sentenceArray = rhyme.split("\\. ");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
