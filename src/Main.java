import java.util.*;

public class Main {
    static String text;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore" +
                " magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea" +
                " commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla" +
                " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Set<String> wordCollection = new HashSet<>();
        WordsChecker wordsChecker = new WordsChecker(text);
        wordsChecker.setCollection(wordCollection);
        while (true) {
            System.out.println("Введите слово для проверки или end для выхода:");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            boolean answer = wordsChecker.hasWord(word);
            if (answer) {
                System.out.println(answer + "-Есть такое слово в тексте");
            } else {
                System.out.println(answer + "-Нет такого слово в тексте");
            }
        }
    }
}