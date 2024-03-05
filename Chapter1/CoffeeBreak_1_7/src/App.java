public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println(calculateScore("imperative"));
        System.out.println(calculateScore("no"));
        System.out.println(wordScore("declarative"));
        System.out.println(wordScore("yes"));
    }

    public static int calculateScore(String word) {
        int score = 0;
        for (char c: word.toCharArray()) {
            if (c != 'a') {
                score++;
            }    
        }
        return score;
    }

    public static int wordScore(String word) {
        return word.replace("a","").length();
    }
}
