package Abstact;

public class Solution {

    public String shortestPalindrome(String s) {
        if (s == null || s.isEmpty()) return s;

        String reversed = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reversed;

        int[] prefixArray = new int[combined.length()];

        for (int i = 1; i < combined.length(); i++) {
            int j = prefixArray[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = prefixArray[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            prefixArray[i] = j;
        }

        int palindromeLength = prefixArray[combined.length() - 1];
        String suffix = s.substring(palindromeLength);
        String prefix = new StringBuilder(suffix).reverse().toString();

        return prefix + s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String example1 = "aacecaaa";
        System.out.println("Example 1: " + solution.shortestPalindrome(example1));

        String example2 = "abcd";
        System.out.println("Example 2: " + solution.shortestPalindrome(example2));
    }
}
