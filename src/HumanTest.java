

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {
    @Test
    public void testHumanCreation() {
        Human human = new Human("Test Human", 100, 10, 20);
        assertEquals("Test Human", human.getName());
        assertEquals(100, human.getHealth());
        assertEquals(10, human.getAttack());
        assertEquals(20, human.getArmor());
    }
}

