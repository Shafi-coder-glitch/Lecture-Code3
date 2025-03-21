package Topic_4_Lists;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        // Create an ArrayList to store Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("shafi");
        arrayList.add("MCTC");

        // Loop through each element in the ArrayList
        for (String s : arrayList) {
            System.out.println(s);           // Print the original string
            System.out.println(s.toUpperCase()); // Print the string in uppercase
            System.out.println(s.length());  // Print the length of the string
        }

        // Print the entire ArrayList
        System.out.println(arrayList);
    }
}
