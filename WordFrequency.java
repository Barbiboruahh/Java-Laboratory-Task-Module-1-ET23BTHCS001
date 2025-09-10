import java.util.HashMap;

public class WordFrequency {
    public static void countWordFrequency(String sentence) {
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] words = sentence.split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    public static void main(String[] args) {
        String sentence = "The cat and the dog.";
        countWordFrequency(sentence);
    }
}
