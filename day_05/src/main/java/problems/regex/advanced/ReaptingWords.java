package problems.regex.advanced;
import java.util.*;
public class ReaptingWords {
    public static String findRepeatingWords(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Set<String> seen = new HashSet<>(), repeats = new HashSet<>();
        for (String word : words)
            if (!seen.add(word))
                repeats.add(word);
        return String.join(", ", repeats);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("Enter text");
            String text = sc.nextLine().trim();
            System.out.println(findRepeatingWords(text));
            System.out.println("Enter y/n : y for exit n for further check :");
            char choice = sc.next().charAt(0);
            if (choice == 'y') {
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
