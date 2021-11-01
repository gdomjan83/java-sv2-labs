package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        String trimmed = word.trim();
        StringBuilder sb = new StringBuilder(trimmed);
        String reversed = new String(sb.reverse());
        return trimmed.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        PalindromeValidator validator = new PalindromeValidator();

        System.out.println(validator.isPalindrome("automata"));
        System.out.println(validator.isPalindrome(" görög  "));
        System.out.println(validator.isPalindrome("ede"));
    }
}
