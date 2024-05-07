import java.util.Scanner;

public class WordComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second word:");
        String word2 = scanner.nextLine();

        if (areWordsSimilar(word1, word2)) {
            System.out.println("Warning: The words are similar!");
        } else {
            System.out.println("The words are not similar.");
        }

        scanner.close();
    }

    private static boolean areWordsSimilar(String word1, String word2) {
        // Convert both words to lowercase for case-insensitive comparison
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Compare the words
        return word1.equals(word2);
    }
}
