
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testPalindrome() {
        assertTrue(new Palindrome().isPalindrome("madamm"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(new Palindrome().isPalindrome("hello"));
    }
}
