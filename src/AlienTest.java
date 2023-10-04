

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlienTest {
    @Test
    public void testAlienCreation() {
        Alien alien = new Alien("Test Alien", 150, 15, true);
        assertEquals("Test Alien", alien.getName());
        assertEquals(150, alien.getHealth());
        assertEquals(15, alien.getAttack());
        assertEquals(true, alien.isCanRegenerate());
    }
}
