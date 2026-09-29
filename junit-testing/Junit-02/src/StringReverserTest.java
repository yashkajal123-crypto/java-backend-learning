import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {


    // note that if instance i.e object on java class created inside this test class then it ,
    // must create over the  all test methods

    @Test
    void testNormalString() {
        assertEquals("olleh", StringReverser.reverse("hello"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", StringReverser.reverse("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringReverser.reverse(""));
    }

    @Test
    void testNumberString() {
        assertEquals("321", StringReverser.reverse("123"));
    }

    @Test
    void testMultipleString() {
        assertEquals("nam doog a si hsay" , StringReverser.reverse("yash is a good man"));
    }
}