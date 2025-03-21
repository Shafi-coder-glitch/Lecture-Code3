package Topic_5_HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // Create a HashMap to store state abbreviations
        HashMap<String, String> stateAbbreviations = new HashMap<>();

        // Add states and their abbreviations
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        // Print the entire HashMap
        System.out.println("State Abbreviations: " + stateAbbreviations);

        // Print individual state abbreviations
        System.out.println("Minnesota -> " + stateAbbreviations.get("Minnesota"));
        System.out.println("Iowa -> " + stateAbbreviations.get("Iowa"));
        System.out.println("Wisconsin -> " + stateAbbreviations.get("Wisconsin"));
    }
}
