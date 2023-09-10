import org.junit.Test;
import static org.junit.Assert.*;

public class RegexpTest {

    @Test
    public void testAcceptedText() {
        boolean test = Regexp.matchText("Text1%", "10");
        assertTrue(test);
    }

    @Test
    public void testSimpleText() {
        boolean test = Regexp.matchText("text", "10");
        assertFalse(test);
    }

    @Test
    public void testLength() {
        boolean test = Regexp.matchText("Text1!", "5");
        assertFalse(test);
    }

    @Test
    public void testMatchWhite() {
        boolean test = Regexp.matchText("Test1 Test1!", "15");
        assertFalse(test);
    }

    @Test
    public void testNoUpperCase() {
        boolean test = Regexp.matchText("text1!", "10");
        assertFalse(test);
    }

    @Test
    public void testNoLowerCase() {
        boolean test = Regexp.matchText("TEXT1!", "10");
        assertFalse(test);
    }

    @Test
    public void testNoDigit() {
        boolean test = Regexp.matchText("TEXT!", "10");
        assertFalse(test);
    }


    @Test
    public void testNoSpecial() {
        boolean test = Regexp.matchText("TEXT12text", "10");
        assertFalse(test);
    }

    @Test
    public void testDoubleUpper() {
        boolean test = Regexp.matchText("TexT!2text", "10");
        assertTrue(test);
    }

    @Test
    public void testDoubleLower() {
        boolean test = Regexp.matchText("TEXT!2TexT", "10");
        assertTrue(test);
    }

    @Test
    public void testDoubleDigit() {
        boolean test = Regexp.matchText("TexT!123", "10");
        assertTrue(test);
    }


    @Test
    public void testDoubleSpecial() {
        boolean test = Regexp.matchText("TexT!$[1", "10");
        assertTrue(test);
    }
}
