import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test

    public void test () {

        Human p = new Human("alise", "S", "S", 55);
        assertEquals("alise", p.getName());

        }
    }

