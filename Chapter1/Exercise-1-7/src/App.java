public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String word1 = "inperative";
        String word2 = "no";
        String word3 = "declarative";
        String word4 = "yes";

        int score1 = calculateScore(word1);
        int score2 = calculateScore(word2);
        int score3 = wordScore(word3);
        int score4 = wordScore(word4);

        System.out.println(word1 + " is " + score1);
        System.out.println(word2 + " is " + score2);
        System.out.println(word3 + " is " + score3);
        System.out.println(word4 + " is " + score4);
    }

    public static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (c != 'a')
                score ++;
        }
        return score;
    }

    public static int wordScore(String word) {
        return word.replace("a", "").length();
    }
}
