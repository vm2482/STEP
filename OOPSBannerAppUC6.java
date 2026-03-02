/**
 * OOPSBannerApp UC7 – OOPS Banner Application (Use Case 7)
 *
 * This use case replaces helper methods with a CharacterPattern
 * class to encapsulate character data and ASCII patterns.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC6 {

    // Static Inner Class to encapsulate Character and its Pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        // Create Map to store Character -> Pattern mapping
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Store patterns inside the map

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ******  ",
                "**    ** ",
                "**       ",
                " ******  ",
                "      ** ",
                "**    ** ",
                " ******  "
        }));

        // Word to display
        String word = "OOPS";

        // Get number of rows (7 lines)
        int rows = patternMap.get('O').getPattern().length;

        // Loop through each row
        for (int i = 0; i < rows; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Loop through each character in the word
            for (char ch : word.toCharArray()) {
                lineBuilder.append(patternMap.get(ch).getPattern()[i])
                           .append("  ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}