/**
 * OOPSBannerApp UC8 – Final Version
 *
 * Uses HashMap to store character patterns
 * and a separate render function to display the banner.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // Static Map to store Character -> Pattern
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {
        patternMap.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        });

        patternMap.put('S', new String[]{
                " ******  ",
                "**    ** ",
                "**       ",
                " ******  ",
                "      ** ",
                "**    ** ",
                " ******  "
        });
    }

    // Render function (separation of concerns)
    public static void renderBanner(String word) {

        int rows = 7; // fixed banner height

        for (int i = 0; i < rows; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("  ");
                } else {
                    lineBuilder.append("         ").append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        String word = "OOPS";

        renderBanner(word);
    }
}