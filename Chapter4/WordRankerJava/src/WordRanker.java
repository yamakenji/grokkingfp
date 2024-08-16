import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WordRanker {
    public static void main(String[] args) throws Exception {
        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "python", "rust");
        List<String> ranking = rankedWords(scoreComparator, words);
        List<String> bonusRanking = rankedWords(scoreWithBonusComparator, words);
        System.out.println(ranking);
        System.out.println(bonusRanking);
        System.out.println(words);
    }

    private static int score(String word) {
        return word.replace("a", "").length();
    }

    static int scoreWithBonus(String word) {
        int base = score(word);
        if (word.contains("c")) return base + 5;
        else return base;
    }

    static Comparator<String> scoreComparator = new Comparator<String>() {
        public int compare(String w1, String w2) {
            return Integer.compare(score(w2), score(w1));
        }
    };

    static Comparator<String> scoreWithBonusComparator = new Comparator<String>() {
        @Override
        public int compare(String w1, String w2) {
            return Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
        }
    };

    // Chapter4.2
//    static List<String> rankedWords(List<String> words) {
//        words.sort(scoreComparator); //ここで既存のリストを変更している！
//        return words;
//    }

    // Chapter4.3
//    static List<String> rankedWords(List<String> words) {
//        return words.stream()
//                .sorted(scoreComparator) // 外部の値を使っている！この関数のスコープ外で定義されている！
//                .collect(Collectors.toList()); //新しいListを返す
//    }

    // Chapter4.4
    static List<String> rankedWords(Comparator<String> comparator, List<String> words) {
        return words.stream()
                    .sorted(comparator)
                    .collect(Collectors.toList());
    }
}
