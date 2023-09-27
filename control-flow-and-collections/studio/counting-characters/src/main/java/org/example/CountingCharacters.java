package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
//        Scanner input = new Scanner(System.in);
        String textBlock = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        System.out.println("Enter a block of text so we can count the letters:");

//        textBlock = input.nextLine();



        char[] textBlockCharArray = textBlock.toCharArray();

//        System.out.println(textBlockCharArray.toString());

        for (char letter : textBlockCharArray) {
            if (characters.containsKey(letter)) {
                characters.put(letter, characters.get(letter) + 1);
            } else {
                characters.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

        System.out.println(characters.size());
    }
}
