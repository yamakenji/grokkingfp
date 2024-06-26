import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordRanker {
    public static void main(String[] args) throws Exception {
        List<String> words = Arrays.asList("ada", "Haskell", "scala", "java", "python", "rust");
        List<String> ranking = rankedWords(words);
        System.out.println(ranking);
    }

    private static int score(String word) {
        return word.replace("a", "").length();
    }

    static Comparator<String> scoreComparator = new Comparator<String>() {
        public int compare(String w1, String w2) {
            return Integer.compare(score(w2), score(w1));
        }
    };

    static List<String> rankedWords(List<String> words) {
        words.sort(scoreComparator); //ここで既存のリストを変更している！
        return words;
    }
}
