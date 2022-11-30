import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> wordCollection;

    public WordsChecker(String text) {
        this.text = text;
    }

    public void setCollection(Set<String> wordCollection) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        wordCollection.addAll(List.of(words));
        this.wordCollection = wordCollection;
    }

    public boolean hasWord(String word) {
        return wordCollection.contains(word);
    }
}
