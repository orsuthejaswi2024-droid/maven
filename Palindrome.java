
public class Palindrome {
    public boolean isPalindrome(String str) {
        if (str == null) return false;

        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed =
            new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println("madam: " + p.isPalindrome("madam"));
        System.out.println("hello: " + p.isPalindrome("hello"));
    }
}

