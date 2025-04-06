import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EventTests {

    @Test
    void hashSentenceTest() {
        SecondButtonListener b = new SecondButtonListener(null, null);

        HashMap<String, Integer> r = b.hashSentence("EECS is cool and Sonya is also cool");

        for (String k : r.keySet()) {
            if (k.equals("is") || k.equals("cool"))
                assertEquals(2,r.get(k));
            else assertEquals(1,r.get(k));
        }

    }

    @Test
    void cleanSentenceTest() {
        SecondButtonListener b = new SecondButtonListener(null, null);

        String result = b.cleanSentence("EECS is cool and Sonya is also cool");

        assertEquals("EECS, is, cool, and, Sonya, also", result);

    }

    @Test
    void formatStringTest() {

        SecondButtonListener b = new SecondButtonListener(null, null);
        ArrayList<String> s = new ArrayList<>();
        s.add("Sonya");
        s.add("Bob");
        s.add("Reza");

        String result = b.formatList(s);
        assertEquals("1. Sonya\n2. Bob\n3. Reza", result);

    }

}
