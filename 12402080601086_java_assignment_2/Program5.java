import java.io.*;
import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        try {
            // Open file (make sure file.txt exists in same folder)
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and split words
                String words[] = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (word.isEmpty()) continue;
                    // Count occurrences
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            br.close();
            // Display result
            System.out.println("Word Occurrences:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
