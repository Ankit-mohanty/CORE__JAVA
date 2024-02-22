package Assignment;

public class StringConverter {
    public static void main(String[] args) {
        String input = "tiknA ytnahoM";
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            output.append(reversedWord).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}